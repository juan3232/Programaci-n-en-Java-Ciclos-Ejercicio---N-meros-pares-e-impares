/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import javax.swing.JOptionPane;



/**
 *
 * @author AMKARA
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int Numero;
        
        
       Numero=Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero: "));
       
       while(Numero  !=0){//Mientras sea distinto de cero
           
           if(Numero %2  == 0){//Si  el  Numero es par 
               System.out.println("El numero es"+Numero+"Es par--->");
           
           }
           else{
               System.out.println("El numero es"+Numero+"Es Impar-->");
           }
            Numero=Integer.parseInt(JOptionPane.showInputDialog("Diguite otro  numero: "));
       }
       
    }
    
}
