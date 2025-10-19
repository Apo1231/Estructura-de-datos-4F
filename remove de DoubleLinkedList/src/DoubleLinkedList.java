public class DoubleLinkedList {

    private static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public void remove(int value) {
        // 1. Verificar si la lista está vacía
        if (head == null) {
            System.out.println("La ista está vacía,no se puede eliminar.");
            return;
        }

        Node current = head;
        while (current != null && current.value != value) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Valor " + value + " no encontrado en la lista.");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
        else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("-> Valor " + value + " ha sido eliminado.");
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("--- Lista Original ---");
        list.printList();
        System.out.println();


        System.out.println("--- Eliminando un elemento del medio (30) ---");
        list.remove(30);
        list.printList();
        System.out.println();

        System.out.println("--- Eliminando el primer elemento (head: 10) ---");
        list.remove(10);
        list.printList();
        System.out.println();

        System.out.println("--- Eliminando el último elemento (tail: 50) ---");
        list.remove(50);
        list.printList();
        System.out.println();
        
        System.out.println("--- Intentando eliminar un elemento que no existe (99) ---");
        list.remove(99);
        list.printList();
        System.out.println();
        
        System.out.println("--- Vaciando la lista ---");
        list.remove(20);
        list.remove(40);
        list.printList();
        System.out.println();

        System.out.println("--- Intentando eliminar de una lista vacía ---");
        list.remove(10);
        list.printList();
    }
}
