package Practicas;

public class FibonacciRecursivo {

    public static void fibonacci(int n, int a, int b) {
        if (n == 0) {
            return; // Caso base: no imprimir más
        }

        System.out.print(a);
        if (n > 1) {
            System.out.print(" "); // espacio después del número, si no es el último
        } else {
            System.out.println(); // salto de línea en el último número
        }

        // Llamada recursiva, pasando el siguiente par de términos
        fibonacci(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        int n = 5;
        fibonacci(n, 0, 1);
    }
}
