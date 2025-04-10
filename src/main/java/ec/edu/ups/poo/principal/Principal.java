package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.*;
import ec.edu.ups.poo.enums.TipoDireccion;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Institucion institucion1 = new Institucion();
        institucion1.setIdentificacionSede(1);
        institucion1.setNombreInstitucion("Ups");
        institucion1.setSede(Arrays.asList("Cuenca", "Guayaquil", "Quito"));
        institucion1.setFechaInicio(new GregorianCalendar(1970, 4, 5));

        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Mel");
        estudiante.setApellido("Pin");
        estudiante.setCedula("01093");
        estudiante.setCorreo("mpintado@est.ups.edu.ec");
        estudiante.setTelefono("0984181747");
        estudiante.setCarrera("Computación");
        estudiante.setPrograma("Ingenieria");
        estudiante.setMatricula(true);

        Docente docente = new Docente();
        docente.setNombre("ped");
        docente.setApellido("ost");
        docente.setCedula("8934");
        docente.setCorreo("ewghw@ups.edu.ec");
        docente.setTelefono("93873");


        Institucion institucion2 = new Institucion();
        institucion2.setIdentificacionSede(2);
        institucion2.setNombreInstitucion("artico");
        institucion2.setSede(List.of("Cuenca"));
        institucion2.setFechaInicio(new GregorianCalendar(1960, 5, 22));

        Administrativo administrativo = new Administrativo();
        administrativo.setNombre("maria");
        administrativo.setApellido("luz");
        administrativo.setCedula("873274");
        administrativo.setCorreo("bhjdhjd@cuenca.edu.ec");
        administrativo.setTelefono("8732");

        Visitante visitante = new Visitante();
        visitante.setNombre("eli");
        visitante.setApellido("pill");
        visitante.setCedula("837");
        visitante.setCorreo("eli@.edu.ec");
        visitante.setTelefono("837384");
        visitante.setMotivoVisita("traba");
        visitante.setFechaEntrada(new GregorianCalendar(2025, 3, 15));
        visitante.setFechaSalida(new GregorianCalendar(2025, 3, 18));

        System.out.println("Institución 1: " + institucion1.getNombreInstitucion());
        System.out.println(estudiante);
        System.out.println(docente);

        System.out.println("\nInstitución 2: " + institucion2.getNombreInstitucion());
        System.out.println(administrativo);
        System.out.println(visitante);
    }
}
