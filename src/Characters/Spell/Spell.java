package Characters.Spell;

public class Spell {
    String name;
    int strength;

    public Spell (String name, int strength) {
        this.name = name;
        this.strength = strength;

    }    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
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
