import java.util.Scanner;

public class Question4Recursion {

    // This method counts the number of zeros.
    public static int countZeros(int num) {

        // Stop when there are no more digits.
        if (num == 0) {
            return 0;
        }

        int count = 0;

        // Check if the last digit is zero.
        if (num % 10 == 0) {
            count = 1;
        }

        // Check the remaining digits.
        return count + countZeros(num / 10);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result;

        // The number 0 itself contains one zero.
        if (number == 0) {
            result = 1;
        } else {
            result = countZeros(number);
        }

        System.out.println("Number of zeros: " + result);

        input.close();
    }
}