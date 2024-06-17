/*Design a function that determines whether a given string is a pangram. A
pangram is a sentence or phrase containing every letter of the alphabet at
least once. Punctuation and case are typically ignored. For example, the
string "The quick brown fox jumps over the lazy dog" is a pangram, while
"Hello, world!" is not.*/

import java.util.HashSet;
import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String input) {
        String lowerCaseInput = input.toLowerCase();
        HashSet<Character> alphabetSet = new HashSet<>();
        for (char c : lowerCaseInput.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }
        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a pangram: ");
        String input = scanner.nextLine();

        boolean result = isPangram(input);
        if (result) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}
