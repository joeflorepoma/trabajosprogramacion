/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class lapicera {
    private int rojo=100;
    private int azul=100;
    
    public void escribir(String color, int cantidad)
    {
        if(color.equalsIgnoreCase("rojo"))
        {
            if(cantidad<rojo)
            {
                this.rojo=this.rojo-cantidad;
            }else
            {
                System.out.println("No hay cantidad suficiente de tinta roja");
            }
        }
        if(color.equalsIgnoreCase("azul"))
        {
            if(cantidad<azul)
            {
                this.azul=this.azul-cantidad;
            }else
            {
                System.out.println("No hay cantidad suficiente de tinta azul");
            }
        }
    }
    
    public void cargar(String color, int cantidad)
    {
        if(color.equalsIgnoreCase("rojo"))
        {
            this.rojo = this.rojo + cantidad;
        }
        
        if(color.equalsIgnoreCase("azul"))
        {
            this.azul = this.azul + cantidad;
        }
    }
    

    
//    public static void arrancar()
//    {
//        Scanner mysc = new Scanner(System.in);
//        
//            String color;
//            int cantidad;
//        
//            System.out.println("Ingrese un color de lapicera: ");
//            color=mysc.next();
//        
//            System.out.println("Ingrese la cantidad ");
//            cantidad=mysc.nextByte();
//    }
//        
//    public static void escribir(String colores, int cantidades)
//        {
//            int resta=0;
//            
//            if(colores.equalsIgnoreCase("rojo"))
//            {
//                resta = cantidades - 100;
//            }
//            
//        }
    
}
