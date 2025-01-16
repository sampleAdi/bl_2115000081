import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu for the calculator
        System.out.println("Welcome to the Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Take user input for operation
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Take user input for numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        // Perform calculation based on the user's choice
        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default: // Invalid choice
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }
}
