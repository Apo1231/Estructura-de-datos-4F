package Stack;

public class PalindromeChecker {

    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = cleanedText.length();
        
        MyStack<Character> stack = new MyStack<>(len);

        for (int i = 0; i < len; i++) {
            stack.push(cleanedText.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder(len);
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return cleanedText.equals(reversedString.toString());
    }
}
