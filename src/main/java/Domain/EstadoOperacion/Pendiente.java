package Domain.EstadoOperacion;

public class Pendiente {

    public void reservar(){
        super.operacion.cambiarEstado(new Reservado());
    }
}
