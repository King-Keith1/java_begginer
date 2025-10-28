package Chapter5.Summary;

import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(10) + 1;  // random number 1–10
        int guess = 0;

        System.out.println("🎯 Guess the number between 1 and 10!");

        while (guess != secret) {
            guess++;
            System.out.println("Trying number: " + guess);

            if (guess == secret) {
                System.out.println("✅ Got it! The secret number was " + secret);
            } else if (guess < secret) {
                System.out.println("Too low...");
            } else {
                System.out.println("Too high...");
            }
        }

        System.out.println("Game Over 🎮");
    }
}

