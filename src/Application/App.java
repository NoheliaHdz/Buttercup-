package Application;

import Utilis.*;

import java.util.*;
import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args){

        //INSTANCIAS postres
        TipodePostre p1 = new TipodePostre(new Date(2021,03,15),"10002","PASTEL TRES LECHES",1,192.23);
        TipodePostre p2 = new TipodePostre(new Date(2021,03,15),"10001","PASTEL DE OREO",2,156.2);
        TipodePostre p3 = new TipodePostre(new Date(2021,02,20),"10003","PASTEL DE COCO",2,78.45);
        TipodePostre p4 = new TipodePostre(new Date(2021,02,20),"10004","PASTEL DE CHOCOLATE",1,133.86);
        TipodePostre p5 = new TipodePostre(new Date(2021,01,30),"10005","PASTEL DE VAINILLA",2,139.98);
        TipodePostre p6 = new TipodePostre(new Date(2021,01,30),"10006","PASTEL DE MANZANA",2,345.21);
        TipodePostre p7 = new TipodePostre(new Date(2021,01,30),"10007","PASTEL DE HELADO",1,219.02);
        TipodePostre p8 = new TipodePostre(new Date(2021,02,20),"10008","TORTA DE FRUTAS",2,99.99);

        //INSTANCIAS DE VENDEDORES
        Vendedor v1 = new Vendedor("Raul","Fernandez",13452,"01020284762","7356783","Col. 3 de mayo",35);
        Vendedor v2 = new Vendedor("Juan","Calix",563,"8976207667","5568897","Col. San Miguel",40);
        Vendedor v3 = new Vendedor("Carolina","Lazo",63790,"7478623786","877637692","Res. El Sauce",23);

        //INSTACIAS COCINERO
        Cocinero co1 = new Cocinero("Maria","Gutierres",45548,"654670989","8798098","Col. Cerro Grande",23);
        Cocinero co2 = new Cocinero("Lety","Fernandez",52652,"6784676784","878768778", "Col. Campo Cielo",21);
        Cocinero co3 = new Cocinero("Olga","Amador",6467,"64693287","778238732","Amarateca",35);

        //INSTACIAS CLIENTES
        Cliente c1 = new Cliente(52163,"Carol","Avila","76807087","67680988","Col. 9 de Octubre",20);
        Cliente c2 = new Cliente(73389, "Noel","Lagos","36289797","7863687","Res. El Sause",27);
        Cliente c3 = new Cliente(5363,"Lineth","Archaga","89643763287","764763276","Tamara",21);

        //INSTANCIAS PEDIDOS
        Pedido pe1 = new Pedido(1537, v1, c1, co1);
        Pedido pe2 = new Pedido(456,v2,c2,co2);
        Pedido pe3 = new Pedido(6216,v3,c3,co3);

        //INSTANCIAS SUCURSALES
        Buttercup b = new Buttercup("TGU. COLONIA CERRO GRANDE");
        Buttercup b1 = new Buttercup("TGU. CITY MALL");
        Buttercup b2 = new Buttercup("TGU. MALL METRO");

        //INSTANCIAS SUMINISTROS
        Suministros s = new Suministros(new Date(2021,03,15),"84874","Leche","uso del pastel tres leches",10,b);
        Suministros s1 = new Suministros(new Date(2021,03,15),"87587","Leche","uso del pastel tres leches",15,b1);

        pe1.AgregarPotre(p1);
        pe1.AgregarPotre(p2);
        pe2.AgregarPotre(p5);
        pe2.AgregarPotre(p6);
        pe2.AgregarPotre(p7);
        pe3.AgregarPotre(p3);
        pe3.AgregarPotre(p4);
        pe3.AgregarPotre(p8);


        b1.Orden(pe3);
        b.Orden(pe1);
        b2.Orden(pe2);
        b.reporte(pe1);
        b1.reporte(pe3);
        b2.reporte(pe2);

        s1.AgregarSuministros(s1);
        s1.AgregarSuministros(s);
        s1.ImprimirSucursal();

        pe1.reporte(new Date(2021,03,15));
    }
}
