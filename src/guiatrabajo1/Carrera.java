/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiatrabajo1;

/**
 *
 * @author FERNEY JARAMILLO
 */
public class Carrera implements Comparable {

    
    private char codigoCarrera[];
    private char nombreCarrera[];

    public Carrera() {
    }

    @Override
    public boolean equals (Object obj){
       
        Carrera c= (Carrera)obj ;
        
        if (this.codigoCarrera.length!= c.codigoCarrera.length){
        
            return false ;
        
        
        }
        for (int i = 0 ; i<this.codigoCarrera.length;i++){
        
        if ( this.codigoCarrera[i]!=c.codigoCarrera[i]){
        
            return false ;
        
        }
         
        }
        return true ;
  
    }
  
    public int compareTo(Object obj) {
        
        Carrera c = (Carrera)obj ;
        
        for ( int i = 0; i<this.codigoCarrera.length;i++){
                
            if ( this.codigoCarrera[i]>c.codigoCarrera[i]){
            
                
                return 1;
            
            }
        
          if ( this.codigoCarrera[i]<c.codigoCarrera[i]){
            
                
                return -1;
            
            }
        
        }
        return 0;
    }

    @Override
    public int compareTo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public char[] getCodigoCarrera() {
        return codigoCarrera;
    }

    public char[] getNombreCarrera() {
        return nombreCarrera;
    }

    public void setCodigoCarrera(char[] codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public void setNombreCarrera(char[] nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
    
    
    
    
}
