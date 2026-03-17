
package biblioteca.model;

public class Autor {
    private String nombre;
    private String nacionalidad;
    
    public Autor (String nombre, String nacionalidad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setnombre(){
        this.nombre = nombre;
    }
    
    public String getnacionalidad(){
        return nacionalidad;
    }
    
    public void setnacionalidad(){
        this.nacionalidad = nacionalidad;
    }
    
    @Override
    public String toString(){
    return "Nombre; "+ nombre +
           "Nacionalidad; "+ nacionalidad;
    }
    
}
