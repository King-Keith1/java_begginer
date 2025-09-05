package Chapter5;

import java.util.Scanner;

// This helper class handles user input for the game
public class GameHelper {

    /**
     * Prompts the user with a message, waits for input,
     * and returns the entered integer.
     *
     * @param prompt the message to display to the user
     * @return the integer value entered by the user
     */
    public int getUserInput(String prompt) {
        // Print the prompt message followed by a colon
        System.out.print(prompt + ": ");

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read and return the integer entered by the user
        return scanner.nextInt();
    }
}

