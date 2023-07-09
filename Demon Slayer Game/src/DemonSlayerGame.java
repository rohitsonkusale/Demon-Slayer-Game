import java.util.*;

public class DemonSlayerGame {
    private int playerHealth;
    private int demonHealth;

    public DemonSlayerGame() {
        playerHealth = 100;
        demonHealth = 150;
    }

    public void attack() {
        // Generate a random damage value between 1 and 10
        int damage = (int) (Math.random() * 10 + 1);
        demonHealth -= damage;
        System.out.println("You attacked the demon and dealt " + damage + " damage.");

        // Check if the demon's health has dropped to or below 0
        if (demonHealth <= 0) {
            System.out.println("Congratulations! You have defeated the demon!");
            return;
        }

        // Generate a random damage value between 1 and 15
        damage = (int) (Math.random() * 15 + 1);
        playerHealth -= damage;
        System.out.println("The demon attacked you and dealt " + damage + " damage.");

        // Check if the player's health has dropped to or below 0
        if (playerHealth <= 0) {
            System.out.println("Game over! The demon has defeated you.");
        }
    }

    public static void main(String[] args) {
        DemonSlayerGame game = new DemonSlayerGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Demon Slayer game!");

        // Game loop: continue as long as both player and demon have health remaining
        while (game.playerHealth > 0 && game.demonHealth > 0) {
            System.out.println("\nPlayer Health: " + game.playerHealth);
            System.out.println("Demon Health: " + game.demonHealth);
            System.out.println("Enter 'a' to attack the demon or 'q' to quit: ");

            // Read user input
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("a")) {
                // If the user entered 'a', call the attack method
                game.attack();
            } else if (input.equalsIgnoreCase("q")) {
                // If the user entered 'q', quit the game
                System.out.println("You have quit the game.");
                break;
            } else {
                // If the user entered an invalid input, display an error message
                System.out.println("Invalid input. Please try again.");
            }
        }

        System.out.println("\nThank you for playing the Demon Slayer game!");
        scanner.close();
    }
}
