import Characters.Warrior;
import Characters.Magician;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        setCharacter();

    }

    public static void setCharacter() {

        String characterChoice;
        do {
            characterChoice = askQuestion("Warrior or Magician ");  // Type of character

            switch(characterChoice) {
                case "Warrior":
                    String warriorName = askQuestion("Warrior's name ");  // name
                    String warriorImage = askQuestion("Warrior's image "); // image
                    int warriorStamina = numberBetween(5, 10);
                    System.out.println("Random Warrior's stamina : " + warriorStamina); // stamina
                    int warriorStrength = numberBetween(5, 10);
                    System.out.println("Random Warrior's strength : " + warriorStrength); // strength
                    String weaponName = askQuestion("Weapon's name "); // Weapon's name
                    int weaponStrength = numberBetween(0, 10);
                    System.out.println("Random Weapon's strength : " + weaponStrength); // Weapon's strength
                    String warriorShield = askQuestion("Shield's name "); // Character's shield
                    // Instanced warrior
                    Warrior newWarrior = new Warrior(warriorName, warriorImage, warriorStamina, warriorStrength, weaponName, weaponStrength, warriorShield);
                    break;

                case "Magician":
                    String magicianName = askQuestion("Magician's name "); // magician's name
                    String magicianImage = askQuestion("Magician's image "); // Character's image
                    int magicianStamina = numberBetween(3, 6); // Stamina
                    int magicianStrength = numberBetween(8, 15);
                    System.out.println("Random Magician's strength : " + magicianStrength); // strength
                    String spellName = askQuestion("Spell's name "); // spell's name
                    int spellStrength = numberBetween(5, 15);  // spell's strength
                    String magicianPhilter = askQuestion("Magician's philter "); // magician's philter
                    // Instanced Magician
                    Magician newMagician = new Magician(magicianName, magicianImage, magicianStamina, magicianStrength, spellName, spellStrength, magicianPhilter);
                    break;
                    
                default:
                    System.out.println("You have to choose between Warrior or Magician... Try again !!");
                    setCharacter();
            }
            break;
        } while(characterChoice.equalsIgnoreCase("Warrior") || characterChoice.equalsIgnoreCase("Magician"));
    }

    public static String askQuestion(String question) {
        Scanner sc = new Scanner(System.in);
        System.out.println(question + "?");
        String answer = sc.nextLine();
        System.out.println(question + " : " + answer);
        return answer;
    }

    public static int numberBetween(int min, int max) {
                int randomNum = (int)(Math.random() * (max - min)) + min ;
                return randomNum;
    }

}

