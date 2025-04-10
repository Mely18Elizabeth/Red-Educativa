package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.TipoDireccion;

public class Direccion {

    private TipoDireccion tipoDireccion;
    private String ciudad;
    private String callePrincipal;
    private String calleSecundaria;
    private String provincia;
    private String pais;
    private String tipoVivienda;
    private String numeracion;

    public Direccion() {}

    public Direccion(TipoDireccion tipoDireccion, String ciudad, String callePrincipal, String calleSecundaria, String provincia, String pais, String tipoVivienda, String numeracion) {
        this.tipoDireccion = tipoDireccion;
        this.ciudad = ciudad;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.provincia = provincia;
        this.pais = pais;
        this.tipoVivienda = tipoVivienda;
        this.numeracion = numeracion;
    }

    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    @Override
    public String toString() {
        return "Dirección:" +
                "\nTipo de Dirección: " + tipoDireccion +
                "\nPaís: " + pais +
                "\nProvincia: " + provincia +
                "\nCiudad: " + ciudad +
                "\nCalle Principal: " + callePrincipal +
                "\nCalle Secundaria: " + calleSecundaria +
                "\nTipo de Vivienda: " + tipoVivienda +
                "\nNumeración: " + numeracion;
    }
}
