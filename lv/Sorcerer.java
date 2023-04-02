/*
 * Sorcerer class that provides special effect for Sorcerer
 * 
 */
public class Sorcerer extends Hero{

    public Sorcerer(String name, double mana, double strength, double agility, double dexterity, double m, double exp){
        super(name, mana, strength, agility, dexterity, m, exp);
        this.inventory = new Inventory('s');
    }

    public void levelUp(){
        super.levelUp();
        this.agilityV *= 1.05;
        this.dexterityV *= 1.05;
    }
}