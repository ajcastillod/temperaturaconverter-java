import java.util.Scanner;

public class TemperaturaConverter {

    public static void main(String[] args) {
        // Crear un objeto para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int option = 0; // Variable para guardar la opción del menú

        // Ciclo para mostrar el menú hasta que el usuario elija salir
        while (true) {
            try {
                // Mostrar el menú
                System.out.println("Menú de Conversión de Temperaturas");
                System.out.println("1. Convertir de Celsius a Fahrenheit");
                System.out.println("2. Convertir de Fahrenheit a Celsius");
                System.out.println("3. Salir");
                System.out.print("Selecciona una opción: ");

                // Leer la opción del usuario
                option = Integer.parseInt(scanner.nextLine());

                // Comprobar la opción elegida por usuario
                if (option == 1) {
                    System.out.print("Ingresa la temperatura en Celsius: ");
                    double celsius = Double.parseDouble(scanner.nextLine()); // Leer la temperatura
                    double fahrenheit = celsiusToFahrenheit(celsius); // Llamar al método
                    System.out.println("Equivalente en Fahrenheit: " + fahrenheit);

                } else if (option == 2) {
                    System.out.print("Ingresa la temperatura en Fahrenheit: ");
                    double fahrenheit = Double.parseDouble(scanner.nextLine()); // Leer la temperatura
                    double celsius = fahrenheitToCelsius(fahrenheit); // Llamar al método 
                    System.out.println("Equivalente en Celsius: " + celsius);

                } else if (option == 3) {
                    // Salir del programa
                    System.out.println("Saliendo del programa, Adios");
                    break; // Salir del ciclo

                } else {
                    // Ingreso de opciones no válidas
                    System.out.println("Opción no válida. Por favor, elige entre 1, 2 o 3.");
                }
            } catch (NumberFormatException e) {
                // Manejar errores de entrada de datos
                System.out.println("Error: Por favor ingresa un número válido.");
            }
        }

        scanner.close(); // Cerrar el scanner al final de todo para evitar errores
    }

    // Método para convertir de Celsius a Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; 
    }

    // Método para convertir de Fahrenheit a Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; 
    }
}
