
public class ModelLicuadora implements Licuadora {

    LicuadorClass licuadora;
    public ModelLicuadora(){

    }

    public void crearLicuadora(double capacidadTotal, int velocidadMax){
        licuadora = new LicuadorClass(capacidadTotal, velocidadMax);
    }

    public boolean verificarLLenado(double llenarVolumen){
        if(llenarVolumen > licuadora.getCapacidadActual() || llenarVolumen< 0){
            return false;
        } 
         return true;
    }

    public boolean verificarVelocidad(){
        if(licuadora.getVelocidadActual()>=licuadora.getVelocidadMax()){
            return false;
        }

        return true;
    }

    public boolean verificarBajada(){
        if(licuadora.getVelocidadActual() == 0){
            return false;
        }

        return true;
    }

    public boolean verificarServido(double servir){
        if ((licuadora.getCapacidadTotal()-licuadora.getCapacidadActual())<= servir || servir < 0){
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
    public double llenar(double volumen){
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
        licuadora.setVelocidadActual(licuadora.getVelocidadActual()+1);

        return licuadora.getVelocidadActual();
    }

    @Override
    public int decrementarVelocidad(){
        licuadora.setVelocidadActual(licuadora.getVelocidadActual()-1);

        return licuadora.getVelocidadActual();
    }

    @Override
    public int consultarVelocidad(){
        return licuadora.getVelocidadActual();
    }

    @Override
    public boolean estaLlena(){
        if (licuadora.getCapacidadActual() == 0){
            return true;
        }

        return false;
    }

    @Override
    public double servir(double volumenRestado){
        licuadora.setCapacidadActual(licuadora.getCapacidadActual()+ volumenRestado);

        return licuadora.getCapacidadActual();
    }
    
}
