
package Paquete1;

import java.util.*;

public class EI implements ImpuestoAplicable {


    public EI() {
    }

    public Double factorGananciasImpositivas = 0.3;
    public Double factorPrecioBase = 4d;
    public Double gananciasImpositivas = 3.5;

    public Double calculate(Double precioBase) {
        return precioBase/factorPrecioBase + factorGananciasImpositivas * gananciasImpositivas;
    }


}