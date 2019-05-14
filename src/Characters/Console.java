package Characters;

import java.util.Scanner;

public class Console {

    public void setCharacter() {
        int characterChoice;
        Warrior warriorList[] = new Warrior[10];
        Magician magicianList[] = new Magician[10];
        int warriorIndex = 0;
        int magicianIndex = 0;
        do {
            characterChoice = askInt("1- Warrior or 2- Magician ");  // Type of character

            switch(characterChoice) {
                case 1:
                    String warriorName = askString("Warrior's name ");  // name
                    String warriorImage = askString("Warrior's image "); // image
                    int warriorStamina = numberBetween(5, 10);
                    System.out.println("Random Warrior's stamina : " + warriorStamina); // stamina
                    int warriorStrength = numberBetween(5, 10);
                    System.out.println("Random Warrior's strength : " + warriorStrength); // strength
                    String weaponName = askString("Weapon's name "); // Weapon's name
                    int weaponStrength = numberBetween(0, 10);
                    System.out.println("Random Weapon's strength : " + weaponStrength); // Weapon's strength
                    String warriorShield = askString("Shield's name "); // Character's shield
                    // Instanced warrior
                    Warrior newWarrior = new Warrior(warriorName, warriorImage, warriorStamina, warriorStrength, weaponName, weaponStrength, warriorShield);

                    warriorList[warriorIndex] = newWarrior;
                    warriorIndex ++;

                    break;

                case 2:
                    String magicianName = askString("Magician's name "); // magician's name
                    String magicianImage = askString("Magician's image "); // Character's image
                    int magicianStamina = numberBetween(3, 6);
                    System.out.println("Random Warrior's stamina : " + magicianStamina); // Stamina
                    int magicianStrength = numberBetween(8, 15);
                    System.out.println("Random Magician's strength : " + magicianStrength); // strength
                    String spellName = askString("Spell's name "); // spell's name
                    int spellStrength = numberBetween(5, 15);  // spell's strength
                    String magicianPhilter = askString("Magician's philter "); // magician's philter
                    // Instanced Magician
                    Magician newMagician = new Magician(magicianName, magicianImage, magicianStamina, magicianStrength, spellName, spellStrength, magicianPhilter);
                    // System.out.println(newMagician.toString()); // test
                    magicianList[magicianIndex] = newMagician;
                    magicianIndex ++;

                    break;

                default:
                    System.out.println("You have to choose between Warrior or Magician... Try again !!");
                    setCharacter();
            }
            break;
        } while(characterChoice == 1 || characterChoice == 2);

    }

    public void menuDisplay() {
        int menuChoice;
        do {
            menuChoice = askInt("1- Display your character \n" +
                    "2- Modify a character \n" +
                    "3- Set a new character \n" +
                    "4- Exit");
            switch(menuChoice) {
                case 1:
                    menuDisplay();
                case 2:
                    System.out.println("this function is coming soon !!");
                    break;
                case 3:
                    setCharacter();
                case 4:
                    System.out.println("OK !! See you later !!");
                    break;
                default:
                    System.out.println("... Try again !!");
                    menuDisplay();
            }
            break;

        } while(menuChoice == 1 || menuChoice == 2 || menuChoice == 3 || menuChoice == 4);
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
        String answer = sc.nextLine();
        return Integer.parseInt(answer);
    }

    public static int numberBetween(int min, int max) {
        int randomNum = (int)(Math.random() * (max - min)) + min ;
        return randomNum;
    }


}
