package Stack;

public class Main {
    public static void main(String[] args) {
        String[] tests = {"Anita lava la tina", "ola de mar", "Te amo montones", "Luz azul"};

        for (String test : tests) {
            boolean result = PalindromeChecker.isPalindrome(test);
            System.out.println(result);
        }
    }
}
