package Characters;

import java.util.Scanner;

public class Console {

    private Character[] charactersList = new Character[10];
    private int characterIndex = 0;

    public void setCharacter() {
        int characterChoice;
        do {
            characterChoice = askInt("1- Warrior or 2- Magician ");  // Type of character
        } while ( characterChoice != 1 && characterChoice != 2 );
        String characterName = askString("Character's name "); // magician's name
        String characterImage = askString("Character's image "); // Character's image

        switch (characterChoice) {
            case 1:
                int warriorStamina = numberBetween(5, 10);
                System.out.println("Random Character's stamina : " + warriorStamina); // Stamina
                int warriorStrength = numberBetween(5, 10);
                System.out.println("Random Magician's strength : " + warriorStrength); // strength
                String weaponName = askString("Weapon's name "); // Weapon's name
                int weaponStrength = numberBetween(0, 10);
                System.out.println("Random Weapon's strength : " + weaponStrength); // Weapon's strength
                String warriorShield = askString("Shield's name "); // Character's shield
                // Instanced warrior
                Warrior newWarrior = new Warrior(characterName, characterImage, warriorStamina, warriorStrength, weaponName, weaponStrength, warriorShield);
                charactersList[characterIndex] = newWarrior;
                characterIndex ++;
                break;
            case 2:
                int magicianStamina = numberBetween(3, 6);
                System.out.println("Random Character's stamina : " + magicianStamina); // Stamina
                int magicianStrength = numberBetween(8, 15);
                System.out.println("Random Magician's strength : " + magicianStrength); // strength
                String spellName = askString("Spell's name "); // spell's name
                int spellStrength = numberBetween(5, 15);  // spell's strength
                String magicianPhilter = askString("Magician's philter "); // magician's philter
                // Instanced magician
                Magician newMagician = new Magician(characterName, characterImage, magicianStamina, magicianStrength, spellName, spellStrength, magicianPhilter);
                charactersList[characterIndex] = newMagician;
                characterIndex ++;
                break;
            default:
                System.out.println("You have to choose between Warrior or Magician... Try again !!");
                setCharacter();
        }

    }

    public void createCharacter() {
        Warrior warrior = new Warrior("Ced", "photo", 10, 10, "knife", 2, "wooden shield");
        charactersList[characterIndex] = warrior;
        characterIndex ++;
        Magician magician = new Magician("Tom", "tof", 6, 15, "fire ball", 2, "health");
        charactersList[characterIndex] = magician;
        characterIndex ++;
    }

    public void menuDisplay() {
        int menuChoice;
        do {
        menuChoice = askInt("Welcome to the menu of this app! \n" +
                "1- Set a new character \n" +
                "2- Display all characters \n" +
                "3- Modify/Delete a character \n" +
                "4- Exit");

            switch(menuChoice) {
                case 1:
                    setCharacter();
                    System.out.println(charactersList[characterIndex - 1]);
                    break;
                case 2:
                    displayAllCharacters();
                    break;
                case 3:
                    int chooseCharacter = chooseCharacter();
                    modifyOrDelete();
                    modify(chooseCharacter);
                    break;
                case 4:
                    System.out.println("OK !! See you later !!");
                    break;
                default:
                    System.out.println("... Try again !!");
                    break;
            }
            } while (menuChoice != 4);
    }

    public void displayAllCharacters() {
        for(int i = 0; i < charactersList.length; i++ ) {
            if (charactersList[i] != null) {
                System.out.println(i + ": " + charactersList[i]);
            }
        }
    }

    public int chooseCharacter() {
        int choice;
        int count = 0;
        do {
            for(int i = 0; i < charactersList.length; i++ ) {
                if (charactersList[i] != null) {
                    count ++;
                    System.out.println(i + ": " + charactersList[i]);
                }
            }
            choice = askInt("Which character ");
        } while( 0 <= choice && choice > count);
        return choice;
    }

    public int modifyOrDelete() {
        int choice;
        do {
            choice = askInt("1- Modify \n" + "2- Delete \n");
            switch (choice) {
                case 1:
                    System.out.println("Modify");
                    break;
                case 2:
                    System.out.println("Delete");
                    break;
            }
        }while (choice != 1 && choice != 2);

        return choice;
    }

    public void modify(int characterIndex) {
//       charactersList[characterIndex].name = askString("New name ");
//        charactersList[characterIndex].image = askString("New image ");
//        if ()


    }

    public String askString(String question) { // method askString and get the client's answer
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
