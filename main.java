import ArcInJava.*;
import javax.swing.JFrame;

public class main {

    public static void main(String[] args) {
        boolean gameStart = true;

        // Create an instance of InputHandler
        InputHandler inputHandler = new InputHandler();

        // Creates an instance of GUI class
        GUI gui = new GUI(inputHandler);



        // Your game setup code
        Map map = new Map(20, 40);
        Player player = new Player("Test", 100, 0);
        System.out.println("Hello");
        map.printMap(player.getPlayerLocation());

        // Game loop
        while (gameStart) {
            // Example of using the input
            if (inputHandler.input == 'W') {
                // Move player up or any other action
                System.out.println("Player moves up");
                inputHandler.input = '\0'; // Reset input to avoid repeated actions
            }
            // Add other key handling logic here (A, S, D)
        }
    }
}
