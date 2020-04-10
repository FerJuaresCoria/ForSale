package Domain.EstadoOperacion;

public class Pendiente {

    /*
    * TODO:
    *       []Fix en metodo "reservar".
    * */

    public void reservar(){
        super.operacion.cambiarEstado(new Reservado());
    }
}
