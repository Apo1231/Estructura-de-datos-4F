import java.util.Scanner;

public class Bubblesort {

    public static void bubblesort(int[] arr){
        int longitud = arr.length;

        for (int pasada = 0; pasada < longitud -1 ; pasada++) {

            for (int posicion = 0; posicion < longitud - pasada -1; posicion++) {
                if (arr[posicion] > arr[posicion +1]){
                    int temp = arr[posicion];
                    arr[posicion] = arr[posicion +1];
                    arr[posicion +1] = temp;
                }
            }
        }
    }

    public static void imprimirArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("De que longitud quieres tu arrelgo? ");
        int longitud = lector.nextInt();
        int[] arr = new int[longitud];
        System.out.println("Ingresa los numeros a continuacion: ");

        for (int i = 0; i < longitud; i++) {
            System.out.println("posicion: " + (i+1) + ": ");
            arr[i] = lector.nextInt();
        }
        System.out.println("Arraty original: ");
        imprimirArr(arr);
        bubblesort(arr);

        System.out.println("Ordenado con bubblesort: " );
        imprimirArr(arr);

        int minimo = arr[0];
        int maximo = arr[longitud-1];
        int diferencia = maximo - minimo;

        System.out.println("\nResultados:");
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Diferencia: " + diferencia);
    }


}
