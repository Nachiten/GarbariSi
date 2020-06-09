package Paquete1;
import java.util.*;


public class IVA implements ImpuestoAplicable {

    public Double porcentajeIva = 0.21;

    public IVA() {
    }

    public Double calculate(Double precioBase) {
        return porcentajeIva * precioBase;
    }

}