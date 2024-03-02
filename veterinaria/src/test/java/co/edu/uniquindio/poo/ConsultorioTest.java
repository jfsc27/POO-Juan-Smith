package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        LOG.info("Finalizando test registrar mascota");
    }

    @Test
    public void registrarMascotaMayor(){
        LOG.info("Iniciando test registrar mascota mayor");
        Consultorio consultorio = new Consultorio("Amigos peludos");
        Mascota mascota = new Mascota("29308", "Zeus", "Perro", "Golden retriever", (byte) 4, "Macho", "Dorado", (byte) 26);
        consultorio.registrarMascotaMayor(mascota);
        LOG.info("Finalizando test registrar mascota mayor");
    }

    @Test
    public void datosNulos (){
        LOG.info("Iniciando test datos nulos");
        assertThrows(Throwable.class, () -> new Consultorio(null));
        LOG.info("Finalizando test datos nulos");
    }
}
