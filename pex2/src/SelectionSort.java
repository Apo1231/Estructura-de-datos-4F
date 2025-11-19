import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            
            int temp = arr[indiceMenor];
            arr[indiceMenor] = arr[i];
            arr[i] = temp;
        }
    }

    public static void imprimirArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Cuantos numeros quieres ingresar? ");
        int cantidad = lector.nextInt();
        int[] numeros = new int[cantidad];
        
        System.out.println("Ingresa los numeros: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = lector.nextInt();
        }
        
        System.out.println("\nArreglo original: ");
        imprimirArr(numeros);
        
        int contadorPares = 0;
        int contadorImpares = 0;
        
        for (int i = 0; i < cantidad; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        
        int[] pares = new int[contadorPares];
        int[] impares = new int[contadorImpares];
        
        int indicePar = 0;
        int indiceImpar = 0;
        
        for (int i = 0; i < cantidad; i++) {
            if (numeros[i] % 2 == 0) {
                pares[indicePar] = numeros[i];
                indicePar++;
            } else {
                impares[indiceImpar] = numeros[i];
                indiceImpar++;
            }
        }
        
        selectionSort(pares);
        selectionSort(impares);
        
        System.out.println("\nNumeros pares ordenados: ");
        if (contadorPares > 0) {
            imprimirArr(pares);
        } else {
            System.out.println("No hay numeros pares");
        }
        
        System.out.println("\nNumeros impares ordenados: ");
        if (contadorImpares > 0) {
            imprimirArr(impares);
        } else {
            System.out.println("No hay numeros impares");
        }
        
        lector.close();
    }
}
