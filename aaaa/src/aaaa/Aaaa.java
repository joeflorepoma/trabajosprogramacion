 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaaa;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Aaaa {

    
    public static int CantidadDeLaClase;
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] Nombres;
       int[] Notas;   
       
       
       //Aaaa.CantidadDeLaClase=66;
       Nombres= Aaaa.CargarNombres(2);
       
       Notas = Aaaa.CargarDatos(2);
        //System.out.println("cantidad"+Aaaa.CantidadDeLaClase);
       //Aaaa.mostrarNombres(Nombres);
       Aaaa.MostrarDatos(Notas, Nombres);
//       String[] Productos;
//       Productos= Aaaa.CargarNombres(5);
    }
    
    public static void mostrarNombres(String[] ListadoDePalabras)
    {
        
       
        for (int i = 0; i < 2; i++) 
        {
            
            System.out.println("Los nombres ingresados son: "+ ListadoDePalabras[i]);
        }
        
    }
    
    
    public  static int[] CargarDatos(int Cantidad)
    {
        Scanner mysc = new Scanner(System.in);
        
        int[] ArrayNotas = new int[Cantidad];
        
        for (int i = 0; i < 2; i++) 
        {
            System.out.println("Ingrese notas: ");
            ArrayNotas[i]=mysc.nextInt();
            
        }
        return ArrayNotas;
    }
    
    public static void MostrarDatos(int[] listadoNum,String[] listadoPalabras)
    {
        for (int i = 0; i < 2; i++) 
        {
            
            System.out.println("Los nombres ingresados son: "+ listadoPalabras[i]);
            System.out.println("Las notas ingresadas son: "+ listadoNum[i]);
        }
    }
    public static String[] CargarNombres(int Cantidad)
    {
        Scanner mysc = new Scanner(System.in);
        
        String[] arrayRetorno= new String[Cantidad];
        
        //Aaaa.CantidadDeLaClase=55;
        
        for (int i = 0; i < 2; i++) 
        {
            System.out.println("Ingrese nombre: ");
            arrayRetorno[i]=mysc.next();
        }
        
        
        return arrayRetorno;
        
    }
    
    
}
