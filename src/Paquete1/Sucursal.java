package Paquete1;
import java.util.*;

/**
 * 
 */
public class Sucursal {

    /**
     * Default constructor
     */
    public Sucursal() {
    }

    public String nombre;
    public List<Observer> observers;
    public List<Producto> productos;

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

}