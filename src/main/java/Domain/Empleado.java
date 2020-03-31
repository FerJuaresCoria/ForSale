package Domain;

import Domain.Inmueble.Inmueble;

import java.util.ArrayList;
import java.util.List;

public class Empleado {

    /*
    * TODO:
    *       [x]Saber comision de operacion concreta (Completado en Alquiler y Venta)
    *       []Mejor empleado
    *           [] Cantidad de comision ganada
    *           [] Cantidad de operaciones basicas
    *           [] Cantidad de reservas
    *       []Implementar reserva, compra y alquiler de una propiedad
    *           [x]Reserva
    *           [x]Compra y alquiler (concretado)
    *           []Libre
    *       []No pisar reserva de otro empleado
    *       []Corregir las comisiones del empleado
    * */

    private String nombre;
    private double comisiones;
    private String apellido;
    private List<Operacion> operaciones;

    public Empleado(String nombre, String apellido){

        this.nombre = nombre;
        this.apellido = apellido;
        this.operaciones = new ArrayList<Operacion>();
        this.comisiones = 0.0;

    }

    public void reservar(Inmueble inmueble){

    }

}
