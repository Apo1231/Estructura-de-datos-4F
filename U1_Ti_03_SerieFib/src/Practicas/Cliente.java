package Practicas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Cliente {
    int id;
    String name;
    Deque<String> docs;

    Cliente(int id, String name) {
        this.id = id;
        this.name = name;
        docs = new ArrayDeque<>();
    }

    public void agregarDoc(String doc) {
        docs.push(doc);  // solo agregar el documento, no quitar
    }

    public void atender() {
        System.out.println("Practicas.Cliente en atención: " + name);
        System.out.print("Documentos retirados: ");
        while (!docs.isEmpty()) {
            System.out.print(docs.pop());
            if (!docs.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Cliente> queue = new ArrayDeque<>();

        Cliente c1 = new Cliente(1, "Juanito");
        c1.agregarDoc("Documento1");
        c1.agregarDoc("Documento2");

        Cliente c2 = new Cliente(2, "Alfonso");
        c2.agregarDoc("Documento3");
        c2.agregarDoc("Documento4");

        Cliente c3 = new Cliente(3, "Alfredo");
        c3.agregarDoc("Documento5");
        c3.agregarDoc("Documento6");

        queue.offer(c1);
        queue.offer(c2);
        queue.offer(c3);

        while (!queue.isEmpty()) {
            Cliente clienteActual = queue.poll();
            clienteActual.atender();
            System.out.println("Cola restante: " + queue.stream().map(c -> c.name).toList());
            System.out.println();
        }
    }
}
