/**
 * Clase para probar el funcionamiento del código para la veterinaria
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());


    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");
        Mascota mascota = new Mascota("29308", "Zeus", "Perro", "Golden retriever", (byte) 4, "Macho", "Dorado", (byte) 26);
        assertEquals("29308", mascota.id());
        assertEquals("Zeus", mascota.nombre());
        assertEquals("Perro", mascota.especie());
        assertEquals("Golden retriever", mascota.raza());
        assertEquals((byte) 4, mascota.edad());
        assertEquals("Macho", mascota.genero());
        assertEquals("Dorado", mascota.color());
        assertEquals((byte) 26, mascota.peso());
        LOG.info("Finalizando test datos completos");
    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciado test datos nulos");
        assertThrows(Throwable.class, () -> new Mascota(null, null, null, null, (byte) 0, null, null, (byte) 0));
        LOG.info("Finalizando test datos nulos");
    }

    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datos vacios");
        assertThrows(Throwable.class, () -> new Mascota("", "", "", "", (byte) 0, "", "", (byte) 0));
        LOG.info("Finalizando test datos vacios");
    }

    @Test
    public void edadNegativa() {
        LOG.info("Iniciado test edad negativa");
        assertThrows(Throwable.class, () -> new Mascota("29308", "Zeus", "Perro", "Golden retriever", (byte) -4, "Macho", "Dorado", (byte) 26));
        LOG.info("Finalizando test edad negativa");
    }

    @Test
    public void pesoNegativo() {
        LOG.info("Iniciado test peso negativo");
        assertThrows(Throwable.class, () -> new Mascota("29308", "Zeus", "Perro", "Golden retriever", (byte) 4, "Macho", "Dorado", (byte) -26));
        LOG.info("Finalizando test peso negativo");
    }
}
