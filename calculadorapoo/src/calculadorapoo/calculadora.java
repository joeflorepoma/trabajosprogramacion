/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapoo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class calculadora {
    
    public static void arrancarCalculadora()
    {
        String opcion="nada";
        
        Scanner mysc = new Scanner(System.in);
        System.out.println("BIENVENIDO A LA CALCULADORA");
        while(!opcion.equals("6"))
        {
            calculadora.mostrarMenu();
            opcion = mysc.next();
            
            switch(opcion)
            {
                case "1":
                    calculadora.Sumar();
                    break;
                case "2":
                    Ejemplowhile.Resta();
                    break;
                case "3":
                    Ejemplowhile.Multiplicar();
                    break;
                case "4":
                    Ejemplowhile.Dividir();
                    break;
                case "6:":
                    System.out.println("¡¡¡Adios.¡¡¡");
                    break;
                default:
                    System.out.println("\n¡¡¡Ingreso una opcion equivocada.¡¡¡\n");
            }
        }
    }
    
    private static void mostrarMenu()
    {
        
        System.out.println("1.- Sumar: ");
        System.out.println("2.- Restar: ");
        System.out.println("3.- multiplicar: ");
        System.out.println("4.- Dividir: ");
        System.out.println("6.- Salir: ");
        System.out.println("Ingrese opcion deseada: ");
        
    }
    
    private static void Sumar()
    {
        Integer num1;
        Integer num2;
        String aux;
        Integer resultado;
        
        Scanner mysc = new Scanner (System.in);
        
        System.out.println("Ingrese primer numero: ");
        aux = mysc.next();
        num1 = Integer.parseInt(aux);
        
        System.out.println("Ingrese segundo numero: ");
        aux = mysc.next();
        num2 = Integer.parseInt(aux);
        
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es: "+ resultado);
    }
}
