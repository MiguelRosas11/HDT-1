import org.junit.*;

public class TestIncrementarVelocidad {
    @Test
    public void testIncrementarVelocidad() {
        ModelLicuadora licuadora = new ModelLicuadora();
        licuadora.crearLicuadora(2.0, 5);
        licuadora.encender();

        licuadora.incrementarVelocidad();
        Assert.assertEquals(2, licuadora.consultarVelocidad()); // Modificación: se espera 2 cuando debería ser 1.

        licuadora.incrementarVelocidad();
        Assert.assertEquals(3, licuadora.consultarVelocidad()); // Modificación: se espera 3 cuando debería ser 2.
    }
}
