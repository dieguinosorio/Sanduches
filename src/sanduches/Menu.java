/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanduches;

import javax.swing.JOptionPane;

/**
 *
 * @author AUXSISTEMAS
 */
public class Menu {
        public String MenuSanduches(){
         //Variables nombre de cliente y acompañantes del sanduche
        String NmCliente="", NmAcom="",NmCarne="",NmPan="",Produc[],TipoProducto="",TpPan="",TpCarne="", TpAcom="",MenuElegido="";
        //Variables Tipos de pan,carne y acompañantes
        int  TpCont =1;
        //Variables totales
        
        //Creamos ciclo para validar los productos que selecciono el cliente y validar que el dato seleccionado si sea correcto.
        while(TpCont <=3 ){
            //Devuelve un array con los productos segun la opcion :1.pan,2.carne,3.acompañante
            Productos ObjPruduc = new Productos();
            Produc = ObjPruduc.ProductosSanduche(Integer.toString(TpCont));
            //Llenamos la variable acomuladora con los datos del array que contiene los productos.
            for(int j=0; j<Produc.length;j++){
                TipoProducto = TipoProducto+"\n"+Produc[j];
            }
            //Si el dato seleccionado según la opción esta en el rango sigue con el siguiente producto si no le vuelve a pedir que ingrese de nuevo el producto.
            if(TpCont ==1){
                TpPan = JOptionPane.showInputDialog("************************SANDUCHES DIEGUIN************************ \n \n "+"TIPO DE PAN.Escriba el tipo de pan con el teclado.\n"+TipoProducto);
                if(Integer.parseInt(TpPan)> Produc.length){
                    JOptionPane.showMessageDialog(null,"El tipo de pan que ingresastes es incorrecto");
                }
                else{
                    TpCont ++;
                    MenuElegido = MenuElegido+""+TpPan+",";
                }
                TipoProducto ="";
            }
            else if(TpCont ==2){
                TpCarne=JOptionPane.showInputDialog("************************SANDUCHES DIEGUIN************************ \n \n "+"TIPO DE CARNE .Escriba el tipo de carne con el teclado.\n"+TipoProducto);
                if(Integer.parseInt(TpCarne)> Produc.length){
                    JOptionPane.showMessageDialog(null,"El tipo de carne que ingresastes es incorrecto");
                }
                else{
                    TpCont ++;
                    MenuElegido = MenuElegido+""+TpCarne+",";
                }
                TipoProducto ="";
            }
            else if(TpCont ==3){
                TpAcom = JOptionPane.showInputDialog("************************SANDUCHES DIEGUIN************************ \n \n "+"TIPO DE ACOMPAÑANTE.Escriba el acompañante de pan con el teclado.\n"+TipoProducto);
                if(Integer.parseInt(TpAcom)> Produc.length){
                    JOptionPane.showMessageDialog(null,"El tipo de acompañante que ingresastes es incorrecto");
                }
                else{
                    TpCont ++;
                    MenuElegido = MenuElegido+""+TpAcom+"";
                }
                TipoProducto ="";
            }
        }
        //Retorna el acomulador con el menu elegido en numero
        return(MenuElegido);
        }
}
