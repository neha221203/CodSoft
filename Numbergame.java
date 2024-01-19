import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        int maxAttempts = 10;
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        do {
            System.out.println("Enter your guess number (1-100): ");
            guess = input.nextInt();
            
            attempts++;
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (guess < randomNumber) {
                System.out.println("Too small! Try again with a larger number.");
            } else {
                System.out.println("Too big! Try again with a smaller number.");
            }
            
            if (attempts == maxAttempts) {
                System.out.println("You have reached the maximum number of attempts. The correct number was " + randomNumber + ".");
                break;
            }
        } while (guess != randomNumber);
        
        input.close();
    }
}