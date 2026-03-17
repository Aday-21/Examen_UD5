
package biblioteca.app;

import biblioteca.model.Libro;
import biblioteca.model.Revista;

public class Main {
    public static void main(String[] args){
        
        Libro lib1 = new Libro(1, "Caperucita roja", 2009, "Aday", 49);
        Revista rev1 = new Revista(2, "Accidente de coche", 2026, 3, "Mañana");
        
        System.out.println(lib1.obtenerDescripcion());
        System.out.println(lib1);
        
        System.out.println(rev1.obtenerDescripcion());
        System.out.println(rev1);
    }
   
}
