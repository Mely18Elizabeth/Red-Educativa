package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.TipoDireccion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Institucion {

    private List<String> sede;
    private String nombreInstitucion;
    private int identificacionSede;
    private String ubicacion;
    private Direccion direccion;
    private GregorianCalendar fechaInicio;

    public Institucion() {
        this.sede = new ArrayList<>();
    }

    public Institucion(List<String> sede, String nombreInstitucion, int identificacionSede, String ubicacion, GregorianCalendar fechaInicio) {
        this.sede = sede;
        this.nombreInstitucion = nombreInstitucion;
        this.identificacionSede = identificacionSede;
        this.ubicacion = ubicacion;
        this.fechaInicio = fechaInicio;
    }

    public List<String> getSede() {
        return sede;
    }

    public void setSede(List<String> sede) {
        this.sede = sede;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public int getIdentificacionSede() {
        return identificacionSede;
    }

    public void setIdentificacionSede(int identificacionSede) {
        this.identificacionSede = identificacionSede;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void addDireccion(TipoDireccion tipoDireccion, String pais, String provincia, String ciudad, String callePrincipal, String calleSecundaria, String numeracion) {
        this.direccion = new Direccion(tipoDireccion, ciudad, callePrincipal, calleSecundaria, provincia, pais, null, numeracion);
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = (fechaInicio != null) ? formato.format(fechaInicio.getTime()) : "Sin fecha";

        return "Identificación de Sede: " + identificacionSede +
                "\nNombre Institución: " + nombreInstitucion +
                "\nUbicación: " + ubicacion +
                "\nSedes: " + sede +
                "\nFecha de Inicio: " + fechaFormateada +
                "\nDirección: " + (direccion != null ? direccion.toString() : "No asignada");
    }
}
