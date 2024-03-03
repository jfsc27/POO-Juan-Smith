package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ConsultorioTest {
    private static final Logger LOG = Logger.getLogger(ConsultorioTest.class.getName());

    @Test
    public void datosCompletos (){
        LOG.info("Iniciando test datos completos");
        Consultorio consultorio = new Consultorio("Amigos peludos");
        assertEquals("Amigos peludos", consultorio.getNombre());
        LOG.info("Finalizando test datos completos");
    }

    @Test
    public void registrarMascota(){
        LOG.info("Iniciando test registrar mascota");
        Consultorio consultorio = new Consultorio("Amigos peludos");
        Mascota mascota = new Mascota("29308", "Zeus", "Perro", "Golden retriever", (byte) 4, "Macho", "Dorado", (byte) 26);
        consultorio.registrarMascota(mascota);
        assertTrue(consultorio.getListaMascota().contains(mascota));
        assertEquals(1, consultorio.getListaMascota().size());
        LOG.info("Finalizando test registrar mascota");
    }

    @Test
    public void registrarMascotaMayor(){
        LOG.info("Iniciando test registrar mascota mayor");
        Consultorio consultorio = new Consultorio("Amigos peludos");
        Mascota mascota = new Mascota("29308", "Zeus", "Perro", "Golden retriever", (byte) 12, "Macho", "Dorado", (byte) 26);
        consultorio.registrarMascotaMayor(mascota);
        assertTrue(consultorio.getListaMascotaMayor().contains(mascota));
        assertEquals(1, consultorio.getListaMascotaMayor().size());
        LOG.info("Finalizando test registrar mascota mayor");
    }

    @Test
    public void datosNulos (){
        LOG.info("Iniciando test datos nulos");
        assertThrows(Throwable.class, () -> new Consultorio(null));
        LOG.info("Finalizando test datos nulos");
    }

    @Test
    public void agregarMascotaRepetida() {
        LOG.info("Inicio agregarEstudianteRepetido");
        Consultorio consultorio = new Consultorio("Amigos peludos");
        Mascota mascota = new Mascota("29308", "Zeus", "Perro", "Golden retriever", (byte) 4, "Macho", "Dorado", (byte) 26);
        Mascota mascota2 = new Mascota("29308", "Zeus", "Perro", "Golden retriever", (byte) 4, "Macho", "Dorado", (byte) 26);
        consultorio.registrarMascota(mascota);
        assertThrows(Throwable.class, () -> consultorio.registrarMascota(mascota2));
        LOG.info("Finalización agregarEstudianteRepetido");
    }

}
