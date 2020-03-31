package Domain;

import Domain.Inmueble.Inmueble;

public class Alquiler extends Operacion{

    private final int VALOR_DIVIDENDO = 50000;
    private int mesesContrato;

    public Alquiler(int mesesContrato){
        this.mesesContrato = mesesContrato;
    }

    //getters
    public int getMesesContrato() {
        return mesesContrato;
    }

    //Setters
    public void setMesesContrato ( int mesesContrato){
        this.mesesContrato = mesesContrato;
    }

    //Overrides
    @Override
    public double obtenerComision(){
        return (this.mesesContrato * super.inmueble.getValorInmueble())/VALOR_DIVIDENDO;
    }
}
