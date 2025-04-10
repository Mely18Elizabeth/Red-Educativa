package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.*;
import ec.edu.ups.poo.enums.TipoDireccion;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        // Crear Institución 1
        Institucion institucion1 = new Institucion();
        institucion1.setIdentificacionSede(1);
        institucion1.setNombreInstitucion("Ups");
        institucion1.setSede(Arrays.asList("Cuenca", "Guayaquil", "Quito"));
        institucion1.setFechaInicio(new GregorianCalendar(1970, 4, 5));
        institucion1.addDireccion(new Direccion(TipoDireccion.INSTITUCION, "Ecuador", "Azuay", "Cuenca", "San Joaquin", "Ter", "127"));

        // Crear Estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Mel");
        estudiante.setApellido("Pin");
        estudiante.setCedula("01093");
        estudiante.setCorreo("mpintado@est.ups.edu.ec");
        estudiante.setTelefono("0984181747");
        estudiante.setCarrera("Computación");
        estudiante.setPrograma("Ingenieria");
        estudiante.setMatricula(true);
        estudiante.addDireccion(new Direccion(TipoDireccion.CASA, "Ecuador", "Azuay", "Cuenca", "Américas", "uni", "83"));

        // Crear Docente
        Docente docente = new Docente();
        docente.setNombre("ped");
        docente.setApellido("ost");
        docente.setCedula("8934");
        docente.setCorreo("ewghw@ups.edu.ec");
        docente.setTelefono("93873");
        docente.addDireccion(new Direccion(TipoDireccion.INSTITUCION, "Ecuador", "Azuay", "Cuenca", "Av. de las Américas", "UPS", "1234"));

        // Asignar personas a la Institución 1
        institucion1.addAsignacion(new Asignacion(estudiante, new GregorianCalendar(2837, 6, 13), TipoRol.ESTUDIANTE));
        institucion1.addAsignacion(new Asignacion(docente, new GregorianCalendar(2934, 12, 5), TipoRol.DOCENTE));

        // Crear Institución 2
        Institucion institucion2 = new Institucion();
        institucion2.setIdentificacionSede(2);
        institucion2.setNombreInstitucion("Art");
        institucion2.setSede(List.of("Cuenca"));
        institucion2.setFechaInicio(new GregorianCalendar(1960, 5, 22));
        institucion2.addDireccion(new Direccion(TipoDireccion.INSTITUCION, "Ecuador", "Azuay", "Cuenca", "Av", "hja", "873"));

        Administrativo administrativo = new Administrativo();
        administrativo.setNombre("maria");
        administrativo.setApellido("luz");
        administrativo.setCedula("873274");
        administrativo.setCorreo("bhjdhjd@cuenca.edu.ec");
        administrativo.setTelefono("8732");
        administrativo.addDireccion(new Direccion(TipoDireccion.CASA, "Ecuador", "Azuay", "Cuenca", "CalleP", "CalleS", "6736"));

        Visitante visitante = new Visitante();
        visitante.setNombre("eli");
        visitante.setApellido("pill");
        visitante.setCedula("837");
        visitante.setCorreo("eli@.edu.ec");
        visitante.setTelefono("837384");
        visitante.setMotivoVisita("traba");
        visitante.setFechaEntrada(new GregorianCalendar(2025, 3, 15));
        visitante.setFechaSalida(new GregorianCalendar(2025, 3, 18));
        visitante.addDireccion(new Direccion(TipoDireccion.CASA, "Ecuador", "Azuay", "Cuenca", "park", " mons", "735"));

        // Asignar personas a la Institución 2
        institucion2.addAsignacion(new Asignacion(administrativo, new GregorianCalendar(2020, 11, 9), TipoRol.ADMINISTRATIVO));
        institucion2.addAsignacion(new Asignacion(visitante, new GregorianCalendar(2025, 5, 1), TipoRol.VISITANTE));

        // Mostrar la información de cada institución y personas
        System.out.println("Institución 1: " + institucion1.getNombreInstitucion());
        System.out.println(estudiante);
        System.out.println(docente);

        System.out.println("\nInstitución 2: " + institucion2.getNombreInstitucion());
        System.out.println(administrativo);
        System.out.println(visitante);
    }
}
