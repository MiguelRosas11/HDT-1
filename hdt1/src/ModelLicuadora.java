
public class ModelLicuadora implements ILicuadora {

    Licuadora licuadora;
    public ModelLicuadora(){

    }

    public void crearLicuadora(double capacidadTotal, int velocidadMax){
        licuadora = new Licuadora(capacidadTotal, velocidadMax);
    }

    public boolean verificarLLenado(double llenarVolumen){
        if(llenarVolumen > licuadora.getCapacidadActual() || llenarVolumen< 0){
            return false;
        } 
         return true;
    }

    public boolean verificarVelocidad(int velocidad){
        if(velocidad>=licuadora.getVelocidadMax()|| velocidad < 0){
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
        licuadora.setCapacidadActual(licuadora.getCapacidadTotal());
        return licuadora.getCapacidadActual();
    }

    @Override
    public int incrementarVelocidad(){
        licuadora.setCapacidadActual(licuadora.getVelocidadActual()+1);

        return licuadora.getVelocidadActual();
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
