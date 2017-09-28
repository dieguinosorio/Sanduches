/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanduches;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author AUXSISTEMAS
 */
public class ImprimirFactura {
    public void Imprimir(String NmCliente,int EdadCli,double SubTotal,double Total,double Desc,String Pan,String Carne,String Acomp){
        Random rnd = new Random(); 
        int OpSalir;
        //Imprimo la factura
        OpSalir = Integer.parseInt(JOptionPane.showInputDialog("=================================================================\n"
                +"******************************SOWEI DIEGUIN******************************\n"
                +"                                                         Factura Número " + rnd.nextInt(100)+"\n"
                +"PEDIDO CLIENTE: "+NmCliente+"\n"
                +"Tipo Pan     Tipo Carne     Tipo Acompañante\n"
                +Pan+"  |   "+Carne+"  |  "+Acomp+"            SUB TOTAL: $"+SubTotal+"\n"
                +"                            Descuento(2%):              $"+Desc+"\n"
                +"TOTAL A PAGAR..........................................$"+Total+"\n"
                + "GRACIAS POR TU COMPRA :) \n"
                +"=================================================================\n"+
                "SI DESEAS CREAR UN NUEVO PEDIDO DIGITA 1 SI DESEA SALIR CLICK EN ACEPTAR"));
        if(OpSalir == 1){
            Sanduches ObjNuevoPed = new Sanduches();
            ObjNuevoPed.Inicio();
        }
        else{
            System.exit(0);
        }
    }
}
