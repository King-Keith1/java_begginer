import java.util.Random;
import java.util.Scanner;

public class SheepGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Randomly pick role: true for shepherd, false for wolf
        boolean isShepherd = rand.nextBoolean();

        // Initial random number of sheep (between 1 and 20)
        int sheepCount = rand.nextInt(20) + 1;

        // Introduction based on role
        if (isShepherd) {
            System.out.println("You are a shepherd. You need to guess exactly how many sheep are out there to bring them all in safely.");
            System.out.println("Enter your guess:");
        } else {
            System.out.println("You are a wolf with a family to feed. Guess how many sheep you can eat without getting caught.");
            System.out.println("Enter your guess:");
        }

        int attempts = 0;

        while (true) {
            int guess = scanner.nextInt();

            if (guess == sheepCount) {
                // Success message based on role
                if (isShepherd) {
                    System.out.println("Perfect! You brought in all " + sheepCount + " sheep safely.");
                } else {
                    System.out.println("Success! You're taking " + sheepCount + " sheep home to your family.");
                }
                break;
            } else {
                attempts++;

                // Give hint based on guess vs current sheepCount
                String hint;
                if (isShepherd) {
                    if (guess > sheepCount) {
                        hint = "You think there are fewer sheep out there than that.";
                    } else {
                        hint = "You think there are more sheep out there than that.";
                    }
                } else {
                    if (guess > sheepCount) {
                        hint = "You smell there's less than that.";
                    } else {
                        hint = "You smell there's more than that.";
                    }
                }
                System.out.println(hint);

                // Now handle wrong guess based on role (penalty)
                if (isShepherd) {
                    if (sheepCount <= 1) {
                        System.out.println("Wrong guess! The wolf got the last sheep. You failed as a shepherd.");
                        break;
                    }
                    // Wolf eats a random number of sheep (1 to 10, but not more than current sheep -1)
                    int eaten = rand.nextInt(Math.min(10, sheepCount - 1)) + 1;
                    sheepCount -= eaten;
                    System.out.println("Wrong guess! The wolf got " + eaten + " sheep. Now there are fewer sheep left—guess a lower number:");
                    if (sheepCount <= 0) {
                        System.out.println("Oh no! All sheep are gone. You failed as a shepherd.");
                        break;
                    }
                } else {
                    if (sheepCount <= 1) {
                        System.out.println("Wrong guess! No more sheep to get away. You go home hungry.");
                        break;
                    }
                    // Wolf: escalating messages, up to 3 attempts
                    // Random sheep leave (1 to 10, but not more than current -1)
                    int left = rand.nextInt(Math.min(10, sheepCount - 1)) + 1;
                    sheepCount -= left;
                    System.out.println("Wrong guess! " + left + " sheep got away.");

                    if (attempts == 1) {
                        System.out.println("The sheep are agitated and the shepherd is awake. Try again (guess lower):");
                    } else if (attempts == 2) {
                        System.out.println("The shepherd is looking for you now. One more chance (guess lower):");
                    } else {
                        System.out.println("You won't be making it home tonight. Game over!");
                        break;
                    }

                    if (sheepCount <= 0) {
                        System.out.println("All sheep have fled. You go home hungry.");
                        break;
                    }
                }
            }
        }

        scanner.close();
    }
}