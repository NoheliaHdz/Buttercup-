package Utilis;

import java.util.Date;


public class TipodePostre {
    private Date fecha;
    private String IdPostre;
    private String NombredelPostre;
    private int Cantidad;
    private double PrecioUnitario;
    private double Total;

    public TipodePostre(Date fecha, String IdPos, String nombrePos, int cantidad, double precio){
        this.fecha = fecha;
        this.IdPostre = IdPos;
        this.NombredelPostre = nombrePos;
        this.Cantidad = cantidad;
        this.PrecioUnitario = precio;
        this.Total = (double) (precio*cantidad);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void ImprimirLinea(){
        System.out.println(String.valueOf(this.fecha)+"\t\t\t\t"+this.IdPostre + "\t\t\t\t"+ this.NombredelPostre+"\t\t\t\t\t\t"+String.valueOf(this.Cantidad)+"\t\t\t\t\t\t"+String.valueOf(this.PrecioUnitario)+"\t\t\t\t\t\t"+String.valueOf(this.Total));
    }

}
