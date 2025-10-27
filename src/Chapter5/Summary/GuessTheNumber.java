package Chapter5.Summary;

public class GuessTheNumber {
    public static void main(String[] args) {
        int secret = 7;
        int guess = 0;

        System.out.println("Try to guess the number (1–10)!");

        while (guess != secret) {
            guess++;
            System.out.println("Guessing: " + guess);

            if (guess == secret) {
                System.out.println("🎯 Got it! The number was " + secret);
            } else if (guess < secret) {
                System.out.println("Too low...");
            } else {
                System.out.println("Too high...");
            }
        }
    }
}

