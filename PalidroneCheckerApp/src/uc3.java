public class uc3 {

    public static void main(String[] args) {

        // Hardcoded string to check
        String original = "racecar";

        // Reverse the string using a loop
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}