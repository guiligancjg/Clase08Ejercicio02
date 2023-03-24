package Clase08Ejercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerArchivo{
    protected int AutoIncremento;
    protected ArrayList<ItemCarrito> productos;
    protected String archivo;
    protected String[] listaProductos;

    public LeerArchivo(String archivo){
        this.productos = new ArrayList<>();
        this.archivo = archivo;
    }

    public ArrayList<ItemCarrito> leerProductos(){
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();

            while(lectura != null){
                listaProductos = lectura.split(";");
                productos.add(new ItemCarrito(
                                    ++AutoIncremento,
                                    listaProductos[0],
                                    Double.parseDouble(listaProductos[1]),
                                    Integer.parseInt(listaProductos[2])));
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo leer el Archivo...");
        } catch (IOException e) {
            System.out.println("No se pudo leer el Archivo...");
        }

        return productos;
    }
}
