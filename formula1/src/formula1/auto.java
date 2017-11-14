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
public class auto {
        private int numero;
        private Escuderia miEscuderia;
        private String modelo;
        private piloto elPiloto;
        private int tiempoRecorrido;
        
        public auto(int numero)
        {
            this.elPiloto=new piloto();
            
            this.modelo="Ford";
            this.numero=numero;
            this.miEscuderia = new Escuderia(1930, "italia", "ferrari");            
            this.CargarPilotoRandom();
            // hacer this.cargarEscuderia();
        }
        
        public void mostrar()
        {
            System.out.println("numero "+this.numero);
            System.out.println("escuderia "+this.miEscuderia.Nombre);
            System.out.println("modelo "+this.modelo);
            System.out.println("piloto "+this.elPiloto.DameNombreCompletoMay());
            System.out.println("tiempo recorrido "+this.tiempoRecorrido);



        }
        
        public int dameTiempoRecorrido()
        {
            return this.tiempoRecorrido;
        }
        
        public void agregarTiempoRecorrido(int tiempo)
        {
            this.tiempoRecorrido= this.tiempoRecorrido+tiempo;
        }
        
        
        
        private void CargarPilotoRandom()
        {
            this.nombreRandom();
            this.apellidoRandom();
        }
                    
        private void nombreRandom()
        {
            int miRandom=(int)(Math.random()*10);
            
            switch(miRandom)
            {
                case 0:
                       this.elPiloto.SetterNombre("agustina");
                break;
                case 1:
                       this.elPiloto.SetterNombre("flavia");
                break;
                case 2:
                       this.elPiloto.SetterNombre("norman");
                break;
                case 3:
                       this.elPiloto.SetterNombre("diego");
                break;
                case 4:
                       this.elPiloto.SetterNombre("ronaldo");
                break;
                case 5:
                       this.elPiloto.SetterNombre("santi");
                break;
                case 6:
                       this.elPiloto.SetterNombre("juan");
                break;
                case 7:
                       this.elPiloto.SetterNombre("julian");
                break;
                case 8:
                       this.elPiloto.SetterNombre("pedro");
                break;
                case 9:
                       this.elPiloto.SetterNombre("luis");
                break;
                
            }
        }
        
        private void apellidoRandom()
        {
            int miRandom=(int)(Math.random()*10);
            
            switch(miRandom)
            {
                case 0:
                       this.elPiloto.SetterApellido("agua");
                break;
                case 1:
                       this.elPiloto.SetterApellido("fuego");
                break;
                case 2:
                       this.elPiloto.SetterApellido("aire");
                break;
                case 3:
                       this.elPiloto.SetterApellido("tierra");
                break;
                case 4:
                       this.elPiloto.SetterApellido("viento");
                break;
                case 5:
                       this.elPiloto.SetterApellido("sol");
                break;
                case 6:
                       this.elPiloto.SetterApellido("florencio");
                break;
                case 7:
                       this.elPiloto.SetterApellido("pirlo");
                break;
                case 8:
                       this.elPiloto.SetterApellido("messi");
                break;
                case 9:
                       this.elPiloto.SetterApellido("garcia");
                break;
            }
        }
    
}
