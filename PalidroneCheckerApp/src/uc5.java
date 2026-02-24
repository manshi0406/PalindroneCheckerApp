import java.util.Stack;

public class uc5 {

    public static void main(String[] args) {

        // Hardcoded string to check
        String original = "madam";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}