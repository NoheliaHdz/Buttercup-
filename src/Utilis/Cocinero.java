package Utilis;

public class Cocinero extends Inform{
    public int idCocinero;

    public Cocinero(String nombre, String apellido,int idCocinero, String id, String telefono, String direccion, int edad) {
        super(nombre, apellido, id, telefono, direccion, edad);
        this.idCocinero = idCocinero;
    }
}
