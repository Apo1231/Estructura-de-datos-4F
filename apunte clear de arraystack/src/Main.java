public class Main {
    public static void main(String[] args) {
        ArrayStack<Character> stack1 = new ArrayStack<>();

        // 1. Verificación inicial
        System.out.println("Pila inicial:");
        stack1.print();

        // 2. Operaciones push y pop
        System.out.println("\nAgregando 'A', 'B , 'C' y quitando el último:");
        stack1.push('A');
        stack1.push('B');
        stack1.push('C');
        stack1.pop(); // Quita 'C'
        stack1.print();

        // 3. Prueba del método clear
        System.out.println("\nLimpiando la pila");
        stack1.clear();
        System.out.println("Pila después de clear():      ");
        stack1.print();
    }
}
