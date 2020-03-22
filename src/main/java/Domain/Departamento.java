package Domain;

public class Departamento extends Inmueble{

    private final int VALOR_INMUEBLE = 350000;

    public Departamento(int metrosCuadrados, int cantidadAmbientes){
        super(metrosCuadrados, cantidadAmbientes);
        setValorInmueble();
    }

    public void setValorInmueble(){
        valorInmueble = getCantidadAmbientes() * VALOR_AMBIENTE;
    }
}
