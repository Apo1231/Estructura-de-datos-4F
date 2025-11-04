package Queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Customer> queue = new ArrayQueue<>(10);

        Customer[] customersToAdd = {
            new Customer(1, "Ana"),
            new Customer(2, "Luis"),
            new Customer(3, "Maya"),
            new Customer(4, "Carlos"),
            new Customer(5, "Elena")
        };

        for (Customer customer : customersToAdd) {
            queue.enqueue(customer);
        }

        System.out.println("Antes de invertir:");
        System.out.println(queue);
        int beforeSize = queue.size();

        queue.reverse();

        System.out.println("\nDespues de invertir:");
        System.out.println(queue);
        int afterSize = queue.size();

        System.out.println("\nElementos antes = " + beforeSize + ", elementos despues = " + afterSize);
    }
}
