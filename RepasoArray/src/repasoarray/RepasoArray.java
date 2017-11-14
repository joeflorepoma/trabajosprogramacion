/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoarray;

/**
 *
 * @author alumno
 */
public class RepasoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //int[] listadoNumerosMain;
        
        //listadoNumerosMain=RepasoArray.RetornarArrayDeRandom();
        
      
        //RepasoArray.CrearArray();
        //listadoNumerosMain=RepasoArray.RetornarArray();
//        listadoNumerosMain=RepasoArray.RetornarArrayDeRandomConCantidad(10);
//        RepasoArray.MostrarArray(listadoNumerosMain);
//        int cantidadA=RetornarCantidadDeAprobados(listadoNumerosMain);
//        int cantidadB=RetornarCantidadDeDesaprobados(listadoNumerosMain);
//        float promedio=Retornarpromedio(listadoNumerosMain);
        
        /*for (int i = 0; i < 3; i++) {
                    
        System.out.println("El array es: " +listadoNumerosMain[i]);
        
        }*/
//        int retornorandom=RepasoArray.RetornarRandon();
//        retornorandom=RepasoArray.RetornarRandon();
//        retornorandom=RepasoArray.RetornarRandon();
//        retornorandom=RepasoArray.RetornarRandon();

//        int[] notasUBA=RetornarArrayDeRandomConCantidad(3);
//        int[] notasUTN=RetornarArrayDeRandomConCantidad(3);
        
        
        //String devolucion=RetornarQuienTieneMejorPromedio(notasUBA, notasUTN);
        //int[] elMejor=RepasoArray.retornarMejoresNotasArray(notasUBA, notasUTN);
//        int elMejor=RepasoArray.retornarMejorNota(notasUBA);
//        int elMejor2=RepasoArray.retornarMejorNota(notasUTN);
//        
//        int elPeor=RepasoArray.retornarPeorNota(notasUBA);
//        int elPeor2=RepasoArray.retornarPeorNota(notasUTN);

    String[] datosTotales=RepasoArray.retornarNombresRandom();
        
        
    }
    
    public static String[] retornarNombresRandom()
    {
        String[] datos = new String[10];
        String[] nombres={"rogelio", "alfredo", "julieta", "miguel", "jose", "maria","tina", "cristina", "elton", "jorge"};
        String[] apellidos={"agua", "mercurio", "roberto", "zorro", "ef", "fg", "gh", "hi", "ij", "jk"};
        
        for (int i = 0; i < datos.length; i++) 
        {
            datos[i] = nombres[i] +" "+ apellidos[i];
        }
        
        return datos;
    }   
    
    public static int retornarMejorNota(int[] arrayParametro)
    {
        int mejor=arrayParametro[0];
        
        for (int i = 0; i < arrayParametro.length; i++) 
        {
            if(arrayParametro[i]>mejor)
            {
                mejor=arrayParametro[i];
            }
        }
                
        return mejor;
    }
    
    public static int retornarPeorNota(int[] arrayParametro)
    {
        int peor=arrayParametro[0];
        
        for (int i = 0; i < arrayParametro.length; i++) 
        {
            if(arrayParametro[i]<peor)
            {
                peor=arrayParametro[i];
            }
        }
        
        return peor;
    }
    
    public static int[] retornarMejoresNotasArray(int[] uno, int[] dos)
    {
        int[] retorno=new int[uno.length];
        
        for (int i = 0; i < uno.length; i++) 
        {
            if(uno[i]>dos[i])
            {
                retorno[i]=uno[i];
            }else
            {
                retorno[i]=dos[i];
            }
        }
        
        return retorno;
    }
    /**
     * Los parametros son 2 array de enteros
     * @return 
     * retorna"El primero tiene mejor promedio" 
     * o 
     * "El segundo tiene mejor promedio", 
     * segun quien tenga el mejor promedio de los 2 array de notas     * 
     */
    public static String RetornarQuienTieneMejorPromedio(int[] primerArray, int[] segundoArray)
    {
        String retorno = "el primero tiene mejor promedio";
        float primerPromedio;
        float segundoPromedio;
        
        primerPromedio=RepasoArray.Retornarpromedio(primerArray);
        segundoPromedio=RepasoArray.Retornarpromedio(segundoArray);
        
        if(primerPromedio<segundoPromedio)
        {
            retorno = "El segundo tiene mejor promedio";
        }
        
        return retorno;
    }
    
    public static float Retornarpromedio(int[] notas)
    {
        float promedio;
        int suma=0;
        
        for (int i = 0; i < notas.length; i++)
        {
            suma = suma + notas[i];
        }
        
        promedio = (float)suma/(float)notas.length;
        
        return promedio;
    }
    
    public static int RetornarCantidadDeDesaprobados(int[] ListadoDeNotas)
    {
        int retorno=0;
        
        for (int i = 0; i < ListadoDeNotas.length; i++) 
        {
            if(ListadoDeNotas[i]<4)
            {
                retorno++;
            }
        }
        
        return retorno;
    }
    
    public static int RetornarCantidadDeAprobados(int[] ListadoDeNotas)
    {
        int retorno=0;
        
        for (int i = 0; i < ListadoDeNotas.length; i++) 
        {
            if(ListadoDeNotas[i]>3)
            {
                retorno++;
            }
        }
        
        return retorno;
    }
    
    public static int[] RetornarArrayDeRandomConCantidad(int cantidad)
    {
        int[] arrayRetorno= new int[cantidad];
        
        for (int i = 0; i < arrayRetorno.length; i++) 
        {
            arrayRetorno[i]=RepasoArray.RetornarRandon();
            
        }
        
        return arrayRetorno;
    }
    
    public static void MostrarArray(int[] parametroArray)
    {
        for (int i = 0; i < parametroArray.length; i++) 
        {
            System.out.println("numero "+(i+1)+" : " +parametroArray[i]);
        }
    }
    
    public static int[] RetornarArrayDeRandom()
    {
        int[] retorno = new int[10];
        
        for (int i = 0; i < retorno.length; i++) 
        {
            retorno[i]=RepasoArray.RetornarRandon();
            
        }
        
        return retorno;
    }
    
    public static int RetornarRandon()
    {
        int numeroRandom=0;
        double randomAux = Math.random();
        randomAux=randomAux*10;
        
        numeroRandom=(int)randomAux;
        
        return numeroRandom;
    }
    
    public static int[] RetornarArray()
    {
        int[]arraynuevo={2,3,5};
        
        return arraynuevo;
        
    }
    
    public static void CrearArray()
    {
        int[] arrayNumeros;
        arrayNumeros = new int[3];
        arrayNumeros[0]=55;
        arrayNumeros[1]=-22;
        arrayNumeros[2]=33;
        
        int[]arrayNumeros2=new int[3];
        
        int[]arraynuevo={2,3,5};
        
    }
    
}
