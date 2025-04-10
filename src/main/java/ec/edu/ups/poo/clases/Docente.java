package ec.edu.ups.poo.clases;

import java.util.List;

public class Docente {

    private List<String> titulosAcademicos;
    private List<String> areasDeEscpecializacion;

    public Docente() {
    }

    public Docente(List<String> titulosAcademicos, List<String> areasDeEscpecializacion) {
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
        return "Docente:" +
                "\nTítulos Académicos: " + titulosAcademicos +
                "\nÁreas de Especialización: " + areasDeEscpecializacion;
    }
}
