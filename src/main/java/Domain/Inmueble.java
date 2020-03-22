package Domain;

public class Inmueble {

    private int metrosCuadrados;
    private int cantidadAmbientes;
    private int valorInmueble;

    /*
    * TODO:
    *       [] Consultar como poner en atributo el tipo de negocio que se debe usar (alquiler o venta)
    *
    * */

    public Inmueble(int metrosCuadrados, int cantidadAmbientes, int valorInmueble){
        this.metrosCuadrados = metrosCuadrados;
        this.cantidadAmbientes = cantidadAmbientes;
        this.valorInmueble = valorInmueble;
    }

    //Getters
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }
    public int getCantidadAmbientes() {
        return cantidadAmbientes;
    }
    public int getValorInmueble() {
        return valorInmueble;
    }

    //Setters
    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public void setCantidadAmbientes(int cantidadAmbientes) {
        this.cantidadAmbientes = cantidadAmbientes;
    }
    public void setValorInmueble(int valorInmueble) {
        this.valorInmueble = valorInmueble;
    }
}
