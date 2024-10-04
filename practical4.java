class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class practical4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3)); // Calls method with 2 int parameters
        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3)); // Calls method with 3 int parameters
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5)); // Calls method with 2 double parameters
    }
}
