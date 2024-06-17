/*6. Master Yoda, a renowned Jedi Master from the Star Wars universe, is known
for his unique way of speaking. He often reverses the order of words in his
sentences. For example, instead of saying "I am home" he might say "Home
am I" Design a function that takes a sentence as input and returns a new
sentence with the words reversed in the same order that Master Yoda would
use.*/

import java.util.Scanner;

public class YodaSentenceReverser {
    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence to reverse: ");
        String input = scanner.nextLine();

        String result = reverseSentence(input);
        System.out.println("Reversed sentence: " + result);
    }
}
