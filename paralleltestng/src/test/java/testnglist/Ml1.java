package testnglist;

public class Ml1 {
    public static void main(String[] args) {
        String inputString = "4¥$SDFyuiwh890";
        
        char[] characters = inputString.toCharArray();
        
        // Initialize arrays to store upper case, lower case, and numbers
        char[] upperCaseArray = new char[characters.length];
        char[] lowerCaseArray = new char[characters.length];
        char[] numberArray = new char[characters.length];
        
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;
        
        // Iterate through the characters in the input string
        for (char c : characters) {
            if (Character.isUpperCase(c)) {
                upperCaseArray[upperCaseCount++] = c;
            } else if (Character.isLowerCase(c)) {
                lowerCaseArray[lowerCaseCount++] = c;
            } else if (Character.isDigit(c)) {
                numberArray[numberCount++] = c;
            }
        }

        
        System.out.println("Uppercase Letters: " + new String(upperCaseArray));
        System.out.println("Lowercase Letters: " + new String(lowerCaseArray));
        System.out.println("Numbers: " + new String(numberArray));
    }
}
