package Practicas;

public class PotenciaRecursiva {

    public static int potencia(int a, int b) {
        if (b == 0) {
            return 1; // Caso base: cualquier número a la 0 es 1
        } else {
            return a * potencia(a, b - 1); // Recursión: a^b = a * a^(b-1)
        }
    }

}
