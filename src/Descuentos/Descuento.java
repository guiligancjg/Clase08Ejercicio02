package Descuentos;

import Clase08Ejercicio02.ItemCarrito;

public class Descuento {
    protected String descripcion;
    protected int unidades;
    protected int descuento;

    public Descuento() {}

    public Descuento(String descripcion, int unidades, int descuento) {
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.descuento = descuento;
    }



    public int getDescuento() {
        return this.descuento;
    }

    public int getUnidades() {
        return this.unidades;
    }

    public String getDescripcion() { return descripcion; }

    public double calcularTotal(ItemCarrito productos){
        double total = 0;
        if(productos.getCantidad() >= this.getUnidades()){
            total = productos.getCantidad() * (productos.getPrecio() - ((productos.getPrecio() * this.getDescuento()) / 100));
            return total;
        } else {
            total = productos.getPrecio() * productos.getCantidad();
            return total;
        }
    }
}
