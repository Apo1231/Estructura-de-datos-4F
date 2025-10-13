package treceoct;

public class ArregloSalida {
    public static void main(String[] args) {

        // Arreglo de entrada dado en el ejercicio
        int[][] entrada = {
            {1},
            {6, 3, 1},
            {1, 2, 3, 4},
            {0, 5, 3, 0},
            {2, 5, 9},
            {2, 4, 8, 9, 10}
        };

        int[][] salida = new int[entrada.length][];

        for (int i = 0; i < entrada.length; i++) {
            int[] fila = entrada[i];
            int n = fila.length;
            int[] nueva = new int[n + 1];

            // Copiar los elementos originales
            for (int j = 0; j < n; j++) {
                nueva[j] = fila[j];
            }


            if (n % 2 == 0) {
                nueva[n] = fila[0] + fila[n - 1];
            } else {
                nueva[n] = 0;
            }

            salida[i] = nueva;
        }

        System.out.println("Salida:");
        for (int[] fila : salida) {
            System.out.print("{ ");
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println("}");
        }
    }
}
