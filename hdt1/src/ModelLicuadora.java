
public class ModelLicuadora implements ILicuadora {

    Licuadora licuadora;
    public ModelLicuadora(){

    }

    public void crearLicuadora(double capacidadTotal, int velocidadMax){
        licuadora = new Licuadora(capacidadTotal, velocidadMax);
    }

    @Override
    public void encender(){

    }

    @Override
    public void apagar(){

    }

    @Override
    public boolean estaEncendida(){

    }

    @Override
    public double llenarVolumen(){

    }

    @Override
    public double vaciar(){

    }

    @Override
    public int incrementarVelocidad(){

    }

    @Override
    public int decrementarVelocidad(){

    }

    @Override
    public int consultarVelocidad(){

    }

    @Override
    public boolean estaLlena(){

    }

    @Override
    public double servir(double volumenRestado){

    }
}
