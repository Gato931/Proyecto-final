package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ClienteTest {

  private static final Logger LOG = Logger.getLogger(ClienteTest.class.getName());

  @Test
  public void emailContains() {
    LOG.info("Iniciado test datosVacios");
    assertThrows(Throwable.class,
        () -> new Cliente("pablo", "ramirez", "098543", "pablorpopo.co", "3124025876", "barrio angeles"));
    LOG.info("Finalizando test datosVacios");
  }

}