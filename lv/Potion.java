import java.util.Arrays;

/*
 * Potion class that provides template for any potion
 */
public class Potion extends Item implements Consumable{
    private String[] ptype;
    private double heal;

    public Potion(String name, double price, int level, double heal, String[] ptype) {
        super(name, price, level);
        this.type = 'p';
        this.ptype = ptype;
        this.heal = heal;
    }

    public void consume(){
        System.out.println("You drank the potion yayayayay!");
    }

    public double getHeal(){
        return this.heal;
    }

    public void setHeal(double h){
        this.heal = h;
    }

    public String[] getPtype(){
        return this.ptype;
    }

    public void display(){
        super.display();
        System.out.print("effect: " + Arrays.toString(this.ptype) + " heal: " + this.heal + " | ");
    }

}