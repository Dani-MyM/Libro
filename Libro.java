
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
    private int numeroPaginas;
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas )
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
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
    
    /**
     * Devuelve el valor del numero de paginas que tiene el libro.
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    /**
     * Imprime por pantalla los detalles relativos al autor, titulo
     * y numero de paginas del libro en la ventana de la terminal.
     */
    public void imprimirDetalles() {
        System.out.println("Título = " + titulo);
        System.out.println("Autor = " + autor);
        System.out.println("Páginas = " + numeroPaginas);
        if (numeroReferencia != "") {
            System.out.println("ZZZ");
        } else {
            System.out.println("Numero de referencia = " + numeroReferencia);
        }
    }
    
    /**
     * Devuelve lo que el metodo imprimirDetalles muestra por pantalla.
     */
    public String getDetalles() {
        if (numeroReferencia != "") {
            return ("ZZZ");
        } else {
            return ("Título = " + titulo + "/" + "Autor = " + autor  + "/" + "Páginas = " + numeroPaginas + "/" + "Numero de referencia = " + numeroReferencia);
        }
    }
    
    /**
     * Devuelve el numero de referencia del libro.
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }    
    
    /**
     * Permite cambiar el valor del numero de referencia.
     */
    public void setNumeroReferencia(String numeroDeReferencia) {
        if (numeroReferencia.length() >= 3) {
            numeroReferencia = numeroDeReferencia;
        } else {   
            System.out.println("ERROR - La cadena es medasiado corta");
        }  
    }    
}
