import java.util.Scanner;
import java.util.Random; // Although not strictly necessary for Math.random(), it's good practice for general random number generation

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int secretNumber = (int) (Math.random() * 5) + 1;

        int maxTries = 3;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 5. You have " + maxTries + " chances to guess it.");

        for (int tryCount = 1; tryCount <= maxTries; tryCount++) {
            System.out.print("Chance " + tryCount + ": Enter your guess: ");
            int playerGuess = scanner.nextInt();

            if (playerGuess == secretNumber) {
                System.out.println("You win!");
                hasGuessedCorrectly = true;
                break;
            } else {
                System.out.println("Incorrect guess.");
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("You lose. The correct number was " + secretNumber + ".");
        }

        scanner.close();
    }
}