import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        sumaNnumeros suma = new sumaNnumeros();
        suma.sumaRecursiva(5);

        String texto = "hola";
        InvertirCadena.invertirRecursiva(texto);

        int a = 2;
        int b = 5;
        int resultado = PotenciaRecursiva.potencia(a, b);
        System.out.println(a + " elevado a " + b + " es " + resultado);




   }
}
