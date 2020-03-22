package Domain;

public class Casa extends Inmueble{

    private int valorCasa

    public Casa(int metrosCuadrados, int cantidadAmbientes, int valorCasa){
        super(metrosCuadrados, cantidadAmbientes);
        this.valorCasa = valorCasa;
        setValorInmueble();
    }

    //Getters
    public int getValorCasa() {
        return valorCasa;
    }

    //Setters
    public void setValorCasa(int valorCasa) {
        this.valorCasa = valorCasa;
    }

    //Abstract
    public void setValorInmueble(){
        valorInmueble = valorCasa;
    }

}
