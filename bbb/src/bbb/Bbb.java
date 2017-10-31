/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbb;

/**
 *
 * @author alumno
 */
public class Bbb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] alumno={"maria", "manuel", "diego", "estela","martin"};
        int[] notas={10,2,5,2,7};
        int resultado;
        float promedio;
        String auxNombre;
        
        resultado = Bbb.mostrarCantidadDeAprobados(notas);
        
        System.out.println("los aprobados son:  "+resultado);
        
        promedio = Bbb.retornarPromedio(notas);
        
        System.out.println("El promedio es: "+promedio/notas.length);
        
        auxNombre=Bbb.RetornarElNombreDeLaMejorNota(notas, alumno);
        
        System.out.println("El mejor alumno es: "+ auxNombre);
        
        
                
    }
    
    public static int mostrarCantidadDeAprobados(int[] miparametro)
    {
        int resultado=0;
        
        for (int i = 0; i < miparametro.length; i++) 
        {
            if(miparametro[i]>3)
            {
                resultado++;
            }
        }
                
        return resultado;
        
    }
    
    public static float retornarPromedio(int[] miparametro)
    {
        int resultado=0;
        
        for (int i = 0; i < miparametro.length; i++) 
        {
            resultado = resultado + miparametro[i];
        }        
        
        return resultado;
    }
    
    public static String RetornarElNombreDeLaMejorNota(int[]notas, String[]nombres)
    {
        String retorno="";
        
        int mayor=notas[0];
        
        for (int i = 0; i < notas.length; i++) 
        {
            if(notas[i]>mayor)
            {
                mayor=notas[i];
                retorno=nombres[i];
            }
        }
        
        return retorno;
    }
    
    nombre del menor
    
    
    
}
