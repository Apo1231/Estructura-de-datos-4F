import java.util.Scanner;
import java.util.Arrays;

public class GestionCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántas calificaciones deseas registrar?");
        int n;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("ingresa un número válido.");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("El número de calificaciones debe ser mayor que cero.");
            }
        } while (n <= 0);
        
        String[] nombres = new String[n];
        double[] calificaciones = new double[n];

        System.out.println("\n--- Captura de Datos ---");
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Alumno #" + (i + 1));
            
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();

            double calif;
            do {
                System.out.print("Calificación: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Por favor, ingresa una calificación válida (ej. 8.5).");
                    System.out.print("Calificación: ");
                    scanner.next();
                }
                calif = scanner.nextDouble();
                scanner.nextLine();
                
                if (calif < 0 || calif > 100) {
                    System.out.println("La calificación debe estar entre 0 y 100.");
                }
            } while (calif < 0 || calif > 100);

            calificaciones[i] = calif;
        }
        selectionSort(calificaciones, nombres);
        System.out.println("\n--- Resultados Ordenados por Calificación (Ascendente) ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f - %s\n", calificaciones[i], nombres[i]);
        }

        scanner.close();
    }
    public static void selectionSort(double[] arrCalificaciones, String[] arrNombres) {
        int n = arrCalificaciones.length;

        // Recorrer el arreglo de calificaciones
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento más pequeño en el resto de la lista (arr[i..n-1])
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arrCalificaciones[j] < arrCalificaciones[minIndex]) {
                    minIndex = j;
                }
            }

            // Realizar el intercambio siempre que se encuentre un nuevo mínimo
            if (minIndex != i) {
                double tempCalif = arrCalificaciones[minIndex];
                arrCalificaciones[minIndex] = arrCalificaciones[i];
                arrCalificaciones[i] = tempCalif;

                String tempNombre = arrNombres[minIndex];
                arrNombres[minIndex] = arrNombres[i];
                arrNombres[i] = tempNombre;
            }
        }
    }
}