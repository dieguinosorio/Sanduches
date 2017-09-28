/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanduches;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AUXSISTEMAS
 */
public class Sanduches {
    
    public static void main(String[] args) {
        Sanduches ObjInicio = new Sanduches();
        ObjInicio.Inicio();
    }
    
    public void Inicio(){
        String NmCliente = JOptionPane.showInputDialog("Digite el nombre del cliente");
        int EdadCli = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del cliente"));
        //EdadCli = Integer.toString(EdadCliVal);
        if(EdadCli>0 && NmCliente !=""){
            //LLenamos un array con los productos para invocaarlos en el ciclo segun el menu retornado.
            String[][] NmProductos = new String[8][8];
            NmProductos[1][1]="Pan Tradicional";
            NmProductos[1][2]="Pan Oregano";
            NmProductos[2][1]="Jamón";
            NmProductos[2][2]="Pollo";
            NmProductos[2][3]="Pavo";
            NmProductos[3][1]="Queso";
            NmProductos[3][2]="Mayonesa";
            NmProductos[3][3]="Verduras";
            String Pan="",Carne="",Acomp="",MenuElegido="";
            Menu ObjMenu = new Menu();
            MenuElegido=ObjMenu.MenuSanduches();
            String[] arrayMenu = MenuElegido.split(",");
            for(int i=0;i< arrayMenu.length;i++){
                if(i==0){
                    Pan = NmProductos[i+1][Integer.parseInt(arrayMenu[i])];
                }
                else if(i==1){
                    Carne = NmProductos[i+1][Integer.parseInt(arrayMenu[i])];
                }
                else if(i==2){
                    Acomp = NmProductos[i+1][Integer.parseInt(arrayMenu[i])];
                }
            }
            TotalMenu ObjTotal = new TotalMenu();
            ObjTotal.Total(Pan, Carne, Acomp, EdadCli,NmCliente);
        }
        else{
            JOptionPane.showMessageDialog(null,"Debes ingresar los datos del cliente correctamete.");
            Sanduches ObjNuevoPed = new Sanduches();
            ObjNuevoPed.Inicio();
        }
    }
}