import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(double[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            double actual = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > actual) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
        }
    }

    public static void imprimirArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Cuantas temperaturas quieres ingresar? ");
        int cantidad = lector.nextInt();
        double[] temperaturas = new double[cantidad];

        System.out.println("Ingresa las temperaturas: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = lector.nextDouble();
        }

        System.out.println("\nArreglo original: ");
        imprimirArr(temperaturas);

        insertionSort(temperaturas);

        System.out.println("\nArreglo ordenado: ");
        imprimirArr(temperaturas);

        double minima = temperaturas[0];
        double maxima = temperaturas[cantidad - 1];
        double rango = maxima - minima;

        System.out.println("\nResultados:");
        System.out.println("Temperatura mínima: " + minima);
        System.out.println("Temperatura máxima: " + maxima);
        System.out.println("Rango: " + rango);

        System.out.println("\nTop 3 temperaturas más bajas:");
        for (int i = 0; i < 3 && i < cantidad; i++) {
            System.out.println((i + 1) + ". " + temperaturas[i]);
        }

        System.out.println("\nTop 3 temperaturas más altas:");
        for (int i = 0; i < 3 && i < cantidad; i++) {
            System.out.println((i + 1) + ". " + temperaturas[cantidad - 1 - i]);
        }

        lector.close();
    }
}
