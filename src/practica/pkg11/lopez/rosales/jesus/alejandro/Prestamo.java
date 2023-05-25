/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg11.lopez.rosales.jesus.alejandro;

public class Prestamo {

    private String alumno;
    private String libro;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Prestamo prestamoSiguiente;

    public Prestamo(String alumno, String libro, String fechaPrestamo, String fechaDevolucion) {
        this.alumno = alumno;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Prestamo() {
        this.alumno = "";
        this.libro = "";
        this.fechaPrestamo = "";
        this.fechaDevolucion = "";
        this.prestamoSiguiente = null;
    }

    public Prestamo getPrestamoSiguiente() {
        return prestamoSiguiente;
    }

    public void setPrestamoSiguiente(Prestamo prestamoSiguiente) {
        this.prestamoSiguiente = prestamoSiguiente;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

}
