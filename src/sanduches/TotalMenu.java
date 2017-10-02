/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanduches;

/**
 *
 * @author AUXSISTEMAS
 */
public class TotalMenu {

    public void Total(String TpPan, String TpCarne, String TpAcom, int EdadCli, String NmCliente) {
        double SubTotal = 0, Desc = 0, Total = 0;
        if (TpPan.equals("Pan Tradicional") && TpCarne.equals("Jamón") && TpAcom.equals("Queso")){
            SubTotal = 8550;
            
        } 
        else if (TpPan.equals("Pan Tradicional") && TpCarne.equals("Pavo") && TpAcom.equals("Mayonesa")) {
            precioSanduche = 11000;
        } 
        else {
            SubTotal = 10800.0;
        }
        if (EdadCli >= 65) {
            Desc = SubTotal * 0.02;
        }
        Total = SubTotal - Desc;
        ImprimirFactura ObjImprimir = new ImprimirFactura();
        ObjImprimir.Imprimir(NmCliente, EdadCli, SubTotal, Total, Desc, TpPan, TpCarne, TpAcom);
    }
}
