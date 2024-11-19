package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class EmpleadoTest {

  private static final Logger LOG = Logger.getLogger(EmpleadoTest.class.getName());

  @Test
  public void emailContains() {
    LOG.info("Iniciado test datosVacios");
    assertThrows(Throwable.class,
        () -> new Empleado("Juan", "Perez", "12345678", "juan.perezucarrouq.com", "123456", "juan123",
            "123"));
    LOG.info("Finalizando test datosVacios");
  }

}