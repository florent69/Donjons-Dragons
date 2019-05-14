package Characters;

import java.util.Scanner;

public class Console {
    Character charactersList[] = new Character[10];
    int characterIndex = 0;
    public void setCharacter() {
        int characterChoice;
        do {
            characterChoice = askInt("1- Warrior or 2- Magician ");  // Type of character
        } while ( characterChoice != 1 && characterChoice != 2 );
        createCharacter(characterChoice);

    }

    public void createCharacter(int characterChoice) {
        String characterName = askString("Character's name "); // magician's name
        String characterImage = askString("Character's image "); // Character's image
        int characterStamina = numberBetween(3, 6);
        System.out.println("Random Character's stamina : " + characterStamina); // Stamina
        int characterStrength = numberBetween(8, 15);
        System.out.println("Random Magician's strength : " + characterStrength); // strength
        switch (characterChoice) {
            case 1:
                String weaponName = askString("Weapon's name "); // Weapon's name
                int weaponStrength = numberBetween(0, 10);
                System.out.println("Random Weapon's strength : " + weaponStrength); // Weapon's strength
                String warriorShield = askString("Shield's name "); // Character's shield
                // Instanced warrior
                Warrior newWarrior = new Warrior(characterName, characterImage, characterStamina, characterStrength, weaponName, weaponStrength, warriorShield);
                charactersList[characterIndex] = newWarrior;
                characterIndex ++;
                break;
            case 2:
                String spellName = askString("Spell's name "); // spell's name
                int spellStrength = numberBetween(5, 15);  // spell's strength
                String magicianPhilter = askString("Magician's philter "); // magician's philter
                // Instanced magician
                Magician newMagician = new Magician(characterName, characterImage, characterStamina, characterStrength, spellName, spellStrength, magicianPhilter);
                charactersList[characterIndex] = newMagician;
                characterIndex ++;
                break;
            default:
                System.out.println("You have to choose between Warrior or Magician... Try again !!");
                setCharacter();
        }
    }

    public void menuDisplay() {
        int menuChoice = askInt("Welcome to the menu of this app! \n" +
                    "1- Display your character \n" +
                    "2- Modify a character \n" +
                    "3- Delete a character \n" +
                    "4- Set a new character \n" +
                    "5- Exit");

            switch(menuChoice) {
                case 1:
                    System.out.println(charactersList[characterIndex-1].toString());
                    menuDisplay();
                    break;
                case 2:
                    System.out.println("this function is coming soon !!");
                    break;
                case 3:
                    
                    break;
                case 4:
                    setCharacter();
                    menuDisplay();
                    break;
                case 5:
                    System.out.println("OK !! See you later !!");
                    break;
                default:
                    System.out.println("... Try again !!");
                    menuDisplay();
                    break;
            }
    }

    public static String askString(String question) { // method askString and get the client's answer
        Scanner sc = new Scanner(System.in);
        System.out.println(question + "?");
        String answer = sc.nextLine();
        return answer;
    }

    public static int askInt(String question) {
        Scanner sc = new Scanner(System.in);
        System.out.println(question + "?");
        int answer = sc.nextInt();
        return answer;
    }

    public static int numberBetween(int min, int max) {
        int randomNum = (int)(Math.random() * (max - min)) + min ;
        return randomNum;
    }


}
