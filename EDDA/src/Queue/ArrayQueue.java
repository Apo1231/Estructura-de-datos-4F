package Queue;

import java.util.Stack;

public class ArrayQueue<T> {

    private T[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(T element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        data[rear] = element;
        size = size + 1;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T element = data[front];
        front = (front + 1) % capacity;
        size = size - 1;
        return element;
    }

    public void reverse() {
        if (this.size() < 2) {
            return;
        }
        Stack<T> tempStack = new Stack<>();
        while (!this.isEmpty()) {
            tempStack.push(this.dequeue());
        }
        while (!tempStack.isEmpty()) {
            this.enqueue(tempStack.pop());
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            sb.append(data[index].toString());
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
