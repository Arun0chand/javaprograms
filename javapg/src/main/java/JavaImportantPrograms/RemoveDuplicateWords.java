package JavaImportantPrograms;

import java.util.HashSet;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
        String inputString = "java is very good language and java is coding language";

        String resultString = removeDuplicates(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("String without Duplicate Words: " + resultString);
    }

    private static  String removeDuplicates(String input) {
        String[] words = input.split("\\s+"); // Split the string into words
        HashSet<String> uniqueWords = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (uniqueWords.add(word.toLowerCase())) {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}
