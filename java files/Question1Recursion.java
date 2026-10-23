import java.util.Scanner;

public class Question1Recursion {

    // This method finds the sum of all the digits.
    public static int sumDigits(int num) {

        // Stop when there are no more digits.
        if (num == 0) {
            return 0;
        }

        // Add the last digit and continue with the rest.
        return (num % 10) + sumDigits(num / 10);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        System.out.println("Sum of digits: " + sumDigits(number));

        input.close();
    }
}