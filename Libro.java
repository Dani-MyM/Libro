
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
    }
    
    /**
     * Devuelve el valor del atributo del autor del libro.
     */
    public String getAutorLibro() {
        return autor;
    }
    
    /**
     * Devuelve el valor del atributo del titulo del libro.
     */
    public String getTituloLibro() {
        return titulo;
    }
    
    /**
     * Muestra por pantalla los atributos del autor.
     */
    public void imprimeAutor() {
        System.out.println(autor);
    }
    
    /**
     * Muestra por pantalla los atributos del titulo.
     */
    public void imprimeTitulo() {
        System.out.println(titulo);
    }
    
}
