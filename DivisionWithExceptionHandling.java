// Part b) Exception Handling

import java.util.Scanner;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get input from user
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            // Perform division
            int result = divide(num1, num2);
            
            // Display result
            System.out.println("Result of division: " + result);
            
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Cannot divide by zero!");
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close resources
            scanner.close();
        }
    }
    
    // Method to perform division
    public static int divide(int a, int b) {
        return a / b; // This will throw ArithmeticException if b is zero
    }
}
