import src.main.java.FunctionFaktorial;

public class FunctionFaktorialDriver {
    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        long result = FunctionFaktorial.factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

