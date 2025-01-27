public class Main {
    public static void main(String[] args) {
        ModelLicuadora model = new ModelLicuadora();

        //Creacion de la Licuadora.
        model.crearLicuadora(2.0, 5);

        //Encender la licuadora.
        model.encender();
        System.out.println("La licuadora esta encendida: " + model.estaEncendida());

        //llena la licaudora.
        double llenarVolumen = 1.0;
        if(model.verificarLLenado(llenarVolumen)){
            model.llenarVolumen(llenarVolumen);
            System.out.println("Licuadora llena: " + llenarVolumen + "litros.");
        } else {
            System.out.println("La licuadora no se puede llenar con: " + llenarVolumen + "litros");
        }

        //incrementar la valocidad.
        if(model.verificarVelocidad()){
            model.incrementarVelocidad();
            System.out.println("La velocidad se incremento a: " + model.consultarVelocidad());
        } else {
            System.out.println("No se puede sobrepasar el limite de velocidad.");
        }

        //decrementar la velocidad.
        if(model.verificarBajada()){
            model.decrementarVelocidad();
            System.out.println("La velocidad decremento a: " + model.consultarVelocidad());
        } else{
            System.out.println("Si la velocidad llega a 0, la licuadora se apagara.");
        }
    }
}