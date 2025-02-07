
public class ModelLicuadora implements Licuadora { //Implementa la interfaz licuadora

    LicuadorClass licuadora;
    public ModelLicuadora(){

    }

    public void crearLicuadora(double capacidadTotal, int velocidadMax){ //Constructor de la licuadora
        licuadora = new LicuadorClass(capacidadTotal, velocidadMax);
    }

    public boolean verificarLLenado(double llenarVolumen){ //Este método verifica que el volumen que se quiere meter a la licuadora no exceda la capacidad maxima
        if(llenarVolumen > licuadora.getCapacidadActual() || llenarVolumen< 0){
            return false;
        } 
         return true;
    }

    public boolean verificarVelocidad(){
        if(licuadora.getVelocidadActual()>=licuadora.getVelocidadMax()){ //Este metodo verifica que la velocidad que se quiere en la licuadora no exceda la velocidad maxima de la misma
            return false;
        }

        return true;
    }

    public boolean verificarBajada(){ //Este metodo verifica que se pueda seguir bajando la velocidad
        if(licuadora.getVelocidadActual() == 0){
            return false;
        }

        return true;
    }

    public boolean verificarServido(double servir){ //Este metodo calcula cuando volumen se esta sirviendo
        if ((licuadora.getCapacidadTotal()-licuadora.getCapacidadActual())<= servir || servir < 0){
            return false;
        }

        return true;
    }

    @Override
    public void encender(){ //Este metodo enciende la licuadora esta encendida o apagada
        licuadora.setEstado(true);
    }

    @Override
    public void apagar(){ //Este metodo apaga la licuadora
        licuadora.setEstado(false);
    }

    @Override
    public boolean estaEncendida(){ //Este metodo muestra si la licuadora esta encendida o apagada
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
