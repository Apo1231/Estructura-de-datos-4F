public class App {
    public static void main(String[] args) throws Exception {

        SinglyLinkedList miLista = new SinglyLinkedList();

        System.out.println("Lista inicial:");
        miLista.printList();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(5);

        System.out.println("================================");
        System.out.println("Lista después de agregar elementos:");
        miLista.printList();

        miLista.remove(3);
        System.out.println("================================");
        System.out.println("Lista después de eliminar el valor 3:");
        miLista.printList();

        int totalOcurrencias = miLista.countOccurrences(2);
        System.out.println("Número de veces que aparece el 2: " + totalOcurrencias);
    }
}
