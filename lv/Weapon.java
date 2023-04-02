/*
 * Weapon class that provides template for any weapon
 */
public class Weapon extends Item{
    protected double damage;

    public Weapon(String name, double price, int level, double d) {
        super(name, price, level);
        this.damage = d;
        this.type = 'w';
    }

    public void display(){
        super.display();
        System.out.print("damage: " + this.damage + " | ");
    }

    public double getDamage(){
        return this.damage;
    }

    public void setDamage(double d){
        this.damage = d;
    }
}