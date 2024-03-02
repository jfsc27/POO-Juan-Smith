package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CursoTest {
     private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());


     @Test
     public void datosCompletos(){
        LOG.info("Iniciando test datos completos");
        Curso curso = new Curso ("Programacion 1");
        assertEquals("Programacion 1", curso.getNombre());
        LOG.info("Finalizando test datos completos");
     }

     @Test
     public void registrarEstudiante(){
        LOG.info("Iniciando test registrar estudiante");
        Curso curso = new Curso ("Programacion 1");
        Estudiante estudiante = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co",
                "315635674", 18);
        curso.registrarEstudiante(estudiante);      
        LOG.info("Finalizando test registrar estudiante");
     }
}
