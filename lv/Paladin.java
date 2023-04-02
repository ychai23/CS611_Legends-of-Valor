/*
 * Paladin class that provides special effect for Paladin
 * 
 */
public class Paladin extends Hero{

    public Paladin(String name, double mana, double strength, double agility, double dexterity, double m, double exp){
        super(name, mana, strength, agility, dexterity, m, exp);
        this.inventory = new Inventory('p');
    }

    public void levelUp(){
        super.levelUp();
        this.strengthV *= 1.05;
        this.dexterityV *= 1.05;
    }
}