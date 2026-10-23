import java.util.Scanner;

public class Question6Recursion {

    // This method finds the best score difference.
    public static int game(int[] nums, int left, int right) {

        // If one number is left, take it.
        if (left == right) {
            return nums[left];
        }

        // Choose the number from the beginning.
        int first = nums[left] - game(nums, left + 1, right);

        // Choose the number from the end.
        int last = nums[right] - game(nums, left, right - 1);

        // Return the better choice.
        return Math.max(first, last);
    }

    // This method checks if Player 1 wins.
    public static boolean player1Wins(int[] nums) {

        int difference = game(nums, 0, nums.length - 1);

        // A tie counts as a win for Player 1.
        return difference >= 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the elements:");

        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("Player 1 wins: "
                + player1Wins(nums));

        input.close();
    }
}
