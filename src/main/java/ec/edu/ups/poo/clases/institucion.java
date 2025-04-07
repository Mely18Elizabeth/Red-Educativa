package ec.edu.ups.poo.clases;
import  java.util.GregorianCalendar;


public class institucion {
    private GregorianCalendar fechaInicio;
    private String rol;
    private String identificacionSede;
    private String ubicacion;

    public institucion(){}

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getRole() {
        return rol;
    }

    public void setRole(String role) {
        this.rol = role;
    }

    public String getIdentificacionSede() {
        return identificacionSede;
    }

    public void setIdentificacionSede(String identificacionSede) {
        this.identificacionSede = identificacionSede;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
