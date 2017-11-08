/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * 
 * @author alumno
 */
public class Objetos {

    /**
     * necesito una lapicera con 2 colores. rojo y azul.
     * cada uno tiene una cantidad de 100
     * el metodo escribir recibe el color escribir ("rojo", 100)
     * y la cantidad de tinta a utilizar, 
     * de no tener la cantidad suficiente se muestra un mensaje
     * 
     * el metodo cargar tinta recibe el color cargar("rojo",100)
     * y la cantidad para cargar
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        lapicera algunaLapicera = new lapicera();
        
        algunaLapicera.escribir("rojo", 120);
        algunaLapicera.cargar("azul", 50);
        algunaLapicera.escribir("rojo", 90);
    }
    
    
    
    
    
}
