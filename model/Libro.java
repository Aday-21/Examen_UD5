
package biblioteca.model;

public class Libro extends ItemBiblioteca {

    // Atributos
    public String autor;
    public int numeroPaginas;
    
    public Libro (int id, String titulo, int anioPublicacion, String autor, int numeroPaginas){
        super(id, titulo, anioPublicacion);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public String getautor(){
        return autor;
    }
    
    public void setautor(){
        this.autor = autor;
    }
    
    public int getnumeroPaginas(){
        return numeroPaginas;
    }
    
    public void setnumeroPaginas(){
        this.numeroPaginas = numeroPaginas;
    }
      
    @Override
    public String obtenerDescripcion() {
        return "Titulo "+ gettitulo() +"de "+ getautor();
    }
    
    @Override
    public String toString(){
    return "Autor; "+ autor +
           "numeroPaginas; "+ numeroPaginas;
    }
    
}
