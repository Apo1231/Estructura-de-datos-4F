package seisOct;

public class App {
    public static void main(String[] args) {
        // --- 1. Creación de objetos Worker ---
        Worker w1 = new Worker(101, "Alice", "Developer");
        Worker w2 = new Worker(102, "Bob", "Tester");
        Worker w3 = new Worker(103, "Charlie", "Manager");
        Worker w4 = new Worker(104, "Diana", "Analyst");

        System.out.println("--- PRUEBA DE TDA PILA (LIFO) con Workers ---");
        // Capacidad 3
        StackTDA workerStack = new StackTDA(3); 

        // PUSH (Apilar)
        workerStack.push(w1); // 1. Alice
        workerStack.push(w2); // 2. Bob
        workerStack.push(w3); // 3. Charlie
        workerStack.push(w4); // 4. Diana (Pila llena)

        System.out.println("\nTop/Peek: " + (workerStack.peek() != null ? workerStack.peek().getName() : "Empty"));

        // POP (Desapilar) - El último que entró es el primero en salir (Charlie)
        Worker poppedWorker1 = workerStack.pop(); 
        System.out.println("Sacado (1): " + poppedWorker1);

        // POP
        Worker poppedWorker2 = workerStack.pop();
        System.out.println("Sacado (2): " + poppedWorker2);

        System.out.println("\nTop/Peek después de 2 POPs: " + (workerStack.peek() != null ? workerStack.peek().getName() : "Empty"));

        // ------------------------------------------------------------------
        
        System.out.println("\n==================================================");
        System.out.println("--- PRUEBA DE TDA COLA (FIFO) con Workers ---");
        // Capacidad 3
        QueueTDA workerQueue = new QueueTDA(3);

        // ENQUEUE (Encolar)
        workerQueue.enqueue(w1); // 1. Alice (Frente)
        workerQueue.enqueue(w2); // 2. Bob
        workerQueue.enqueue(w3); // 3. Charlie (Final)
        workerQueue.enqueue(w4); // 4. Diana (Cola llena)

        System.out.println("\nFront/Frente: " + (workerQueue.getFront() != null ? workerQueue.getFront().getName() : "Empty"));

        // DEQUEUE (Desencolar) - El primero que entró es el primero en salir (Alice)
        Worker dequeuedWorker1 = workerQueue.dequeue();
        System.out.println("Sacado (1): " + dequeuedWorker1);

        // DEQUEUE
        Worker dequeuedWorker2 = workerQueue.dequeue();
        System.out.println("Sacado (2): " + dequeuedWorker2);
        
        System.out.println("\nFront/Frente después de 2 DEQUEUEs: " + (workerQueue.getFront() != null ? workerQueue.getFront().getName() : "Empty"));
    }
}