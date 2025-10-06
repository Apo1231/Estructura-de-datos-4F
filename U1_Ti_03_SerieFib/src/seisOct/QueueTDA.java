package seisOct;

public class QueueTDA {
    private Worker[] queueArray;
    private int front; // Frente de la cola
    private int rear;  // Final de la cola
    private int size;  // Elementos actuales en la cola
    private int capacity;

    public QueueTDA(int capacity) {
        this.capacity = capacity;
        // Se crea un array de objetos Worker
        this.queueArray = new Worker[capacity]; 
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Operación ENQUEUE (Encolar)
    public void enqueue(Worker worker) {
        if (size == capacity) {
            System.out.println("❌ Error: Cola llena. No se puede agregar: " + worker.getName());
            return;
        }
        rear = (rear + 1) % capacity; // Simulación de array circular
        queueArray[rear] = worker;
        size++;
        System.out.println("📥 Enqueued: " + worker.getName());
    }

    // Operación DEQUEUE (Desencolar)
    public Worker dequeue() {
        if (size == 0) {
            System.out.println("❌ Error: Cola vacía. No se puede sacar.");
            return null;
        }
        Worker worker = queueArray[front];
        queueArray[front] = null; // Opcional
        front = (front + 1) % capacity; // Simulación de array circular
        size--;
        System.out.println("📤 Dequeued: " + worker.getName());
        return worker;
    }

    // Operación FRONT (Ver el frente)
    public Worker getFront() {
        if (size == 0) {
            return null;
        }
        return queueArray[front];
    }

    // Verificación de estado
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}