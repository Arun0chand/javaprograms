package javapgall;

public class test {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("ABCD");

        // Append characters
        stringBuilder.append(" WORLD");

        // Insert characters at a specific position
//        stringBuilder.insert(5," JAVA");

        // Delete characters
        stringBuilder.delete(2,6);

        System.out.println(stringBuilder.toString());  // Output: Hello, Java
    }
}
