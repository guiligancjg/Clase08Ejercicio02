package Descuentos;

import Clase08Ejercicio02.ItemCarrito;
import Excepciones.MontoNegativoException;

public class DescuentoPorcentajeConTope extends Descuento{
    protected double descuentoConTope;

    public DescuentoPorcentajeConTope(double descuentoConTope) {
        this.descuentoConTope = descuentoConTope;
    }

    public double descuentoTopeFijo(ItemCarrito productos) throws MontoNegativoException {
        double precioMaximo = 30;
        double descuentoMaximo = precioMaximo * (this.descuentoConTope / 100);
        if(productos.getPrecio() * productos.getCantidad() - descuentoMaximo < 0){
            throw new MontoNegativoException();
        }
        double descuento = productos.getPrecio() * productos.getCantidad() - descuentoMaximo;
        return descuento;
    }


}

