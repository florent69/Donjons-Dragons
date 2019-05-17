import Characters.Console;

/**
 * This class Main runs the project
 */
public class Main {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        Console console = new Console();
        console.createCharacter();
        console.menuDisplay();
        console.setboardGame(Console.askInt("How many cases for the board game "));
    }

}


