
public class ModelLicuadora implements ILicuadora {

    Licuadora licuadora;
    public ModelLicuadora(){

    }

    public void crearLicuadora(double capacidadTotal, int velocidadMax){
        licuadora = new Licuadora(capacidadTotal, velocidadMax);
    }

    public boolean verificarLLenado(double llenarVolumen){
        if(llenarVolumen > licuadora.getCapacidadActual() || licuadora.getCapacidadActual() == 0 || llenarVolumen< 0){
            return false;
        } 
         return true;
    }

    @Override
    public void encender(){
        licuadora.setEstado(true);
    }

    @Override
    public void apagar(){
        licuadora.setEstado(false);
    }

    @Override
    public boolean estaEncendida(){
        if (licuadora.getEstado()){
            return true;
        } 

        return false;
    }

    @Override
    public double llenarVolumen(double volumen){
        double llenado = licuadora.getCapacidadActual() - volumen;
        
        licuadora.setCapacidadActual(llenado);

        return licuadora.getCapacidadActual();
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
