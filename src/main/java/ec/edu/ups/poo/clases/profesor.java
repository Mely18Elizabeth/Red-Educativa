package ec.edu.ups.poo.clases;

import java.util.List;

public class profesor {

    private List<String> titulosAcademicos;
    private List<String> areasDeEscpecializacion;

    public profesor(){

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
}
