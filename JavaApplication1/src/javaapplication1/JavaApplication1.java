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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //JavaApplication1.mostrarNumeroCreciente();
        //JavaApplication1.mostrarNumerosPares();
        //JavaApplication1.mostrarTablaDeMultiplicar();
        //JavaApplication1.mostrarTablaDeDividir();
        //JavaApplication1.mostrarSiEsPrimo();
       //JavaApplication1.saberSiEsPrimo1al100();
       //JavaApplication1.centroNumerico();
       //JavaApplication1.centroNumerico1Al1000();
       JavaApplication1.fibonacciSucesion();
       
    }
    
    public static void mostrarNumeroCreciente()
    {
        for(int contador=0; contador < 100; contador++)
        {
            System.out.println("El numero creciente es: "+contador);
        }
        
    }
    
    public static void mostrarNumeroDecreciente()
    {
        for(int contador=100; contador>0; contador--)
        {
            System.out.println("el numero es: "+contador);
        }
        
    }
    
    public static void mostrarNumerosPares()
    {
        for(int contador = 0; contador<100; contador++)
        {
            if(contador%2==0)
            {
                System.out.println("Los numeros pares son: "+ contador);
            }
        }
        
    }
    
    public static void mostrarTablaDeMultiplicar()
    {
        Scanner mysc = new Scanner(System.in);
        
        int numero;
        int resultado;
        
        System.out.println("Ingrese un numero: ");
        numero = mysc.nextInt();
        
        while(numero<0||numero>12)
        {
            System.out.println("Reingrese un numero: ");
            numero = mysc.nextInt();
        }
        for(int contador=1; contador<11; contador++)
        {
                                     
            resultado = numero*contador;
           // System.out.println("resultados"+resultado);
            System.out.println(numero+ " * "+contador+" = "+resultado);
        }
        
    }
    
    public static void mostrarTablaDeDividir()
    {
        Scanner mysc = new Scanner(System.in);
        
        int numero;
        float resultado;
        
        System.out.println("Ingrese un numero: ");
        numero = mysc.nextInt();
        
        while(numero<0||numero>15)
        {
            System.out.println("Reingrese un numero: ");
            numero = mysc.nextInt();
        }
        for(int contador=1; contador<11; contador++)
        {
                                     
            resultado = (float)numero/contador;
           // System.out.println("resultados"+resultado);
            System.out.println(numero+ " / "+contador+" = "+resultado);
        }
    }
    
    public static void mostrarSiEsPrimo()
    {
        Scanner mysc = new Scanner(System.in);
        
        Integer numero=0;
        Integer contador;
        //String bandera="no";
        boolean bandera=true;
        
        //System.out.println("Ingrese un numero: ");
        //numero = mysc.nextInt();
        
       
        
        
            for(contador=2; contador < numero; contador++)
            {
                
                if(numero%contador==0)
                {
                   //bandera="si";
                    bandera=false;
                    break;
                }

            }
        

            //if(bandera.equals("si"))
            if(bandera==false)
            {
                //System.out.println("no es primo");
            }else
            {
                System.out.println("Es un numero primo");
                System.out.println(+numero);
            }
        
        
//        while(contador<numeroIngresado)
//        {
//            if(numeroIngresado%contador==0)
//            {
//                contadorDivisores++;
//                break;
//            }
//            contador++;
//        }
//        if(contadorDivisores>0)
//        {
//            System.out.println("no es primo");
//        }else
//        {
//            System.out.println("Es primo");
//        }
        /*if(contador==numero)
        {
            System.out.println("Es un numero primo.");
        }else
        {
            System.out.println("No es primo.");
        }*/
    }
    
    public static void saberSiEsPrimo1al100()
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
    
    public static void centroNumerico()
    {
        int numero=36;
        int sumaAnt=0;
        int sumaPos=0;
        boolean EsCentroNumerico=false;
        
        for (int contador = 1; contador < numero; contador++) 
        {
            sumaAnt = sumaAnt+contador;
        }
        //System.out.println(sumaArteriores);
        for (int pos = numero+1; ; pos++) 
        {
            sumaPos = sumaPos+pos;
            
            if(sumaAnt==sumaPos)
            {
                EsCentroNumerico=true;
                break;
            }
            if(sumaPos>sumaAnt)
            {
                
                break;
            }
        }
        
        if(EsCentroNumerico)
        {
            System.out.println("Es centro numerico "+ numero);
        }else
        {
            System.out.println("No es.");
        }
    }
    
        public static void centroNumerico1Al1000()
    {
        int numero;
        int sumaAnt;
        int sumaPos;
        boolean EsCentroNumerico=false;
        
        for(numero=1; numero<1000;numero++)
        {
            sumaAnt=0;
            sumaPos=0;
            EsCentroNumerico=false;
            
            for (int contador = 1; contador < numero; contador++) 
            {
                sumaAnt = sumaAnt+contador;
            }
            //System.out.println(sumaArteriores);
            for (int pos = numero+1; ; pos++) 
            {
                sumaPos = sumaPos+pos;

                if(sumaAnt==sumaPos)
                {
                    EsCentroNumerico=true;
                    break;
                }
                if(sumaPos>sumaAnt)
                {

                    break;
                }
            }

            if(EsCentroNumerico)
            {
                System.out.println("Es centro numerico "+ numero);
            }else
            {
                
            }
        }
        
        
    }
    
    public static void fibonacciSucesion()
    {
        int num=1;
        int suma=1;
        int anterior=1;
        int fibonacci;
        
        for(int cont=1; cont<10; cont++)
        {
            fibonacci = suma + anterior;
            anterior=fibonacci;
            
            System.out.println("serie "+fibonacci);
            
        }
        
    }
        
        
}
