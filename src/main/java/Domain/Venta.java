package Domain;

import Domain.Inmueble.Inmueble;

public class Venta extends Operacion{

    private final double PORCENTAJE_COMISION = 1.5;

    public Venta(){
    }

    //Overrides
    @Override
    public double obtenerComision(){
        return (PORCENTAJE_COMISION * 100)/ super.inmueble.getValorInmueble();
    }
}
