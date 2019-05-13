package Characters;

import Characters.Spell.Spell;

public class Magician {
    private String name;
    private String image;
    private int stamina;
    private int strength;
    private Spell spell;
    private String philter;

    public Magician () {}

    public Magician (String name, String image, int stamina, int strength, String spellName, int spellStrength, String philter) {
        this.name = name;
        this.image = image;
        this.stamina = stamina;
        this.strength = strength;
        this.spell = new Spell(spellName, spellStrength);
        this.philter = philter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setPhilter(String philter) {
        this.philter = philter;
    }

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

    public Spell getSpell() {
        return spell;
    }

    public String getPhilter() {
        return philter;
    }
}
