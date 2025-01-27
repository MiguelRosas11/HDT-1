import org.junit.*;

public class TestDecrementarVelocidad {
    @Test
    public void testDecrementarVelocidad() {
        ModelLicuadora licuadora = new ModelLicuadora();
        licuadora.crearLicuadora(2.0, 5);
        licuadora.encender();

        licuadora.incrementarVelocidad();
        licuadora.incrementarVelocidad();
        licuadora.decrementarVelocidad();
        Assert.assertEquals(1, licuadora.consultarVelocidad());

        licuadora.decrementarVelocidad();
        Assert.assertEquals(0, licuadora.consultarVelocidad());

        licuadora.decrementarVelocidad();
        Assert.assertEquals(-1, licuadora.consultarVelocidad());
    }
}
