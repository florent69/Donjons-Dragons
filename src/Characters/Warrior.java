package Characters;

import Characters.Weapon.Weapon;

public class Warrior extends Character {
    private Weapon weapon;
    private String shield;

    public Warrior () {}

    public Warrior (String name) {
        super(name);
    }

    public Warrior (String name, String image, int stamina, int strength, String weaponName, int weaponStrength, String shield){
        super(name, image, stamina, strength);
        this.weapon = new Weapon(weaponName, weaponStrength);
        this.shield = shield;
    }

    public String toString() {
        return "Your Warrior's description : name : " + this.name + ", " +
                " image : " + this.image + ", " +
                " stamina : " + this.stamina + ", " +
                " strength : " + this.strength + ", " +
                " weapon : " + this.weapon.getName() + " ( strength : " + this.weapon.getStrength() + " ), " +
                " shield : " + this.shield
                ;
    }

    //setters

    public void setName(String name) { this.name = name; }

    public void setImage(String image) {
        this.image = image;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getShield() {
        return shield;
    }
}