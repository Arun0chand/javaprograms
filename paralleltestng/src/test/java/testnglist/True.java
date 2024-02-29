package testnglist;

public class True {
    public static void main(String[] args) {
        String inputString = "Hello, World! 123";
        
        int specialcharacterscount=0;
        int lowercasecount=0;
        int digits=0;

        System.out.println("Input String: " + inputString);

        System.out.print("Special Characters: ");
        for (char character : inputString.toCharArray()) {
            if (!Character.isLetterOrDigit(character) && !Character.isWhitespace(character)) {
              System.out.print(character+" ");
                specialcharacterscount++;
                
            }
             }
       
        System.out.println();

        System.out.print("Numbers: ");
        for (char character : inputString.toCharArray()) {
            if (Character.isDigit(character)) {
                System.out.print(character + " ");
                
                
            }
        }
        System.out.println();

        System.out.print("Capital Letters: ");
        for (char character : inputString.toCharArray()) {
            if (Character.isUpperCase(character)) {
                System.out.print(character + " ");
            }
        }
        System.out.println();

        System.out.print("Small Letters: ");
        for (char character : inputString.toCharArray()) {
            if (Character.isLowerCase(character)) {
                System.out.print(character + " ");
            }
        }
        System.out.println();
        
        System.out.println("Coutnof Specialcharacters"+specialcharacterscount);
    }
}
