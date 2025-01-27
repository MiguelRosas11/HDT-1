import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ModelLicuadora
        ModelLicuadora model = new ModelLicuadora();
        
        // Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear la licuadora con capacidad total y velocidad máxima
        model.crearLicuadora(2.0, 5); // 2.0 litros de capacidad, velocidad máxima de 5

        // Menú interactivo
        int opcion;
        do {
            System.out.println("\n--- Menú de la Licuadora ---");
            System.out.println("1. Encender licuadora");
            System.out.println("2. Apagar licuadora");
            System.out.println("3. Llenar licuadora");
            System.out.println("4. Incrementar velocidad");
            System.out.println("5. Decrementar velocidad");
            System.out.println("6. Consultar velocidad");
            System.out.println("7. Verificar si la licuadora está llena");
            System.out.println("8. Vaciar licuadora");
            System.out.println("9. Servir líquido");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();  // Lee la opción seleccionada
            
            // Verificar si la licuadora está encendida antes de ejecutar cualquier acción
            if (!model.estaEncendida()) {
                if (opcion != 1 && opcion != 2) {
                    System.out.println("La licuadora debe estar encendida para realizar esta acción.");
                    continue;  // Salir de este ciclo y mostrar el menú nuevamente
                }
            }

            switch(opcion) {
                case 1:
                    model.encender();
                    System.out.println("La licuadora está encendida: " + model.estaEncendida());
                    break;
                case 2:
                    model.apagar();
                    System.out.println("La licuadora está apagada: " + !model.estaEncendida());
                    break;
                case 3:
                    System.out.print("Ingrese el volumen a llenar (en litros): ");
                    double volumenALlenar = scanner.nextDouble();
                    if (model.verificarLLenado(volumenALlenar)) {
                        model.llenarVolumen(volumenALlenar);
                        System.out.println("Licuadora llena con: " + volumenALlenar + " litros.");
                    } else {
                        System.out.println("No se puede llenar la licuadora con: " + volumenALlenar + " litros.");
                    }
                    break;
                case 4:
                    if (model.verificarVelocidad()) {
                        model.incrementarVelocidad();
                        System.out.println("Velocidad incrementada a: " + model.consultarVelocidad());
                    } else {
                        System.out.println("No se puede incrementar la velocidad más allá del máximo.");
                    }
                    break;
                case 5:
                    if (model.consultarVelocidad() > 0) {
                        model.decrementarVelocidad();
                        System.out.println("Velocidad decrementada a: " + model.consultarVelocidad());
                    } else {
                        System.out.println("La velocidad no puede ser menor que 0.");
                    }
                    break;
                case 6:
                    System.out.println("La velocidad actual de la licuadora es: " + model.consultarVelocidad());
                    break;
                case 7:
                    if (model.estaLlena()) {
                        System.out.println("La licuadora está llena.");
                    } else {
                        System.out.println("La licuadora no está llena.");
                    }
                    break;
                case 8:
                    model.vaciar();
                    System.out.println("Licuadora vaciada. Capacidad actual: " + model.llenarVolumen(0) + " litros.");
                    break;
                case 9:
                    System.out.print("Ingrese el volumen a servir (en litros): ");
                    double volumenAServir = scanner.nextDouble();
                    if (model.verificarServido(volumenAServir)) {
                        model.servir(volumenAServir);
                        System.out.println("Licuadora después de servir: " + model.llenarVolumen(0) + " litros.");
                    } else {
                        System.out.println("No se puede servir el volumen solicitado.");
                    }
                    break;
                case 10:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion != 10);  // Continuar hasta que el usuario elija salir

        scanner.close();  // Cerrar el scanner al final
    }
}
