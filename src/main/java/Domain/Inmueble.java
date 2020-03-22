package Domain;

public abstract class Inmueble {

    private int metrosCuadrados;
    private int cantidadAmbientes;
    private int valorInmueble;

    /*
    * TODO:
    *       [] Consultar como poner en atributo el tipo de negocio que se debe usar (alquiler o venta)
    *
    * */

    public Inmueble(int metrosCuadrados, int cantidadAmbientes){
        this.metrosCuadrados = metrosCuadrados;
        this.cantidadAmbientes = cantidadAmbientes;
    }

    //Getters
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }
    public int getCantidadAmbientes() {
        return cantidadAmbientes;
    }
    public int getValorInmueble(){
        return  valorInmueble;
    }

    //Setters
    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public void setCantidadAmbientes(int cantidadAmbientes) {
        this.cantidadAmbientes = cantidadAmbientes;
    }


    //Abstracts
    public abstract void setValorInmueble();
}
