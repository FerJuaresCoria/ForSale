package Domain;

public class Alquiler {

    private final int VALOR_DIVIDENDO = 50000;
    private int mesesContrato;
    private int comision;

    public Alquiler(int mesesContrato, Inmueble inmueble){
        this.mesesContrato = mesesContrato;
        setComision(inmueble);
    }

    //getters
    public int getMesesContrato() {
        return mesesContrato;
    }
    public int getComision() {
        return comision;
    }

    //Setters
    public void setMesesContrato(int mesesContrato){
        this.mesesContrato = mesesContrato;
    }
    public void setComision(Inmueble inmueble){
        this.comision = (this.mesesContrato * inmueble.getValorInmueble())/VALOR_DIVIDENDO;
    }
}
