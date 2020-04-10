package Domain;

import Domain.EstadoOperacion.EstadoOperacion;
import Domain.Inmueble.Inmueble;

public abstract class Operacion {

    /*
    * TODO:
    *       []Sumar precio de la zona en el valor del inmueble
    * */

    private EstadoOperacion estado;
    protected Inmueble inmueble;
    protected Empleado empleado;

    public Operacion(){

    }

    //Methods
    public boolean estaReservado(){
        return this.estado.estaReservado();
    }
    public void reservar(){
        this.estado.reservar(empleado);
    }
    public void cambiarEstado(EstadoOperacion estado){
        this.estado = estado;
    }

    //Abstract
    public abstract double obtenerComision();
}
