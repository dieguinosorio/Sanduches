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
public class Productos {
    public String[] ProductosSanduche(String Op){
        int TamArr =0;
        if(Op.equals("1")){
            TamArr = 2;
        }
        if(Op.equals("2")){
            TamArr = 3;
        }
        if(Op.equals("3")){
            TamArr = 3;
        }
        
        String[] Productos = new String[TamArr];
        if(Op.equals("1")){
            Productos[0]="1.Pan Tradicional";
            Productos[1]="2.Pan Oregano";
        }
        else if(Op.equals("2")){
            Productos[0]="1.Jamón";
            Productos[1]="2.Pollo";
            Productos[2]="3.Pavo";
        }
        else if (Op.equals("3")){
            Productos[0]="1.Queso";
            Productos[1]="2.Mayonesa";
            Productos[2]="3.Verduras";
        }
        return Productos;
    }
}
