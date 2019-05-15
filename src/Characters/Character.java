package Characters;

public class Character {
    protected String name;
    protected String image;
    protected int stamina;
    protected int strength;

    public Character () {}

    public Character (String name) {
        this.name = name;
    }

    public Character (String name, String image, int stamina, int strength ) {
        this.name = name;
        this.image = image;
        this.stamina = stamina;
        this.strength = strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }
}
