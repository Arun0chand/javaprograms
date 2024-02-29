package testnglist;

public class Fibonacii {
    public static void main(String[] args) {
        int input1 = 1; // Replace with the starting range
        int input2 = 100; // Replace with the ending range

        int firstFibonacciDivisibleBy3 = findFirstFibonacciDivisibleBy3(input1, input2);

        if (firstFibonacciDivisibleBy3 != -1) {
            System.out.println("First Fibonacci divisible by 3 in the range [" + input1 + ", " + input2 + "]: " + firstFibonacciDivisibleBy3);
        } else {
            System.out.println("No Fibonacci number divisible by 3 found in the range [" + input1 + ", " + input2 + "].");
        }
    }

    // Function to check if a number is part of the Fibonacci sequence
    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (a < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == num;
    }

    // Function to find the first Fibonacci number divisible by 3 in the given range
    public static int findFirstFibonacciDivisibleBy3(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isFibonacci(i) && i % 3 == 0) {
                return i;
            }
        }
        return -1; // Return -1 if no such number is found
    }
}

