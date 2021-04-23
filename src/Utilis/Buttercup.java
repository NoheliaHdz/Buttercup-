package Utilis;

public class Buttercup {
    public String direccion;

    public Buttercup(String direccion){
        this.direccion=direccion;
    }

    public void Orden(Pedido P){
        P.ImprimirPedido();
    }

    public void reporte(Pedido p1){
        p1.ImprimirPedidosDelDia();
    }
}
