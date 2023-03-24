package Excepciones;

import Clase08Ejercicio02.CarritoCompra;
import Clase08Ejercicio02.ItemCarrito;

public class CarritoPrecioCeroException extends Exception{
    private ItemCarrito producto;

    public CarritoPrecioCeroException(ItemCarrito producto) {
        this.producto = producto;
    }

}
