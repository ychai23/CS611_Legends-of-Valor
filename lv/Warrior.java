/*
 * Warrior class that allows special effect for warrior
 */
public class Warrior extends Hero{

    public Warrior(String name, double mana, double strength, double agility, double dexterity, double m, double exp){
        super(name, mana, strength, agility, dexterity, m, exp);
        this.inventory = new Inventory();
    }

    public void levelUp(){
        super.levelUp();
        this.strengthV *= 1.05;
        this.agilityV *= 1.05;
    }

    
}