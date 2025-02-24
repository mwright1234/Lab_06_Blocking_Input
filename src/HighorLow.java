import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Generate a random number between 1 and 10 inclusive
        int randomNumber = (int) (Math.random() * 10) + 1;

        int userGuess = 0; // The user's guess
        boolean validInput = false; // Flag for input validation

        do {
            System.out.println("Guess the number (between 1 and 10):");

            // Check if the user input is a valid integer between 1 and 10
            if (in.hasNextInt()) {
                userGuess = in.nextInt();

                // Check if the input is within the valid range
                if (userGuess >= 1 && userGuess <= 10) {
                    validInput = true; // Valid input, exit the loop
                } else {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } else {
                System.out.println("That's not a valid number. Please enter a number between 1 and 10.");
                in.next(); // Consume the invalid input
            }
        } while (!validInput); // Continue looping until valid input

        // Display the result
        System.out.println("The number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed it right!");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess was too low. Try again next time!");
        } else {
            System.out.println("Your guess was too high. Try again next time!");
        }
    }
}