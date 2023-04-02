/*
 * Spell class that provides template for any type of spell
 */
public class Spell extends Item{
    protected double damage;
    protected double manaCost;
    protected char spellType;

    public Spell(String n, double price, double l, double d, double mc, char t, char st){
        super(n, price, l);
        this.damage = d;
        this.manaCost = mc;
        this.type = 's';
        this.spellType = st;
    }

    public void setDamage(double d){
        this.damage = d;
    }

    public double getDamage(){
        return this.damage;
    }

    public void setManaCost(double mc){
        this.manaCost = mc;
    }

    public double getManaCost(){
        return this.manaCost;
    }

    public void display(){
        super.display();
        System.out.print("damage: " + this.damage + " manaCost: " + this.manaCost + " spellType: " + this.spellType + " | ");
    }

}