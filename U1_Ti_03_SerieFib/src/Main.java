public class Main {
    public static void main(String[] args) {
        int n = 5;                 // valor fijo, sin scan
        int a = 0, b = 1;          // primeros dos términos

        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n - 1 ? " " : "\n"));
            int c = a + b;         // siguiente término
            a = b;
            b = c;
        }
    }
}
