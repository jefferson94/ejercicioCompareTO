/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package guiatrabajo1;

/**
 *
 * @author FERNEY JARAMILLO
 */
public class Persona implements Comparable {

    private char nombre[];
    private char codigo[];
    private Carrera mcarrera ;

    public Persona() {
    }

   
    //nuevooooooooooooooooooooooooooooo

    public boolean equals(Object obj) {

        Persona p = (Persona) obj;

        if (this.mcarrera.equals(p.mcarrera)) {

            if (this.getNombre().length != p.getNombre().length) {

                return false;

            }
            for (int i = 0; i < this.getNombre().length; i++) {


                if (this.nombre[i] != p.nombre[i]) {

                    return false;

                }

            }
            return true;


        }

        return false;
    }

    
    
    
    public int compareTo (Object obj){
       Persona p = (Persona )obj;
       
     
      
       int c = (this.mcarrera.compareTo(p.mcarrera));
        
       
        if ( c==0){
        
         for (int i = 0; i < this.getNombre().length; i++) {


                if (this.nombre[i] != p.nombre[i]) {

                    return -1;

                }

            }
       
        
        }
        return c;
    }
        
        
        

    public char[] getNombre() {
        return nombre;
    }

    public char[] getCodigo() {
        return codigo;
    }

   

    @Override
    public int compareTo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
