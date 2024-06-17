/*1. Design a function that reverses the digits of an integer. For example, 50
should become 5 and -12 should become -21.*/

public class ReverseDigits {
    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(60)); // Output: 5
        System.out.println(reverseDigits(-12)); // Output: -21
    }
}
