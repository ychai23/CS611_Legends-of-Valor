import java.util.ArrayList;
import java.util.Scanner;

/*
 * Market class that display items and operates player's actions in a market
 * 
 */
public class Market{
    private ArrayList<Item> saleList;
    private WeaponReader wr = new WeaponReader();
    private SpellReader sr = new SpellReader();
    private PotionReader pr = new PotionReader();
    private ArmorReader ar = new ArmorReader();
    private ArrayList<Armor> armors;
    private ArrayList<Weapon> weapons;
    private ArrayList<Spell> spells;
    private ArrayList<Potion> potions;

    public Market(){
        this.saleList = new ArrayList<Item>();
        this.armors = this.ar.readArmors(0);
        this.weapons = this.wr.readWeapons(0);
        this.spells = this.sr.readSpells(1);
        this.spells.addAll(this.sr.readSpells(2));
        this.spells.addAll(this.sr.readSpells(3));
        this.potions = this.pr.readPotions(0);
    }

    public ArrayList<Weapon> getWList(){
        return this.weapons;
    }

    public ArrayList<Armor> getAList(){
        return this.armors;
    }

    public ArrayList<Spell> getSList(){
        return this.spells;
    }
    public ArrayList<Potion> getPList(){
        return this.potions;
    }

    public void displayMarket(){
        System.out.println();
        System.out.println("******** Welcome to the market ********");
        this.display();
    }

    public void runMarket(Player p){
        System.out.print("Would you like to enter the market? y/n: ");
        Scanner sc = new Scanner(System.in);
        char c = ' ';
        c = sc.next().charAt(0);

        if (c == 'y'){
            this.displayMarket();
            for (Hero h : p.getHeros()){
                if (!h.getInv().isEmpty()){
                    h.sellItem();
                }
                h.buyItem(this);
            }
        }
        System.out.println();
        System.out.println("Leaving the market...");
    }

    public void displayArmor(){
        System.out.print("Armors: [");
        int i = 0;
        for (Armor a: this.armors){
            i++;
            System.out.print(i + ")");
            a.display();
        }
        System.out.println("]");
        System.out.println();
    }

    public void displayWeapons(){
        int i = 0;
        System.out.print("Weapons: [");
        for (Weapon w: this.weapons){
            i++;
            System.out.print(i + ")");
            w.display();
        }
        System.out.println("]");
        System.out.println();
    }

    public void displaySpells(){
        int i = 0;
        System.out.print("Spells: [");
        for (Spell s : this.spells){
            i++;
            System.out.print(i + ")");
            s.display();
        }
        System.out.println("]");
        System.out.println();
    }

    public void displayPotions(){
        int i = 0;
        System.out.print("Potions: [");
        for (Potion p : this.potions){
            i++;
            System.out.print(i + ")");
            p.display();
        }
        System.out.println("]");
        System.out.println();
    }

    public void display(){
        displayWeapons();
        displayArmor();
        displayPotions();
        displaySpells();
    }

}