package Domain;

import Domain.Inmueble.Inmueble;

public class Venta extends Operacion{

    private static double PORCENTAJE_COMISION = 1.5;

    public Venta(){
    }

    //Overrides
    @Override
    public double obtenerComision(){
        return (Venta.PORCENTAJE_COMISION * super.inmueble.getValorInmueble())/ 100;
    }
}
