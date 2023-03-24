package Clase08Ejercicio02;

public class ItemCarrito {
    protected int IdItems;
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public ItemCarrito() {}

    public ItemCarrito(int IdItems, String nombre, double precio, int cantidad) {
        this.IdItems = IdItems;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public String getNombre() {
        return this.nombre;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public int getIdItems() { return IdItems; }

    public double precio(){
        return this.getPrecio() * this.getCantidad();
    }

    public boolean precioEnCero(){
        return this.precio == 0;
    }


}
