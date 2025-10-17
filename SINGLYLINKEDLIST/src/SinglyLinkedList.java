public class SinglyLinkedList {

    private Node inicio; // cabeza de la lista

    public void add(int valor) {
        Node nuevo = new Node(valor);

        if (inicio == null) {
            inicio = nuevo;
            return;
        }

        Node actual = inicio;
        while (actual.next != null) {
            actual = actual.next;
        }
        // Insertamos el nuevo nodo al final
        actual.next = nuevo;
    }

    public boolean contains(int valor) {
        Node actual = inicio;
        while (actual != null) {
            if (actual.data == valor) {
                return true;
            }
            actual = actual.next;
        }
        return false;
    }

    public void remove(int valor) {
        if (inicio == null) { // lista vacía
            return;
        }

        if (inicio.data == valor) {
            inicio = inicio.next;
            return;
        }

        Node actual = inicio;
        while (actual.next != null && actual.next.data != valor) {
            actual = actual.next;
        }

        if (actual.next != null) {
            actual.next = actual.next.next;
        }
    }

    public void printList() {
        Node actual = inicio;
        System.out.print("Lista: ");
        while (actual != null) {
            System.out.print(actual.data + " → ");
            actual = actual.next;
        }
        System.out.println("null");
    }

    public int countOccurrences(int valor) {
        int contador = 0;
        Node actual = inicio;

        while (actual != null) {
            if (actual.data == valor) {
                contador++;
            }
            actual = actual.next;
        }
        return contador;
    }
}
