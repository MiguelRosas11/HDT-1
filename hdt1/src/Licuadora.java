public class Licuadora {
    private double capacidadTotal, capacidadActual;
    private boolean estado;
    private int velocidadMax, velocidadActual;

    public Licuadora (double capacidadTotal, int velocidadMax){
        this.capacidadTotal = capacidadTotal;
        this.capacidadActual= capacidadTotal;
        this.estado= false;
        this.velocidadMax = velocidadMax;
        this.velocidadActual= 0;
    }

    public double getCapacidadTotal(){
        return capacidadTotal;
    }

    public void setCapacidadTotal(double capacidadTotal){
        this.capacidadTotal = capacidadTotal;
    }

    public double getCapacidadActual(){
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual){
        this.capacidadActual= capacidadActual;
    }

    public boolean getEstado(){
        return estado;
    }

    public void setEstado(boolean estado){
        this.estado= estado;
    }

    public int getVelocidadMax(){
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax){
        this.velocidadMax= velocidadMax;
    }

    public int getVelocidadActual(){
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual){
        this.velocidadActual= velocidadActual;
    }
}
