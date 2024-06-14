package src.main.java;

public class FunctionFaktorial {
    // Function to calculate factorial of a number
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Number must be non-negative.");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
