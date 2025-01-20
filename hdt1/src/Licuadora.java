public interface Licuadora {
    void encender();
    void apagar();
    boolean estaEncendida();
    double llenarVolumen (double volumen);
    String vaciar();
    int incrementarVelocidad();
    int decrementarVelocidad();
    int consultarVelocidad();
    boolean estaLlena();
    double servir(double volumenRestado);
}
