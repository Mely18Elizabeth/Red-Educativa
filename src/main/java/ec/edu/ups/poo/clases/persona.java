package ec.edu.ups.poo.clases;

import java.util.List;

public class persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private List<direccion> direc;

    public persona(){}
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<direccion> getDirecciones() {
        return direc;
    }

    public void setDirecciones(List<direccion> direcciones) {
        this.direc = direcciones;
    }
}
