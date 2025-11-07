public class ArrayQueue<T> {
    private Object[] array;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity) {
        this.array = new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(T item) {
        if (this.size == this.array.length) {
            throw new IllegalStateException("Queue is full");
        } else {
            this.rear = (this.rear + 1) % this.array.length;
            this.array[this.rear] = item;
            ++this.size;
        }
    }

    public T dequeue() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else {
            @SuppressWarnings("unchecked")
            T item = (T)this.array[this.front];
            this.array[this.front] = null;
            this.front = (this.front + 1) % this.array.length;
            --this.size;
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
                @SuppressWarnings("unchecked")
                T item = (T)this.array[(this.front + i) % this.array.length];
                sb.append(item);
                if (i < this.size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}