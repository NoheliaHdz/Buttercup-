package Utilis;

public class Cliente extends Inform{
    public int IdCliente;
    public Cliente(int idCliente,String nombre, String apellido, String id, String telefono, String direccion, int edad) {
        super(nombre, apellido, id, telefono, direccion, edad);
        this.IdCliente = idCliente;
    }

}
