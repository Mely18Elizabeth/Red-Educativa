package ec.edu.ups.poo.clases;

public class direccion {
    private String ciudad;
    private String callePrincipal;
    private String calleSecundaria;
    private String provinicia;
    private String pais;

    public direccion (){}

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

    public String getProvinicia() {
        return provinicia;
    }

    public void setProvinicia(String provinicia) {
        this.provinicia = provinicia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}


