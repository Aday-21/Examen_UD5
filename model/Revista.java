
package biblioteca.model;


public class Revista extends ItemBiblioteca {
    
    public int numero;
    public String periocidad;
    
    public Revista (int id, String titulo, int anioPublicacion, int numero, String periocidad){
        super(id, titulo, anioPublicacion);
        this.numero = numero;
        this.periocidad = periocidad;
    }

    public int getnumero(){
        return numero;     
    }
    
    public void setnumero(){
        this.numero = numero;
        
    }
    
    public String getperiocidad(){
        return periocidad;
    }
    
    public void setperiocidad(){
        this.periocidad = periocidad;
    }
    
  
    @Override
    public String obtenerDescripcion() {
        return "Revista "+ gettitulo() +"numero "+ getnumero();
    }
    
    @Override
    public String toString(){
    return "Numero; "+ numero +
           "Periocidad; "+ periocidad;
    }
    
}
