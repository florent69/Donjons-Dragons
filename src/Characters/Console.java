package Characters;
import Characters.Spell.Spell;
import Characters.Weapon.Weapon;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    private ArrayList<Character> charactersList = new ArrayList<>(); // Collection ArrayList //

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
                charactersList.add(newWarrior); // collection ArrayList
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
                charactersList.add(newMagician);
                break;
            default:
                System.out.println("You have to choose between Warrior or Magician... Try again !!");
                setCharacter();
        }

    }

    public void createCharacter() {
        Warrior warrior = new Warrior("Ced", "photo", 10, 10, "knife", 2, "wooden shield");
        charactersList.add(warrior);
        Magician magician = new Magician("Tom", "tof", 6, 15, "fire ball", 2, "health");
        charactersList.add(magician);
    }

    public void menuDisplay()
            {
        int menuChoice;
        do {
        menuChoice = askInt("What do you want to do ? \n" +
                "1- Set a new character \n" +
                "2- Display all characters \n" +
                "3- Modify/Delete a character \n" +
                "4- Exit");

            switch(menuChoice) {
                case 1:
                    setCharacter();
                    System.out.println(charactersList.get(charactersList.size() - 1)); // display last character in the List
                    break;
                case 2:
                    displayAllCharacters();
                    break;
                case 3:
                    int chooseCharacter = chooseCharacter();
                    modifyOrDelete(chooseCharacter);
                    break;
                case 4:
                    System.out.println("OK !! Let's start !!");
                    break;
                default:
                    System.out.println("... Try again !!");
                    break;
            }
            } while (menuChoice != 4);
    }

    public void displayAllCharacters() {
        for(int i = 0; i < charactersList.size(); i++ ) {
            if (charactersList.get(i) != null) {
                System.out.println(i + ": " + charactersList.get(i));
            }
        }
    }

    public int chooseCharacter() {
        int choice;
        int count = 0;
        do {
            for(int i = 0; i < charactersList.size(); i++ ) {
                if (charactersList.get(i) != null) {
                    count ++;
                    System.out.println(i + ": " + charactersList.get(i));
                }
            }
            choice = askInt("Which character ");
        } while( 0 <= choice && choice > count);
        return choice;
    }

    public int modifyOrDelete(int characterIndex) {
        int choice;
        do {
            choice = askInt("1- Modify \n" + "2- Delete \n");
            switch (choice) {
                case 1:
                    modify(characterIndex);
                    break;
                case 2:
                    delete(characterIndex);
                    break;
            }
        }while (choice != 1 && choice != 2);

        return choice;
    }

    public void delete(int index) {
        charactersList.remove(index);
    }

    public void modify(int index) {
        String characterClass = charactersList.get(index).getClass().getSimpleName();
        charactersList.get(index).setName(askString("New name "));
        charactersList.get(index).setImage(askString("New image "));
        if (characterClass.equals("Warrior")) {
            ((Warrior)charactersList.get(index)).setWeapon(new Weapon(askString("New weapon's name "), numberBetween(0, 10)));
            ((Warrior)charactersList.get(index)).setShield(askString("New shield's name "));
        } else if (characterClass.equals("Magician")) {
            ((Magician)charactersList.get(index)).setSpell((new Spell(askString("New spell's name"), numberBetween(5, 15))));
            ((Magician)charactersList.get(index)).setPhilter(askString("New philter's name "));
        }
        System.out.println(index + "- " + charactersList.get(index));
    }

    public String askString(String question)
    {  // method askString and get the client's answer
        Scanner sc = new Scanner(System.in);
        System.out.println(question + "?");
        String answer = sc.nextLine();
        return answer;
    }

    public static int askInt(String question)
    {
        int answer = 0 ;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(question + "?");
            answer = sc.nextInt();
        } catch (Exception e) {
            System.out.println("You're not taping a number...");
            answer = askInt(question);
        }
        return answer;
    }

    public static int numberBetween(int min, int max) {
        int randomNum = (int)(Math.random() * (max - min)) + min ;
        return randomNum;
    }

    // ****************Creation of the board game ********************************//////////////////
    private ArrayList<String> boardGame = new ArrayList<>();

    public void setboardGame(int size) {
        for (int i = 0; i < size; i++) {
            int boardCase = numberBetween(1, 3);
            switch (boardCase) {
                case 1:
                    boardGame.add("free");
                case 2:
                    boardGame.add("bonus");
                case 3:
                    boardGame.add("enemy");
            }
        }
        System.out.println(boardGame);
    }

}
