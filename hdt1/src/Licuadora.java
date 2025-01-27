public interface Licuadora {
    void encender();
    void apagar();
    boolean estaEncendida();
    double llenar (double volumen);
    double vaciar();
    int incrementarVelocidad();
    int decrementarVelocidad();
    int consultarVelocidad();
    boolean estaLlena();
    double servir(double volumenRestado);
}
