public class Main {

    public static void main(String[] args) {
        ArrayStack<Character> stack1 = new ArrayStack<>();

        System.out.println("1. Pila recién creada:");
        stack1.print();

        System.out.println("\n2. Agregando A, B, C y quitando uno:");
        stack1.push('A');
        stack1.push('B');
        stack1.push('C');

        System.out.println("Elemento extraído: " + stack1.pop()); // Extrae 'C'

        System.out.println("Pila después de pop:");
        stack1.print(); // Salida esperada: [B->A]

        System.out.println("\n3. Después de llamar a clear():");
        stack1.clear();
        stack1.print();
    }
}
