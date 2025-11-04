package ListaEnlazada;

public class MyLinkedList {
    Node head;

    public void add(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public SplitResult splitEvenOdd() {
        MyLinkedList evens = new MyLinkedList();
        MyLinkedList odds = new MyLinkedList();
        Node current = this.head;

        while (current != null) {
            int data = current.data;
            if (data % 2 == 0) {
                evens.add(data);
            } else {
                odds.add(data);
            }
            current = current.next;
        }
        
        return new SplitResult(evens, odds);
    }

    public void printList() {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " → ");
        }
        System.out.println("null");
    }

    public static class SplitResult {
        public MyLinkedList evens;
        public MyLinkedList odds;

        public SplitResult(MyLinkedList evens, MyLinkedList odds) {
            this.evens = evens;
            this.odds = odds;
        }
    }
}
