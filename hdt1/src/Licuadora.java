public interface Licuadora {
    void encender();
    void apagar();
    void llenarVolumen (int peso);
    void vaciar();
    int incrementarVelocidad();
    int decrementarVelocidad();
    int consultarVelocidad();
    boolean estaLlena();
}
