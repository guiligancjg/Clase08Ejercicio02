package Clase08Ejercicio02;

import Excepciones.CarritoPrecioCeroException;
import Excepciones.MontoNegativoException;

import java.util.ArrayList;


public class Main {
    /* 2. Agregue excepciones a los descuentos:
        a. que no se pueda aplicar un descuento a un carrito de precio 0
        b. que el resultado del descuento no de un monto negativo
        c. Si ocurre alguna de esas 2 situaciones, mostrar por pantalla el error, en lugar
        del resultado del carrito
  */

    public static void main(String[] args) {

        String nombreArchivo = "src/Clase08Ejercicio02/productosConPrecioCero.txt";

        //String nombreArchivo = "src/Clase08Ejercicio02/productos.txt";

        ArrayList<ItemCarrito> items = new LeerArchivo(nombreArchivo).leerProductos();
        CarritoCompra carrito = new CarritoCompra(20,items);

        try {
        System.out.println("---El descuento fijo se limito a un máximo de $30 con un porcentaje del 20%---");
        System.out.println("");
        System.out.println("Registros\t-cant\t-precioUnitario\t\t-Descuento del 20%\t\t\t-producto");
            for (ItemCarrito item : items){
                System.out.println("\t" + item.getIdItems() + "\t\t\t" +
                        item.getCantidad() + "\t\t\t$" +
                        item.getPrecio() + "\t\t\t\t$" +
                        carrito.descuentoTopeFijo(item) + "\t\t\t\t" +
                        item.getNombre());
            }
        } catch (MontoNegativoException e) {
            System.out.println("");
            System.out.println("ERROR - El resultado del descuento es Negativo...");
        }

        try {
            System.out.println("");
            System.out.println("Total a Pagar del Carrito: $" + carrito.DescPorcentajeFijoTotal());
        } catch (CarritoPrecioCeroException e){
            System.out.println("ERROR - No se puede aplicar un descuento a un carrito de precio 0...");
        }

    }
}
