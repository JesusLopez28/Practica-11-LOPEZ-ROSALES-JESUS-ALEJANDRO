/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg11.lopez.rosales.jesus.alejandro;

public class Alumno {

    private String nombre;
    private String apellido;
    private int matricula;
    private String carrera;
    private Alumno alumnoSiguiente;

    public Alumno(String nombre, String apellido, int matricula, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public Alumno() {
        this.nombre = "";
        this.apellido = "";
        this.matricula = 0;
        this.carrera = "";
        this.alumnoSiguiente = null;
    }

    public Alumno getAlumnoSiguiente() {
        return alumnoSiguiente;
    }

    public void setAlumnoSiguiente(Alumno alumnoSiguiente) {
        this.alumnoSiguiente = alumnoSiguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}
