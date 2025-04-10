package ec.edu.ups.poo.clases;

import java.util.List;

public class Docente extends Persona {

    private List<String> titulosAcademicos;
    private List<String> areasDeEscpecializacion;

    public Docente() {
        super();
    }

    public Docente(List<String> titulosAcademicos, List<String> areasDeEscpecializacion) {
        super();
        this.titulosAcademicos = titulosAcademicos;
        this.areasDeEscpecializacion = areasDeEscpecializacion;
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasDeEscpecializacion() {
        return areasDeEscpecializacion;
    }

    public void setAreasDeEscpecializacion(List<String> areasDeEscpecializacion) {
        this.areasDeEscpecializacion = areasDeEscpecializacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTítulos Académicos: " + titulosAcademicos +
                "\nÁreas de Especialización: " + areasDeEscpecializacion;
    }
}
