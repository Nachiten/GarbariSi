package Paquete1;
import java.util.*;

public class EO implements ImpuestoAplicable {

    public EO() {
    }


    public Double factorGananciasImpositivas = 4d;
    public Double factorPrecioBase = 0.5;
    public Double gananciasImpositivas = 4d;

    public Double calculate(Double precioBase) {
        return factorPrecioBase * precioBase / (factorGananciasImpositivas * gananciasImpositivas);
    }

}