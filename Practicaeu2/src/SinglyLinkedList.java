public class SinglyLinkedList<T> {
    private Node head;

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(T item) {
        Node newNode = new Node(item);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node temp;
            for(temp = this.head; temp.next != null; temp = temp.next) {
            }
            temp.next = newNode;
        }
    }

    public T removeLast() {
        if (this.head == null) {
            throw new IllegalStateException("List is empty");
        } else if (this.head.next == null) {
            T data = this.head.data;
            this.head = null;
            return data;
        } else {
            Node temp;
            // Busca el penúltimo nodo
            for(temp = this.head; temp.next.next != null; temp = temp.next) {
            }

            T data = temp.next.data;
            temp.next = null; // Elimina la referencia al último nodo
            return data;
        }
    }

    public int size() {
        int count = 0;
        for(Node temp = this.head; temp != null; temp = temp.next) {
            ++count;
        }
        return count;
    }

    @Override
    public String toString() {
        if (this.head == null) {
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder("[");
            for(Node temp = this.head; temp != null; temp = temp.next) {
                sb.append(temp.data);
                if (temp.next != null) {
                    sb.append(" -> ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}