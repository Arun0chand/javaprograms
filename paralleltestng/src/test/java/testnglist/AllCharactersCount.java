package testnglist;

public class AllCharactersCount {
    public static void main(String[] args) {
        String inputString = "Hello, World! 123";

        int specialCharCount = 0;
        int numberCount = 0;
        int capitalLetterCount = 0;
        int smallLetterCount = 0;

        for (char character : inputString.toCharArray()) {
            if (Character.isLetter(character)) {
                if (Character.isUpperCase(character)) {
                    capitalLetterCount++;
                } else {
                    smallLetterCount++;
                }
            } else if (Character.isDigit(character)) {
                numberCount++;
            } else if (!Character.isWhitespace(character)) {
                specialCharCount++;
            }
        }

        System.out.println("Input String: " + inputString);
        System.out.println("Special Characters: " + specialCharCount);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Capital Letters: " + capitalLetterCount);
        System.out.println("Small Letters: " + smallLetterCount);
    }
}

