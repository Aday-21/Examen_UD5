
package biblioteca.model;


public abstract class ItemBiblioteca {
    
    // Atributos encapsulados
    private int id;
    private String titulo;
    private int anioPublicacion;
    
    // Constructor
    public ItemBiblioteca(int id, String titulo, int anioPublicacion){
        this.id  = id;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }
    
    public int getid(){
        return id;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public String gettitulo(){
        return titulo;
    }
    
    public void settitulo(){
        this.titulo = titulo;
    }
    
    public int getanioPublicacion(){
        return anioPublicacion;
    }
    
    public void setanioPublicacion(){
        this.anioPublicacion = anioPublicacion;
    }
    
    
    // Metodo abstracto
    public abstract String obtenerDescripcion();
    
    // Sobreescribir
    @Override
    public String toString(){
    return "ID; "+ id +
            "Titulo; "+ titulo +
            "Anio de Publicacion; "+ anioPublicacion;
    }
    
}
