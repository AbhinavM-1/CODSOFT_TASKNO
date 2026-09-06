import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int number = r.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");

        while (true) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess == number) {
                System.out.println("Correct Guess!");
                System.out.println("You guessed it in " + attempts + " attempts.");
                break;
            }
            else if (guess < number) {
                System.out.println("Too Low! Try again.");
            }
            else {
                System.out.println("Too High! Try again.");
            }
        }

        sc.close();
    }
}
