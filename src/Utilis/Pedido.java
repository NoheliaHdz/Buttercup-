package Utilis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    public int id;
    public Vendedor vende;
    public Cliente cliente;
    public Cocinero cocin;
    public List<TipodePostre> Orden;
    public List<TipodePostre> rep;

    public Pedido(int id, Vendedor vende, Cliente cliente, Cocinero cocinero) {
        this.id = id;
        this.vende = vende;
        this.cliente = cliente;
        this.cocin = cocinero;
        this.Orden = new ArrayList<TipodePostre>();
        this.rep = new ArrayList<TipodePostre>();
    }

    public void AgregarPotre(TipodePostre p){
        this.Orden.add(p);
        this.rep.addAll(Orden);
    }


    public void ImprimirPedido() {
        System.out.println("ORDEN # \t\t\t" + String.valueOf(this.id));
        System.out.println("CLIENTE ID: \t\t\t" + String.valueOf(this.cliente.IdCliente));
        System.out.println("NOMBRE DEL CLIENTE: \t\t\t" + this.cliente.nombre + " " + this.cliente.apellido);
        System.out.println("NOMBRE DEL VENDEDOR: \t\t\t" + this.vende.nombre + " " + this.vende.apellido);
        System.out.println("NOMBRE DEL COCINERO: \t\t\t" + this.cocin.nombre + " " + this.cocin.apellido);

        System.out.println("FECHA \t\t\t\t\t\t\t\t\t\t POSTRE ID \t\t\t\t NOMBRE DEL POSTRE \t\t\t\t CANTIDAD \t\t\t\t PRECIO UNITARIO \t\t\t\t TOTAL");
        for (TipodePostre tp : this.Orden) {
            tp.ImprimirLinea();

        }
        System.out.println("\n");
    }


    public void ImprimirPedidosDelDia() {
        System.out.println("ORDEN DEL DIA");
        System.out.println("FECHA \t\t\t\t POSTRE ID \t\t\t\t NOMBRE DEL POSTRE \t\t\t\t CANTIDAD \t\t\t\t PRECIO UNITARIO \t\t\t\t TOTAL");
        for(TipodePostre tp :this.rep) {
            tp.ImprimirLinea();
        }
        System.out.println("\n");
    }

    public void reporte(Date Fecha){


        System.out.println("FECHA \t\t\t\t POSTRE ID \t\t\t\t NOMBRE DEL POSTRE \t\t\t\t CANTIDAD \t\t\t\t PRECIO UNITARIO \t\t\t\t TOTAL");
        for(TipodePostre tp :this.Orden) {
            if (Fecha==tp.getFecha()){
                tp.ImprimirLinea();
            }else {
                break;
            }

        }
    }

}
