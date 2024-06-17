/*3. Design a function that takes a string or sequence of characters as input and
returns the character that appears most frequently.
//Eg 11189 => '1'
//hello => l*/

import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static char mostFrequentChar(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        char mostFrequent = input.charAt(0);
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > charCount.get(mostFrequent)) {
                mostFrequent = c;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = mostFrequentChar(input);
        System.out.println("The most frequent character is: " + result);
    }
}
