package apitest;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        // Create an array of objects with elements of different data types
        Object[] arr = {12, "arun", "anil", 123456789, 12.345};

        // Iterate through the array and identify the data type of each element
        for (Object element : arr) {
            if (element instanceof Integer) {
                System.out.println("Integer: " + Arrays.deepToString((Object[]) element));
//           
//                System.out.println("Unknown Data Type: " + element);
            }
        }
    }
}

