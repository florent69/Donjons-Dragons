package Characters;

import Characters.Spell.Spell;

public class Magician extends Character {
    private Spell spell;
    private String philter;

    public Magician () {}

    public Magician (String name) {
        super(name);
    }

    public Magician (String name, String image, int stamina, int strength, String spellName, int spellStrength, String philter) {
        super(name, image, stamina, strength);
        this.spell = new Spell(spellName, spellStrength);
        this.philter = philter;
    }

    public String toString() {
        return super.toString() +
                " spell : " + this.spell.getName() + " ( strength : " + this.spell.getStrength() + " ), " +
                " philter : " + this.philter
                ;
    }

    public void setName(String name) { this.name = name; }

    public void setImage(String image) { this.image = image; }

    public void setStamina(int stamina) { this.stamina = stamina; }

    public void setStrength(int strength) { this.strength = strength; }

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
