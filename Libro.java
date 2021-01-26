
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
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, boolean libroTexto) {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroTexto;
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
        System.out.println("Veces Prestado =" + vecesPrestado);
        String texto;
         if(esLibroDeTexto == true){
            texto = "Sí";
        }
        else{
            texto = "No";
        }
        System.out.println("¿Es libro de texto?" + texto);
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
        String detallesLibro;
        String numeroDeReferencia = numeroReferencia;
        String texto;
        if(numeroDeReferencia != ""){
            numeroReferencia = numeroDeReferencia;          
        }
        else{
            numeroDeReferencia = "ZZZ";
        }
        if(esLibroDeTexto == true) {
            texto = "Si";
        }
        else {
            texto = "No";
        }
        detallesLibro = ("Número de referencia = " + numeroDeReferencia + ", Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + "Veces Prestado: " + vecesPrestado + " ¿Es libro de texto?" + texto);
        return detallesLibro;           
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
        if (numeroDeReferencia.length() >= 3) {
            numeroReferencia = numeroDeReferencia;
        } else {   
            System.out.println("ERROR - La cadena es medasiado corta");
        }  
    } 
    
    /**
     * Incrementa en uno el atributo vecesPrestado.
     */
    public void prestar() {
        vecesPrestado++;
    }
    
    /**
     * Muestra las veces que se presta el libro.
     */
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    
    /**
     * Se usa para ver si es libro de texto o no.
     */
    public boolean getEsLibroDeTexto() {
        return esLibroDeTexto;
    }
}
    
    
