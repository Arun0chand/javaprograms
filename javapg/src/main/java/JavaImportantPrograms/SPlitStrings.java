package JavaImportantPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class SPlitStrings {

	public static void main(String[] args) {

		String inputstring="java is very good language and java is coding language";
		String resultstring=removeDuplicates(inputstring);

		System.out.println("Orginal string is"+inputstring);
		System.out.println("Updated string is"+resultstring);

	}

	private static  String removeDuplicates(String input) {
		String[] words = input.split("\\s+");

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

