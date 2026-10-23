import java.util.Scanner;

public class Question3Recursion {

    // This method checks if a string is a palindrome.
    public static boolean isPalindrome(String str) {

        // One or zero characters is a palindrome.
        if (str.length() <= 1) {
            return true;
        }

        // Check the first and last characters.
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Check the middle part.
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.println("Is it a palindrome? "
                + isPalindrome(text));

        input.close();
    }
}
