package ec.edu.ups.poo.clases;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Visitante extends Persona {

    private String motivo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public Visitante() {
        super();
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

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String entrada = (fechaEntrada != null) ? sdf.format(fechaEntrada.getTime()) : "No registrada";
        String salida = (fechaSalida != null) ? sdf.format(fechaSalida.getTime()) : "No registrada";

        return super.toString() +
                "\nMotivo de visita: " + motivo +
                "\nFecha de entrada: " + entrada +
                "\nFecha de salida: " + salida;
    }
}
