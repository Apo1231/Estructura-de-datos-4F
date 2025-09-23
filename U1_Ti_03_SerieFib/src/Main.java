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


        Queue<Cliente> queue = new ArrayDeque<>();

        Cliente c1=new Cliente(1, "Juanito");
        c1.agregarDoc("Documento1");
        c1.agregarDoc("Documento2");

        Cliente c2=new Cliente(2, "Alfonso");
        c2.agregarDoc("Documento3");
        c2.agregarDoc("Documento4");

        Cliente c3=new Cliente(3, "Alfredo");
        c3.agregarDoc("Documento5");
        c3.agregarDoc("Documento6");

        queue.offer(c1);
        queue.offer(c2);


   }
}
