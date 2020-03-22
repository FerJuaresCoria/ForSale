package Domain;

public class Venta {

    private final double PORCENTAJE_COMISION = 1.5;
    private int comision;

    public Venta(Inmueble inmueble){
        setComision(inmueble);
    }

    //Getters
    public int getComision() {
        return comision;
    }

    //Setters
    public void setComision(Inmueble inmueble){
        this.comision = (int)(PORCENTAJE_COMISION * 100)/ inmueble.getValorInmueble();
    }
}
