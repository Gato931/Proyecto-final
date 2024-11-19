package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CamionTest {

  private static final Logger LOG = Logger.getLogger(CamionTest.class.getName());

  @Test
  public void datosVacios() {
    LOG.info("Iniciado test datosVacios");
    assertThrows(Throwable.class, () -> new Camion("", "", false, "", "", 0.0,false, false, false, 1, ""));
    LOG.info("Finalizando test datosVacios");
  }

  @Test
  public void numeorEjesNegativo() {
    LOG.info("Iniciado test umeorEjesNegativo");
    assertThrows(Throwable.class, () -> new Camion("a", "b", false, "c", "e", 0.0, false, false, false, -1, "r"));
    LOG.info("Finalizando test umeorEjesNegativo");
  }
}