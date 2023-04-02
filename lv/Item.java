/*
 * Item class that provides the basic information any item would have
 * 
 */
public class Item {
    protected double price;
    protected String name;
    protected double level;
    protected char type;

    public Item(String n, double price, double l){
        this.name = n;
        this.price = price;
        this.level = l;
        this.type = 'n';
    }

    public char getType(){
        return this.type;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public double getLevel(){
        return this.level;
    }

    public void setLevel(int lvl){
        this.level = lvl;
    }

    public void display(){
        System.out.print(this.name + "- lvl: " + this.level + ", price: " + this.price + " ");
    }
    
}