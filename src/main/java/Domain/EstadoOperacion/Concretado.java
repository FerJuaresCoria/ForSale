package Domain.EstadoOperacion;

import Domain.Empleado;

public class Concretado extends EstadoOperacion{

    public boolean estaReservado() {
        return false;
    }

    public void reservar(Empleado empleado) {

    }

    public void cambiarEstado(EstadoOperacion estado) {

    }


}
