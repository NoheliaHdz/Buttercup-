package Utilis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Suministros {
    public String id;
    public String nombre;
    public String descripcion;
    public Date fecha;
    public Buttercup sucursal;
    public int cantidad;
    public List<Suministros> se;

    public Suministros(Date fec, String id, String nombre, String des, int can, Buttercup sucursal){
        this.fecha= fec;
        this.id=id;
        this.descripcion=des;
        this.nombre=nombre;
        this.cantidad = can;
        this.sucursal = sucursal;
        this.se = new ArrayList<Suministros>();
    }

    public void ImprimirReporteSuministros(){
        System.out.println(String.valueOf(this.fecha)+"\t\t\t\t\t"+this.sucursal.direccion+"\t\t\t\t\t"+this.nombre+"\t\t\t\t\t"+String.valueOf(this.cantidad));
    }
    public void AgregarSuministros(Suministros sumi){
        this.se.add(sumi);
    }

    public void ImprimirSucursal(){
        System.out.println("GASTO DE SUMINISTROS");
        System.out.println("FECHA \t\t\t\t\t SUCURSAL \t\t\t\t\t NOMBRE SUMINISTRO \t\t\t\t\t CANTIDAD");
        for(Suministros s : this.se){
            s.ImprimirReporteSuministros();
        }
        System.out.println("\n");
    }
}
