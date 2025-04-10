package ec.edu.ups.poo.clases;

public class Estudiante extends Persona {

    private String carrera;
    private String programa;
    private boolean matricula;

    public Estudiante() {
        super(); // Llamar al constructor de la clase Persona
    }

    public Estudiante(String cedula, String nombre, String apellido, String telefono, String correo, String carrera, String programa, boolean matricula) {
        super(cedula, nombre, apellido, telefono, correo);  // Llamamos al constructor de Persona
        this.carrera = carrera;
        this.programa = programa;
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +  // Llamamos al toString de Persona
                "Estudiante: " +
                "\nCarrera: " + carrera +
                "\nPrograma: " + programa +
                "\nMatrícula Activa: " + (matricula ? "Sí" : "No");
    }
}
