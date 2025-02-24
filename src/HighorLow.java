import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 10) + 1;

        int userGuess = 0;
        boolean validInput = false;

        do {
            System.out.println("Guess the number (between 1 and 10):");

            if (in.hasNextInt()) {
                userGuess = in.nextInt();

                if (userGuess >= 1 && userGuess <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } else {
                System.out.println("That's not a valid number. Please enter a number between 1 and 10.");
                in.next();
            }
        } while (!validInput);

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