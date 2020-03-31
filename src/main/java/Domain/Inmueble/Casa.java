package Domain.Inmueble;

public class Casa extends Inmueble{

    private double valorCasa;

    public Casa(double metrosCuadrados, int cantidadAmbientes, double valorCasa){
        super(metrosCuadrados, cantidadAmbientes);
        this.valorCasa = valorCasa;
        setValorInmueble();
    }

    //Getters
    public double getValorCasa() {
        return valorCasa;
    }

    //Setters
    public void setValorCasa(int valorCasa) {
        this.valorCasa = valorCasa;
    }

    //Abstract
    public void setValorInmueble(){
        super.valorInmueble = valorCasa + super.zona.getPrecioPlus();
    }

}
