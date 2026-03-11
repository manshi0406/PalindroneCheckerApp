import java.util.*;

public class PalidroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove spaces
        input = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}