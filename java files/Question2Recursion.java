import java.util.Scanner;

public class Question2Recursion {

    // This method counts how many times the character appears.
    public static int countChar(String str, char ch, int index) {

        // Stop when we reach the end of the string.
        if (index == str.length()) {
            return 0;
        }

        int count = 0;

        // Check if the current character matches.
        if (str.charAt(index) == ch) {
            count = 1;
        }

        // Move to the next character using recursion.
        return count + countChar(str, ch, index + 1);
    }

    public static void main(String[] args) {

        // Create Scanner to get input from the user.
        Scanner input = new Scanner(System.in);

        // Ask the user for a string.
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Ask the user for the character to count.
        System.out.print("Enter a character: ");
        char character = input.nextLine().charAt(0);

        // Start checking the string from the first character.
        int result = countChar(text, character, 0);

        // Display the number of times the character was found.
        System.out.println("Number of times the character appears: " + result);

        input.close();
    }
}