package Utilis;

public class Vendedor extends Inform{
    public int idVendedor;
    public Vendedor(String nombre, String apellido, int idVendedor, String id, String telefono, String direccion, int edad) {
        super(nombre, apellido, id, telefono, direccion, edad);
        this.idVendedor = idVendedor;
    }

}
