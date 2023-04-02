/*
 * Armor class that provides template for any armor
 * 
 */
public class Armor extends Item{
    private double defense;

    public Armor(String name, double price, int level, double d) {
        super(name, price, level);
        this.type = 'a';
        this.defense = d;
    }

    public void setDefense(double d){
        this.defense = d;
    }

    public double getDefense(){
        return this.defense;
    }

    public void display(){
        super.display();
        System.out.print("defense: " + this.defense + " | ");
    }


}