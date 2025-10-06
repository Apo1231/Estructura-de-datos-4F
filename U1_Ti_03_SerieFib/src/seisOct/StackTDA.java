package seisOct;

public class StackTDA {
    private Worker[] stackArray;
    private int top; // Índice del último elemento agregado (cima)
    private int capacity;

    public StackTDA(int capacity) {
        this.capacity = capacity;
        // Se crea un array de objetos Worker
        this.stackArray = new Worker[capacity]; 
        this.top = -1; // -1 indica que la pila está vacía
    }

    // Operación PUSH (Apilar)
    public void push(Worker worker) {
        if (top == capacity - 1) {
            System.out.println("❌ Error: Pila llena. No se puede agregar: " + worker.getName());
            return;
        }
        top++;
        stackArray[top] = worker;
        System.out.println("✅ Pushed: " + worker.getName());
    }

    // Operación POP (Desapilar)
    public Worker pop() {
        if (top == -1) {
            System.out.println("❌ Error: Pila vacía. No se puede sacar.");
            return null;
        }
        Worker worker = stackArray[top];
        stackArray[top] = null; // Opcional: Ayuda al Garbage Collector
        top--;
        System.out.println("🗑️ Popped: " + worker.getName());
        return worker;
    }

    // Operación PEEK (Ver el tope)
    public Worker peek() {
        if (top == -1) {
            return null;
        }
        return stackArray[top];
    }

    // Verificación de estado
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}