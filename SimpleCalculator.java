import java.util.Scanner; // This line allows us to read input from the user

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inputReader = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first whole number: ");
        int num1 = inputReader.nextInt(); // Read the first integer from the user

        // Prompt the user to enter the second number
        System.out.print("Enter the second whole number: ");
        int num2 = inputReader.nextInt(); // Read the second integer from the user

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner to free up system resources
        inputReader.close(); trg
    }
}