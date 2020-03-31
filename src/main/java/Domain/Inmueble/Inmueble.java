package Domain.Inmueble;

import Domain.Empleado;
import Domain.Operacion;
import Domain.Zona;

public abstract class Inmueble {

    protected Zona zona;
    protected Operacion operacion;
    private double metrosCuadrados;
    private int cantidadAmbientes;
    protected double valorInmueble;

    /*
    * TODO:
    *       [x] Consultar como poner en atributo el tipo de negocio que se debe usar (alquiler o venta)
    *       [x] Consultar como ibamos a implementar la variacion de precio con respecto a la zona
    * */

    public Inmueble(double metrosCuadrados, int cantidadAmbientes){
        this.metrosCuadrados = metrosCuadrados;
        this.cantidadAmbientes = cantidadAmbientes;
    }

    //Getters
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
    public int getCantidadAmbientes() {
        return cantidadAmbientes;
    }
    public double getValorInmueble(){
        return  valorInmueble;
    }

    //Setters
    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public void setCantidadAmbientes(int cantidadAmbientes) {
        this.cantidadAmbientes = cantidadAmbientes;
    }

    //Methods
    public void reservarPara(Empleado empleado){
        this.operacion.reservar();
    }

    //Abstracts
    public abstract void setValorInmueble();
}
