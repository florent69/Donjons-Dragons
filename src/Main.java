import Characters.Warrior;
import Characters.Magician;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        setCharacter();

    }

    public static void setCharacter() {
        Scanner sc = new Scanner(System.in);
        String characterChoice;
        String warriorName;
        String magicianName;
        String warriorImage;
        String magicianImage;
        int warriorStamina;
        int magicianStamina;
        int warriorStrength;
        int magicianStrength;
        // variable for Warrior
        String weaponName;
        int weaponStrength;
        String warriorShield;
        // variable for Magician
        String spellName;
        int spellStrength;
        String magicianPhilter;
        do {
            // Type of character
            System.out.println("Choose your character : Warrior or Magician ?");
            characterChoice = sc.nextLine();
            System.out.println("Your choice is : " + characterChoice);

            switch(characterChoice) {
                case "Warrior":
                    // warrior's name
                    System.out.println("A name for your character ? ");
                    warriorName = sc.nextLine();
                    System.out.println(warriorName + " is born !");
                    // Character's image
                    System.out.println("Your character image ? set a URL ");
                    warriorImage = sc.nextLine();
                    System.out.println("URL is: " + warriorImage);
                    // stamina
                    System.out.println("Character's stamina ? Set a number between 5 and 10 !");
                    warriorStamina = sc.nextInt();
                    System.out.println("Your character's life is " + warriorStamina);
                    // strength
                    System.out.println("Character's strength ? Set a number between 5 and 10 !");
                    warriorStrength = sc.nextInt();
                    System.out.println("Your character's strength is " + warriorStrength);
                    // Weapon's name
                    System.out.println("Choose a weapon : What is its name ?");
                    sc.nextLine();
                    weaponName = sc.nextLine();
                    System.out.println("Your choice is : " + weaponName);
                    // Weapon's strength
                    System.out.println("Choose a weapon : What is its strength ?");
                    weaponStrength = sc.nextInt();
                    System.out.println("Your choice is : " + weaponStrength);
                    // Character's shield
                    System.out.println("Choose a shield : What is its name ?");
                    sc.nextLine();
                    warriorShield = sc.nextLine();
                    System.out.println("Your choice is : " + warriorShield);
                    // Instanced warrior
                    Warrior newWarrior = new Warrior(warriorName, warriorImage, warriorStamina, warriorStrength, weaponName, weaponStrength, warriorShield);
                    break;
                case "Magician":
                    // magician's name
                    System.out.println("A name for your character ? ");
                    magicianName = sc.nextLine();
                    System.out.println(magicianName + " is alive !");
                    // Character's image
                    System.out.println("Your character image ? set a URL ");
                    magicianImage = sc.nextLine();
                    System.out.println("URL is: " + magicianImage);
                    // Stamina
                    System.out.println("Character's stamina ? Set a number between 3 and 6 !");
                    magicianStamina = sc.nextInt();
                    System.out.println("Your character's life is " + magicianStamina);
                    // strength
                    System.out.println("Character's strength ? Set a number between 8 and 15 !");
                    magicianStrength = sc.nextInt();
                    System.out.println("Your character's strength is " + magicianStrength);
                    // spell's name
                    System.out.println("Choose a spell : What is its name ?");
                    sc.nextLine();
                    spellName = sc.nextLine();
                    System.out.println("Your choice is : " + spellName);
                    // spell's strength
                    System.out.println("Choose a spell : What is its strength ?");
                    spellStrength = sc.nextInt();
                    System.out.println("Your choice is : " + spellStrength);
                    // Character's shield
                    System.out.println("Choose a shield : What is its name ?");
                    sc.nextLine();
                    magicianPhilter = sc.nextLine();
                    System.out.println("Your shield's name is : " + magicianPhilter);
                    // Instanced Magician
                    Magician newMagician = new Magician(magicianName, magicianImage, magicianStamina, magicianStrength, spellName, spellStrength, magicianPhilter);
                    break;
            }
            break;
        } while(characterChoice.equalsIgnoreCase("Warrior") || characterChoice.equalsIgnoreCase("Magician"));
    }

}
