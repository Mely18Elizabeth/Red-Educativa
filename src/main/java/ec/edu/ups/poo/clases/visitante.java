package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;

public class visitante {

    private String motivo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public visitante(){

    }
    public String getMotivoVisita() {
        return motivo;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivo = motivoVisita;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
