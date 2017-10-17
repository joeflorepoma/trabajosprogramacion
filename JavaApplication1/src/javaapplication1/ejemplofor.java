/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejemplofor {
    
   public static void ejemplosDeFor()
   {
       ejemplofor.saberSiEsPrimo1al100();
   }
   
   private static void saberSiEsPrimo1al100()
    {
        int i,j;
        boolean esPrimo;
        int contador = 2;
        int contadorFinal = 100;
        
        for(i = contador;i <= contadorFinal;i++)
        {
            esPrimo=true;
            
            for(j = 2;j < i;j++)
            {
                if(i % j == 0)
                {
                    esPrimo = false;
                }
            }
            if(esPrimo)
            {
                System.out.println(i);
            }
        }
    }
}