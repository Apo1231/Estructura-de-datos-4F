public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = newNode;
    }
    public void removeDuplicates() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public void printList() {
        Node cur = head;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.data);
            sb.append(" ->");
            cur = cur.next;
        }
        sb.append("null");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        int[] valores = {5, 3, 5, 7, 3, 9};
        for (int v : valores) list.add(v);

        System.out.println("Entrada:");
        list.printList();

        list.removeDuplicates();

        System.out.println("Salida:");
        list.printList();
    }
}
