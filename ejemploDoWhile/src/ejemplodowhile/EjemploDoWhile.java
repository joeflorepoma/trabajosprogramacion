/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EjemploDoWhile.mostrarNumeros();
        
        
    }
    
    public static void mostrarNumeros()
    {
        Scanner mysc = new Scanner(System.in);
        
        int numero=0;
        
        
        do
        {
            System.out.println("ingrese un numero"+numero);
            numero++;
           
            
        }while(numero<10);
        
       // System.out.println("mensaje");
        //tomar dato
//       while(numero<10)
//        {
//            System.out.println("mensaje");
//            tomar dato ... numero
//        }
        
    }
    
}
