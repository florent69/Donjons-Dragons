package Characters.Weapon;

public class Weapon {
    String name;
    int strength;

    public Weapon(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setstrength(int strength) {
        this.strength = strength;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

}

