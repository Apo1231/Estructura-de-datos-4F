public class ArrayStack<T> {
    private Object[] array;
    private int size;

    public ArrayStack(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void push(T item) {
        if (this.size == this.array.length) {
            throw new IllegalStateException("Stack is full");
        } else {
            this.array[this.size++] = item;
        }
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } else {
            @SuppressWarnings("unchecked")
            T item = (T)this.array[--this.size];
            this.array[this.size] = null;
            return item;
        }
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder("[");
            for(int i = 0; i < this.size; ++i) {
                sb.append(this.array[i]);
                if (i < this.size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}