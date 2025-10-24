public class ArrayStack<E> {

    private E[] data;
    private int top;
    private static final int CAPACIDAD_POR_DEFECTO = 10;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        data = (E[]) new Object[CAPACIDAD_POR_DEFECTO];
        top = 0;
    }

    public void push(E elemento) {
        if (top == data.length) {
            System.out.println("Error: La pila está llena (Stack Overflow)");
            return;
        }
        data[top] = elemento;
        top++;
    }
    public E pop() {
        if (top == 0) {
            System.out.println("Error: La pila está vacía (Stack Underflow)");
            return null;
        }
        top--;
        E elemento = data[top];
        data[top] = null;
        return elemento;
    }


    public void clear() {
        while (top > 0) {
            top--;
            data[top] = null;
        }
    }


    public void print() {
        System.out.print("[");
        for (int i = top - 1; i >= 0; i--) {
            System.out.print(data[i]);
            if (i > 0) {
                System.out.print("->");
            }
        }
        System.out.println("]");
    }
}
