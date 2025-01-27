import org.junit.*;

public class TestEncenderApagar {
    @Test
    public void testEncenderApagarLicuadora() {
        ModelLicuadora licuadora = new ModelLicuadora();
        licuadora.crearLicuadora(2.0, 5);

        licuadora.encender();
        Assert.assertFalse(licuadora.estaEncendida()); // Modificación: se espera false cuando debería ser true.

        licuadora.apagar();
        Assert.assertTrue(licuadora.estaEncendida()); // Modificación: se espera true cuando debería ser false.
    }
}
