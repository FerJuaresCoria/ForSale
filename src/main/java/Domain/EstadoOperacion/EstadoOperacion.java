package Domain.EstadoOperacion;

import Domain.Empleado;
import Domain.Inmueble.Inmueble;
import Domain.Operacion;

public abstract class EstadoOperacion {

    protected Inmueble inmueble;
    protected Operacion operacion;

    public abstract boolean estaReservado();
    public abstract void reservar(Empleado empleado);
    public abstract void cambiarEstado(EstadoOperacion estado);

}
