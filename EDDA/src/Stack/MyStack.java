package Stack;

public class MyStack<T> {
    private T[] data;
    private int top;

    @SuppressWarnings("unchecked")
    public MyStack(int capacity) {
        this.data = (T[]) new Object[capacity];
        this.top = -1;
    }

    public void push(T value) {
        if (top < data.length - 1) {
            top++;
            data[top] = value;
        }
    }

    public T pop() {
        if (this.isEmpty()) {
            return null;
        }
        T value = data[top];
        top--;
        return value;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
}
