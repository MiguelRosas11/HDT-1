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
            // Mostrar las opciones disponibles en el menú
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
            
            // Validación de la opción ingresada
            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingrese un número válido.");
                scanner.next();  // Limpiar el buffer
                System.out.print("Seleccione una opción: ");
            }
            opcion = scanner.nextInt();  // Lee la opción seleccionada
            
            // Verificar si la licuadora está encendida antes de ejecutar cualquier acción
            if (!model.estaEncendida()) {
                if (opcion != 1 && opcion != 2) {
                    System.out.println("La licuadora debe estar encendida para realizar esta acción.");
                    continue;  // Salir de este ciclo y mostrar el menú nuevamente
                }
            }

            // Evaluar la opción seleccionada en el menú
            switch(opcion) {
                case 1:
                    // Encender la licuadora
                    model.encender();
                    System.out.println("La licuadora está encendida: " + model.estaEncendida());
                    break;
                case 2:
                    // Apagar la licuadora
                    model.apagar();
                    System.out.println("La licuadora está apagada: " + !model.estaEncendida());
                    break;
                case 3:
                    // Llenar la licuadora con el volumen ingresado
                    System.out.print("Ingrese el volumen a llenar (en litros): ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Por favor ingrese un valor numérico válido para el volumen.");
                        scanner.next();  // Limpiar el buffer
                        System.out.print("Ingrese el volumen a llenar (en litros): ");
                    }
                    double volumenALlenar = scanner.nextDouble();
                    if (model.verificarLLenado(volumenALlenar)) {
                        // Llenar el volumen si es válido
                        model.llenar(volumenALlenar);
                        System.out.println("Licuadora llena con: " + volumenALlenar + " litros.");
                    } else {
                        System.out.println("No se puede llenar la licuadora con: " + volumenALlenar + " litros.");
                    }
                    break;
                case 4:
                    // Incrementar la velocidad si es posible
                    if (model.verificarVelocidad()) {
                        model.incrementarVelocidad();
                        System.out.println("Velocidad incrementada a: " + model.consultarVelocidad());
                    } else {
                        System.out.println("No se puede incrementar la velocidad más allá del máximo.");
                    }
                    break;
                case 5:
                    // Decrementar la velocidad si es posible (solo si la velocidad es mayor a 0)
                    if (model.consultarVelocidad() > 0) {
                        model.decrementarVelocidad();
                        System.out.println("Velocidad decrementada a: " + model.consultarVelocidad());
                    } else {
                        System.out.println("La velocidad no puede ser menor que 0.");
                    }
                    break;
                case 6:
                    // Consultar la velocidad actual de la licuadora
                    System.out.println("La velocidad actual de la licuadora es: " + model.consultarVelocidad());
                    break;
                case 7:
                    // Verificar si la licuadora está llena
                    if (model.estaLlena()) {
                        System.out.println("La licuadora está llena.");
                    } else {
                        System.out.println("La licuadora no está llena.");
                    }
                    break;
                case 8:
                    // Vaciar la licuadora
                    model.vaciar();
                    // Mostrar la capacidad actual después de vaciarla
                    System.out.println("Licuadora vaciada. Capacidad actual: " + model.llenar(0) + " litros.");
                    break;
                case 9:
                    // Servir líquido de la licuadora
                    System.out.print("Ingrese el volumen a servir (en litros): ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Por favor ingrese un valor numérico válido para el volumen.");
                        scanner.next();  // Limpiar el buffer
                        System.out.print("Ingrese el volumen a servir (en litros): ");
                    }
                    double volumenAServir = scanner.nextDouble();
                    if (model.verificarServido(volumenAServir)) {
                        // Servir el volumen si es posible
                        model.servir(volumenAServir);
                        System.out.println("Licuadora después de servir: " + model.llenarVolumen(0) + " litros.");
                    } else {
                        System.out.println("No se puede servir el volumen solicitado.");
                    }
                    break;
                case 10:
                    // Finalizar el programa
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    // Manejo de opción no válida
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion != 10);  // Continuar hasta que el usuario elija salir


        scanner.close();  // Cerrar el scanner al final
    }
}
