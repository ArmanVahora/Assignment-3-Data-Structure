import java.util.Scanner;

public class Question5Recursion {

    // This method reverses a number using recursion.
    public static int reverseNumber(int num, int reversed) {

        // Stop when there are no more digits.
        if (num == 0) {
            return reversed;
        }

        // Add the last digit to the reversed number.
        return reverseNumber(num / 10,
                reversed * 10 + num % 10);
    }

    // This method calculates the power using recursion.
    public static long power(int num, int exponent) {

        // Any number to the power of 0 is 1.
        if (exponent == 0) {
            return 1;
        }

        // Multiply and continue.
        return num * power(num, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int reversed = reverseNumber(number, 0);

        System.out.println("Reverse: " + reversed);
        System.out.println("Result: " + power(number, reversed));

        input.close();
    }
}
