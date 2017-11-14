/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;

/**
 *
 * @author alumno
 */
public class piloto {
    
    private String nombre;
    private String apellido;
    
    public piloto()
    {
        this.nombre="natalia";
        this.apellido="requena";
    }
    
    public void SetterNombre(String nombre)
    {
        this.nombre=nombre;
        
    }
    
    public void SetterApellido(String apellido)
    {
        this.apellido=apellido;
        
    }
    
    public String DameNombreCompletoMay()
    {
        String retorno="";
        
        retorno = this.nombre.toUpperCase() +" "+ this.apellido.toUpperCase();
        
        
        
        return retorno;
    }
}
