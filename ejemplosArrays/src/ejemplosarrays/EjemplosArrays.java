/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosarrays;

/**
 *
 * @author alumno
 */
public class EjemplosArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EjemplosArrays.ejemplo2();
        //EjemplosArrays.ejemplo3();
        //EjemplosArrays.invertirOrden();
        //EjemplosArrays.sacarElMayor();
        //EjemplosArrays.sacarElMenor();
        //EjemplosArrays.suma();
        EjemplosArrays.promedio();
    }
    
    public static void PrimerEjemplo()
    {
        int[] numeros;
        int MasNumeros[]= {33,77,55,11};;
        int []otrosNumeros;
        
        numeros = new int[4];
        numeros[0]=99;
        numeros[1]=22;
        numeros[2]=11;
        numeros[3]=0;
        
        otrosNumeros = new int[10];
        int largo = otrosNumeros.length;
        
        System.out.println("Largo "+largo);
        
        for(int i=0; i<otrosNumeros.length; i++)
        {
            otrosNumeros[i]=i*3;
            System.out.println("numeros"+ otrosNumeros[i]);
        }
        
       
    }
    
    public static void ejemplo2()
    {
        int numerosPares[];
        
        numerosPares = new int[10];
        int indice=0;
        for (int i = 0; i < 20; i++) {
            
            if(i%2==0)
            {
                numerosPares[indice]=i;
                indice= indice +1;
                
            }
        }
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Numero "+i+" : "+ numerosPares[i]);
        }
        
        
    }
    
    public static void ejemplo3()
    {
        int array1[]={3,5,7};
        int array2[]={8,6,2};
        int array3[];
        array3 = new int[3];
        
        
        
        
        for (int i = 0; i < 3; i++) 
        {
            if(array1[i]>array2[i])
            {
                array3[i]=array1[i];
            }else
            {
                array3[i]=array2[i];
            }
        }
        for (int i = 0; i < 3; i++) 
        {        
        System.out.println("resultado: " + array3[i]);
            
        }
        
        
    }
    
    public static void invertirOrden()
    {
        int arrayInicial[]={33,77,55,11};
        int resultadoArray[];
        int indice=0;
        resultadoArray = new int[4];             
        
        for (int i=resultadoArray.length-1; i >=0; i--) 
        {
          resultadoArray[indice]=arrayInicial[i];
          indice++;            
        }
        for (int i = 0; i < 4; i++) 
        {           
        System.out.println("Invertido: " + resultadoArray[i]);
        }
    
    }    
    public static void sacarElMayor()
    {
        int arrayInicial[]={33,77,55,11};
        int resultadoArray[];
        int numMayor=arrayInicial[0];
        
        resultadoArray = new int[4];
        
        for (int i = 0; i < resultadoArray.length; i++) 
        {
            if (arrayInicial[i]>numMayor) 
            {
                numMayor=arrayInicial[i];
            }
        }
        
        System.out.println("el mayor es:  "+ numMayor);
    }
    
    public static void sacarElMenor()
    {
        int arrayInicial[]={33,77,55,11};
        int resultadoArray[];
        int numMenor=arrayInicial[0];
        
        resultadoArray = new int[4];
        
        for (int i = 0; i < resultadoArray.length; i++) 
        {
            if (arrayInicial[i]<numMenor) 
            {
                numMenor=arrayInicial[i];
            }
        }
        
        System.out.println("el menor es:  "+ numMenor);
    }
    
    public static void suma()
    {
        int arrayInicial[]={33,77,55,11};
        
        int suma=0;       
            
        for (int i = 0; i < arrayInicial.length; i++) 
        {
            suma = suma + arrayInicial[i];
        }
        System.out.println("La suma es: " + suma);
        
    }
    
    public static void promedio()
    {
        int arrayInicial[]={33,77,55,11};
        
        int suma=0;
        
               
        for (int i = 0; i < arrayInicial.length; i++) 
        {
            suma = suma + arrayInicial[i];
        }
        System.out.println("El promedio: " + suma/arrayInicial.length);
        
    }
}
