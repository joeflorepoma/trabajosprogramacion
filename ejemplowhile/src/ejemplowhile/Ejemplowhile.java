/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejemplowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       // Ejemplowhile.promedioConIf();
        
        //Ejemplowhile.promedioConWhile();
        //Ejemplowhile.iteracionSinCantidad();
        //Ejemplowhile.salidaPorLogica();
        //Ejemplowhile.pedirNumero();
        Ejemplowhile.mostrarMenu();
    }//finaliza el main
    /**
     * pide 2 numeros e informa el promedio.
     */
    
  
    public static void promedioConIf()
    {
        Scanner mysc = new Scanner(System.in);
        
        Integer num1;
        Integer num2;
        String aux;
        Integer promedio;
        
        System.out.println("Ingrese el primer numero: ");
        aux = mysc.next();
        num1 = Integer.parseInt(aux);
        
        System.out.println("Ingrese el segundo numero: ");
        aux = mysc.next();
        num2 = Integer.parseInt(aux);
        
        promedio = (num1+num2)/2;
        System.out.println("El promedio es: " + promedio);
        
    }//finaliza promedio con if
    
    /**
     * pide 2 numeros e informa el promedio.
     */
    
    public static void promedioConWhile()
    {
        Scanner mysc = new Scanner(System.in);
        
        Integer num;
        float promedio;
        Integer contador = 0;        
        String aux;
        Integer suma = 0;
        
        while(contador<3)
        {
            //contador++;
            System.out.println("Ingrese un numero: "+contador);
            aux = mysc.next();
            num = Integer.parseInt(aux);
            suma = suma + num;
            
        }
        
        promedio =(float)suma/contador;
        
        System.out.println("El promedio es: " + promedio);
    }
    
    /**
     * cuando no sabemos la cantidad
     */
    
    public static void iteracionSinCantidad()
    {
        Scanner mysc = new Scanner(System.in);
        
        String continuar="si";
        Integer num;
        
        while(!continuar.equals("no"))
        {
            System.out.println("Hola");
            System.out.println("Desea continuar si/no");
            continuar = mysc.next();
        }
    }
    
    static public void salidaPorLogica()
    {
        Scanner mysc = new Scanner(System.in);
        String continuar;
        while(true)
        {
            System.out.println("Hola");
            System.out.println("Desea continuar si/no");
            continuar = mysc.next();
            if(continuar.equals("no"))
            {
                break;
            }
        }
    }
    
    public static void pedirNumero()
    {
        Integer num;
        Integer contador = 0;
        String aux;
        Integer suma = 0;
        
        Scanner mysc = new Scanner(System.in);
        
        while(contador<10 && suma<50)
        {
            contador++;            
            System.out.println("Ingrese numero "+contador);
            aux = mysc.next();
            num = Integer.parseInt(aux);
            suma = suma + num;
            
        }
        
        System.out.println("La suma es "+suma);
        System.out.println("La cantidad es "+contador);
        
    }
    
    public static void mostrarMenu()
    {
        
        String opcion="nada";
        
        Scanner mysc = new Scanner(System.in);
        
        while(!opcion.equals("6"))
        {
            
            System.out.println("1.- Sumar: ");
            System.out.println("2.- Restar: ");
            System.out.println("3.- multiplicar: ");
            System.out.println("4.- Dividir: ");
            System.out.println("6.- Salir: ");
            System.out.println("Ingrese opcion deseada: ");
            opcion = mysc.next();
            
            switch(opcion)
            {
                case "1":
                    Ejemplowhile.Sumar();
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
        System.out.println("Cerro el menu");
        
    }
    
    public static void Sumar()
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
    
    public static void Resta()
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
        
        resultado = num1 - num2;
        System.out.println("El resultado de la resta es: "+ resultado);
    }
    
    public static void Multiplicar()
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
        
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: "+ resultado);
    }
    
    public static void Dividir()
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
        
        if(num2 == 0)
        {
            System.out.println("Ingrese un numero distinto de cero:");
            System.out.println("Ingrese segundo numero: ");
            aux = mysc.next();
            num2 = Integer.parseInt(aux);
        }
        
        resultado = num1 / num2;
        System.out.println("El resultado de la division es: "+ resultado);
    }
    
    
}
