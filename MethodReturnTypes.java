public class MethodReturnTypes {  // Single class declaration

    // Method to display a welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method to calculate the average of two numbers
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;  // Ensure correct division
        return average;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Display welcome message
        displayWelcomeMessage();

        // Declare variables
        int value1 = 20;
        int value2 = 30;

        // Calculate the average and store it in a variable
        double result = calculateAverage(value1, value2);

        // Print the result
        System.out.println("The average is: " + result);
    }
} // End of class
