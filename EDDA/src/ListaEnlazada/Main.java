package ListaEnlazada;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        System.out.print("Original: ");
        list.printList();

        MyLinkedList.SplitResult result = list.splitEvenOdd();

        System.out.print("Pares: ");
        result.evens.printList();

        System.out.print("Impares: ");
        result.odds.printList();
    }
}
