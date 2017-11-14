/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;

import java.time.Instant;

/**
 *
 * @author alumno
 */
public class carrera {
    
    public auto[] AutoParticipantes;
    private String fecha;
    private String Pais;
    
    
    /**
     * 1- no tiene valor de retorno.
     * 2- se llama igual que la clase.
     * 3- el por defecto, puede estar o no.
     * 4- se ejecuta solamente al crear al objeto.
     * 
     */
    
    public carrera()//contructor
    {
       this.fecha=Instant.now().toString();
       this.Pais="argentina";
       this.AutoParticipantes=new auto[20];
       this.crearAutosTest();
    }
    
    private void crearAutosTest()
    {
        for(int i=0; i<this.AutoParticipantes.length; i++)
        {
            this.AutoParticipantes[i]=new auto(i);
        }
    }
    
    public void correrCarrera(int cantidadDeVueltas)
    {
        for(int vueltas=0; vueltas<cantidadDeVueltas; vueltas++)
        {
            for(int i=0; i<this.AutoParticipantes.length;i++)
            {
                int random=(int)(Math.random()*100);
                this.AutoParticipantes[i].agregarTiempoRecorrido(random);
            }
        }
    }
    
    public auto dameElGanador()
    {
        auto retorno= new auto(0);
        int menorRecorrido=0;
        
        for (int i = 0; i < this.AutoParticipantes.length; i++) 
        {
            if(i==0)
            {
                menorRecorrido=this.AutoParticipantes[i].dameTiempoRecorrido();
                retorno = this.AutoParticipantes[i];
            }else
            {
                if(menorRecorrido>this.AutoParticipantes[i].dameTiempoRecorrido())
                {
                    menorRecorrido=this.AutoParticipantes[i].dameTiempoRecorrido();
                    retorno = this.AutoParticipantes[i];
                }
            }
        }
        
        return retorno;
    }
    
}
