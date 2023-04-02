import java.util.ArrayList;
import java.util.Scanner;

/*
 * Inventory class that contains inventory of different types of items
 * 
 * List of weapons, spells, potions, armors
 * Hero's main hand weapon and armor
 * 
 */
public class Inventory{
    private Weapon mainHand;
    private Armor mainArmor;
    private WeaponReader wr = new WeaponReader();
    private ArmorReader ar = new ArmorReader();
    private SpellReader sr = new SpellReader();
    private ArrayList<Armor> armors;
    private ArrayList<Weapon> weapons;
    private ArrayList<Spell> spells;
    private ArrayList<Potion> potions;

    public Inventory(){
        // initialize items in an inventory
        Weapon defaultW = this.wr.readWeapons(1).get(0);
        this.mainHand = defaultW;
        this.weapons = new ArrayList<Weapon>();
        this.weapons.add(defaultW);
        this.armors = new ArrayList<Armor>();
        this.spells = new ArrayList<Spell>();
        this.potions = new ArrayList<Potion>();
    }

    public Inventory(char type){
        this();
        if (type == 's'){
            Spell defaultS = this.sr.readSpells(1).get(0);
            this.spells.add(defaultS);
        }
        else if (type == 'p'){
            Armor defaultA = this.ar.readArmors(1).get(0);
            this.armors.add(defaultA);
            this.mainArmor = defaultA;
        }
    }

    public void selectMainHand(){
        Scanner sc = new Scanner(System.in);
        this.displayWeapons();
        System.out.print("Please select your mainhand weapon(ID): ");
        this.setMainhand(sc.nextInt());
    }

    public void selectMainArmor(){
        Scanner sc = new Scanner(System.in);
        this.displayArmor();
        System.out.print("Please select your main armor(ID): ");
        this.setMainArmor(sc.nextInt());
    }

    public void setMainhand(int idx){
        this.mainHand = this.weapons.get(idx);
        System.out.println("Main weapon has been set to " + this.mainHand.getName());
    }

    public void setMainArmor(int idx){
        this.mainArmor = this.armors.get(idx);
        System.out.println("Your armor has been set to " + this.mainArmor.getName());
    }

    public Weapon getMainhand(){
        return this.mainHand;
    }

    public Armor getMainArmor(){
        return this.mainArmor;
    }

    public Weapon getWeapon(int idx){
        return this.weapons.get(idx);
    }

    public Armor getArmor(int idx){
        return this.armors.get(idx);
    }

    public boolean armorEmpty(){
        return this.armors.isEmpty();
    }

    public boolean spellEmpty(){
        return this.spells.isEmpty();
    }

    public boolean potionEmpty(){
        return this.potions.isEmpty();
    }

    public boolean weaponEmpty(){
        return this.weapons.isEmpty();
    }

    public Spell getSpell(int idx){
        return this.spells.get(idx);
    }

    public Potion getPotion(int idx){
        return this.potions.get(idx);
    }

    public boolean isEmpty(){
        if (this.armors.isEmpty() && this.weapons.isEmpty() && this.spells.isEmpty() && this.potions.isEmpty()){
            return true;
        }
        return false;
    }

    public void addItem(Item item){
        if (item.getType() == 'a'){
            this.armors.add((Armor) item);
            System.out.println("Added Item " + item.getName() + " in hero's armor inventory");
        }
        if (item.getType() == 'p'){
            this.potions.add((Potion) item);
            System.out.println("Added Item " + item.getName() + " in hero's potion inventory");
        }
        if (item.getType() == 's'){
            this.spells.add((Spell) item);
            System.out.println("Added Item " + item.getName() + " in hero's spell inventory");
        }
        if (item.getType() == 'w'){
            this.weapons.add((Weapon) item);
            System.out.println("Added Item " + item.getName() + " in hero's weapon inventory");
        }
    }

    public Item sellItem(){
        boolean selected = false;
        Scanner sc = new Scanner(System.in);
        Item item = null;
        while (!selected){
            System.out.println("0) No Sell");
            System.out.println("1) Weapon");
            System.out.println("2) Armor");
            System.out.println("3) Potion");
            System.out.println("4) Spell");
            System.out.print("Which type of items you would like to sell? ");
            int c = 0;
            c = sc.nextInt();

            if (c==1){
                displayWeapons();
                if (this.weapons.isEmpty()){
                    System.out.println("The hero does not have any weapons");
                    continue;
                }
                System.out.print("Enter the index of the item you want to sell: ");
                int idx = sc.nextInt();
                item = this.weapons.remove(idx);
                break;
            }
            else if (c==2){
                displayArmor();
                if (this.armors.isEmpty()){
                    System.out.println("The hero does not have any armors");
                    continue;
                }
                System.out.print("Enter the index of the item you want to sell: ");
                int idx = sc.nextInt();
                item = this.armors.remove(idx);
                break;
            }
            else if (c==3){
                displayPotions();
                if (this.potions.isEmpty()){
                    System.out.println("The hero does not have any potions");
                    continue;
                }
                System.out.print("Enter the index of the item you want to sell: ");
                int idx = sc.nextInt();
                item = this.potions.remove(idx);
                break;
            }
            else if (c==4){
                displaySpells();
                if (this.spells.isEmpty()){
                    System.out.println("The hero does not have any spells");
                    continue;
                }
                System.out.print("Enter the index of the item you want to sell: ");
                int idx = sc.nextInt();
                item = this.spells.remove(idx);
                break;
            }
            else{
                break;
            }
        }
        return item;
    }

    public void removePotion(int potionID){
        this.potions.remove(potionID);
    }

    public void displayArmor(){
        System.out.print("* Armors: [");
        int i = 0;
        for (Armor a: this.armors){
            System.out.print(i + ")");
            a.display();
            i++;
        }
        System.out.println("]");
    }

    public void displayWeapons(){
        int i = 0;
        System.out.print("* Weapons: [");
        for (Weapon w: this.weapons){
            System.out.print(i + ")");
            w.display();
            i++;
        }
        System.out.println("]");
    }

    public void displaySpells(){
        int i = 0;
        System.out.print("* Spells: [");
        for (Spell s : this.spells){
            System.out.print(i + ")");
            s.display();
            i++;
        }
        System.out.println("]");
    }

    public void displayPotions(){
        int i = 0;
        System.out.print("* Potions: [");
        for (Potion p : this.potions){
            System.out.print(i + ")");
            p.display();
            i++;
        }
        System.out.println("]");
    }

    public void display(){
        System.out.println("***************** Inventory *******************");
        displayWeapons();
        displayArmor();
        displayPotions();
        displaySpells();
        System.out.println("***********************************************");
    }
}