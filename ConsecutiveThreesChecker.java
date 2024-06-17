/*5. Design a function that takes a list of integers as input. The function should
return True if the list contains two consecutive threes (3 next to a 3) anywhere
within the list. Otherwise, it should return False. For example, the function
should return True for [1, 3, 3] and False for [1, 3, 1, 3].*/

import java.util.Scanner;

public class ConsecutiveThreesChecker {
    public static boolean hasConsecutiveThrees(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean result = hasConsecutiveThrees(nums);
        if (result) {
            System.out.println("The list contains consecutive threes.");
        } else {
            System.out.println("The list does not contain consecutive threes.");
        }
    }
}
