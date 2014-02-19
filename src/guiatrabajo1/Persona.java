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
    private char mcarrera[];

    public Persona() {
    }

    public Persona(char[] nombre, char[] codigo, char carrera[]) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.mcarrera = carrera;
    }

    public boolean equals(Object obj) {

        Persona p = (Persona) obj;

        if (this.mcarrera.equals(p.getMcarrera())) {

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

    
    
    // hay un error  cuando invoco el compareTo
    public int compareTo (Object obj){
       Persona p = (Persona )obj;
       
      
       //int c = (this.getCodigo().compareTo(p.getCodigo()));
        
        if ( c==0){
        
         for (int i = 0; i < this.getNombre().length; i++) {


                if (this.nombre[i] != p.nombre[i]) {

                    return -1;

                }

            }
        
        
        
        }
        
        return 1;
    
    
    
    
    
    }
    public char[] getNombre() {
        return nombre;
    }

    public char[] getCodigo() {
        return codigo;
    }

    public char[] getMcarrera() {
        return mcarrera;
    }

    @Override
    public int compareTo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
