package testnglist;

public class SumArray {
    public static void main(String[] args) {
        String inputString = "4¥$SDFyuiwh8908999999 hello world !@#";
        
        char[] characters = inputString.toCharArray();
        
        // Initialize arrays to store upper case, lower case, and numbers
        char[] upperCaseArray = new char[characters.length];
        char[] lowerCaseArray = new char[characters.length];
        char[] numberArray = new char[characters.length];
        char[] specialarray=new char[characters.length];
        
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;
        int specialcharacters=0;
        
        // Iterate through the characters in the input string
        for (char c : characters) {
            if (Character.isUpperCase(c)) {
                upperCaseArray[upperCaseCount++] = c;
            } else if (Character.isLowerCase(c)) {
                lowerCaseArray[lowerCaseCount++] = c;
            } else if (Character.isDigit(c)) {
                numberArray[numberCount++] = c;
            }else if(!Character.isWhitespace(c) && !Character.isLetterOrDigit(c)) {
            	specialarray[specialcharacters++]=c;
            }
        }
        
        // Create arrays with only the relevant characters
        char[] finalUpperCaseArray = new char[upperCaseCount];
        char[] finalLowerCaseArray = new char[lowerCaseCount];
        char[] finalNumberArray = new char[numberCount];
        char[] finalspecialcharacter = new char[specialcharacters];
        
        System.arraycopy(upperCaseArray, 0, finalUpperCaseArray, 0, upperCaseCount);
        System.arraycopy(lowerCaseArray, 0, finalLowerCaseArray, 0, lowerCaseCount);
        System.arraycopy(numberArray, 0, finalNumberArray, 0, numberCount);
        System.arraycopy(specialarray, 0, finalspecialcharacter, 0, specialcharacters);
        
        System.out.println("Uppercase Letters: " + new String(finalUpperCaseArray));
        System.out.println("Lowercase Letters: " + new String(finalLowerCaseArray));
        System.out.println("Numbers: " + new String(finalNumberArray));
        System.out.println("Numbers: " + new String(finalspecialcharacter));
    }
}
