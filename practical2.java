import java.util.Scanner;

public class practical2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        // string me read kara or integer me convert kara 
        String input = scanner.nextLine();
        int number = Integer.parseInt(input); // Converting String to int
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <number; i++){
            if (number % i == 0) {
                return false; // Found a factor, it's not prime
            }
        }
        return true; // No factors found, it's prime
    }
}
