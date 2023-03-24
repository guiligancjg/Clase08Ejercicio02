package Clase08Ejercicio02;

import Descuentos.DescuentoPorcentajeConTope;
import Excepciones.CarritoPrecioCeroException;

import java.util.ArrayList;

public class CarritoCompra extends DescuentoPorcentajeConTope{
    private ArrayList<ItemCarrito> items;

    public CarritoCompra(double descuentoConTope, ArrayList<ItemCarrito> productos) {
        super(descuentoConTope);
        this.items = productos;
    }

    public double CarritoPrecio(){
        double total = 0;
        for (ItemCarrito item: items) {
            total += item.precio();
        }
        return total;
    }

    public double DescPorcentajeFijoTotal() throws CarritoPrecioCeroException {
        double precioMaximo = 30;
        double descuentoMaximo = precioMaximo * (this.descuentoConTope / 100);
        double total = 0;

        for (ItemCarrito item: items) {
            if(item.precioEnCero()){
                throw new CarritoPrecioCeroException(item);
            }

            total += item.getPrecio() * item.getCantidad() - descuentoMaximo;
        }
        return total;
    }
}
