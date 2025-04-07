package ec.edu.ups.poo.clases;

import java.util.List;

public class trabajador {

    private List<String> cargos;
    private List<String> responsabilidades;

    public trabajador(){}

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }
}
