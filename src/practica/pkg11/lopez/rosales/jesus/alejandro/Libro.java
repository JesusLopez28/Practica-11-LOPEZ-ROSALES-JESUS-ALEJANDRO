/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg11.lopez.rosales.jesus.alejandro;

public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String editorial;
    private Libro libroSiguiente;

    public Libro(String titulo, String autor, int añoPublicacion, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
    }

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.añoPublicacion = 0;
        this.editorial = "";
        this.libroSiguiente = null;
    }

    public Libro getLibroSiguiente() {
        return libroSiguiente;
    }

    public void setLibroSiguiente(Libro libroSiguiente) {
        this.libroSiguiente = libroSiguiente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
