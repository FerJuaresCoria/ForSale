package Domain;

public class PH extends Inmueble{

    private final int VALOR_MINIMO = 500000;
    private final int VALOR_METRO_CUADRADO = 14000;

    public PH(int metrosCuadrados, int cantidadAmbientes){
        super(metrosCuadrados, cantidadAmbientes);
        setValorInmueble();
    }

    //Abstract
    public void setValorInmueble(){
        int valor = getMetrosCuadrados() * VALOR_METRO_CUADRADO;
        if (valor <= VALOR_MINIMO){
            valorInmueble = VALOR_MINIMO;
        } else {
            valorInmueble = valor;
        }
    }
}
