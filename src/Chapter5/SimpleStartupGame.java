package Chapter5;

// Main class for the Simple Startup game
public class SimpleStartupGame {
    public static void main(String[] args) {
        // Counter to track how many guesses the player makes
        int numOfGuesses = 0;

        // Helper object to handle user input
        GameHelper helper = new GameHelper();

        // Create a new SimpleStartup object (the "ship" to sink)
        SimpleStartup theStartup = new SimpleStartup();

        // Generate a random starting location between 0 and 4
        // The ship occupies 3 consecutive cells
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        // Assign the location cells to the Startup object
        theStartup.setLocationCells(locations);

        // Flag to check if the game is still running
        boolean isAlive = true;

        // Main game loop — keeps running until the Startup is sunk
        while (isAlive) {
            // Prompt the user to enter a number as a guess
            int guess = helper.getUserInput("enter a number");

            // Check the guess against the Startup's location
            String result = theStartup.checkYourself(guess);

            // Increment the guess counter
            numOfGuesses++;

            // If the result is "kill", the ship has been sunk
            if (result.equals("kill")) {
                isAlive = false; // End the game
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}


