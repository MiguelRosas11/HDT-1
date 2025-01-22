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
    }
}