package Characters;

public class Character {
    protected String name;
    protected String image;
    protected int stamina;
    protected int strength;

    public Character () {}

    public Character (String name, String image, int stamina, int strength ) {
        this.name = name;
        this.image = image;
        this.stamina = stamina;
        this.strength = strength;
    }
}
