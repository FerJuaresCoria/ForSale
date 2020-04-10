package Domain.Inmueble;

public class PH extends Inmueble{

    private static int VALOR_MINIMO = 500000;
    private static int VALOR_METRO_CUADRADO = 14000;

    public PH(int metrosCuadrados, int cantidadAmbientes){
        super(metrosCuadrados, cantidadAmbientes);
        setValorInmueble();
    }

    //Abstract
    public void setValorInmueble(){
        double valor = getMetrosCuadrados() * PH.VALOR_METRO_CUADRADO;
        if (valor <= PH.VALOR_MINIMO){
            valorInmueble = PH.VALOR_MINIMO;
        } else {
            valorInmueble = valor;
        }
    }
}
