package Paquete1;
import java.util.*;

/**
 * 
 */
public class TipoDeProducto {

    public String descripcion;
    public List<ImpuestoAplicable> impuestos;


    public TipoDeProducto() {
    }

    public void agregarImpuesto(ImpuestoAplicable impuestoAplicable) {
        impuestos.add(impuestoAplicable);
    }

    public Double totalDeImpuestosPara(Producto producto) {
        Double sumatoriaImpuestos = 0d;

        for(ImpuestoAplicable unImpuesto : impuestos){
            sumatoriaImpuestos+= unImpuesto.calculate(producto.precioBase);
        }

        return sumatoriaImpuestos + producto.precioBase;

    }

}