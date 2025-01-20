public interface Licuadora {
    void encender();
    void apagar();
    void llenar (int peso);
    void vaciar();
    void subirVelocidad();
    void bajarVelocidad();
    int consultarVelocidad();
    boolean llena();
}
