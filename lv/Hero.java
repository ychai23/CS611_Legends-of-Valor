import java.util.Random;
import java.util.Scanner;

/*
 * Hero class that contains all the actions a hero can take during the game
 * 
 * Attack/Spell/Use Potion etc..
 * Sell/Buy Item
 * Change Main hand weapon/armor...
 * 
 */
public class Hero{
    protected Inventory inventory;
    protected String name;
    protected int level;
    protected double HP;
    protected double MP;
    protected double defense;
    protected double strengthV;
    protected double dexterityV;
    protected double agilityV;
    protected double gold;
    protected double dodge;
    protected double exp;
    protected double thres;
    protected int status;
    protected double maxHP;
    protected double maxMP;
    protected double maxS;
    protected double maxD;
    protected double maxA;
    protected int[][] position;
    protected int[][] birth;

    //range is what?
    protected int range;

    public Hero(String name, double mana, double strength, double agility, double dexterity, double m, double exp){
        // initialize items in an inventory
        this.name = name;
        this.level = 1;
        this.maxHP = 100*this.level;
        this.maxMP = mana;
        this.strengthV = strength;
        this.dexterityV = dexterity;
        this.agilityV = agility;
        this.gold = m;
        this.defense = 0;
        this.dodge = this.agilityV*0.001;
        this.exp = exp;
        this.thres = this.level*10;
        this.status = 1;
        this.HP = this.maxHP;
        this.MP = this.maxMP;
        this.maxS = strength;
        this.maxD = dexterity;
        this.maxA = agility;
    }

    public int[][] getPos(){
        return this.position;
    }

    public int getLevel(){
        return this.level;
    }

    public String getName(){
        return this.name;
    }
    
    public double getHP(){
        return this.HP;
    }

    public Inventory getInv(){
        return this.inventory;
    }

    public double getGold(){
        return this.gold;
    }

    public void setStatus(int i){
        this.status = i;
    }

    public void setDefense(double d){
        this.defense = d;
    }

    public void changeInv(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Would you like to change " + this.name + "'s main weapon? y/n: ");
        char c = sc.nextLine().charAt(0);

        if (c == 'y'){
            this.inventory.selectMainHand();
        }

        System.out.print("Would you like to change " + this.name + "'s main armor? y/n: ");
        c = sc.nextLine().charAt(0);

        if (c == 'y'){
            this.inventory.selectMainArmor();
        }

    }
    
    public void levelUp(){
        this.level += 1;
        this.maxMP *= 1.1;
        this.maxHP = this.level*100;
        this.maxS *= 1.05;
        this.maxD *= 1.05;
        this.maxA *= 1.05;
        this.HP = this.maxHP;
        this.MP = this.maxMP;
        this.strengthV = this.maxS;
        this.agilityV = this.maxA;
        this.dexterityV = this.maxD;
        this.exp -= this.thres;
        this.thres = this.level*10;
    }

    public void sellItem(){
        char c;
        System.out.println("Hero's inventory currently is: ");
        this.inventory.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to sell any item with " + this.getName() + " y/n: ");
        c = sc.next().charAt(0);

        while (c == 'y'){
            System.out.println();
            Item item = this.inventory.sellItem();
            if (item != null){
                System.out.println("Item " + item.getName() + " sold");
            }


            System.out.println("Hero's inventory currently is: ");
            this.inventory.display();
            System.out.print("Would you like to sell any item with " + this.getName() + " y/n: ");
            c = sc.next().charAt(0);
        }
    }

    public void buyItem(Market m){
        char c;
        Scanner sc = new Scanner(System.in);
        this.displayHero();
        System.out.print("Would you like to buy any item with this hero: " + this.getName() + " y/n: ");
        c = sc.next().charAt(0);
        System.out.println();

        while (c == 'y'){
            System.out.println("0) No buy");
            System.out.println("1) Weapon");
            System.out.println("2) Armor");
            System.out.println("3) Potion");
            System.out.println("4) Spell");
            System.out.print("Enter the type of item you want to purchase: ");
            int t = sc.nextInt();
            if (t==0){
                break;
            }

            System.out.print("Enter the index of the item you want to purchase: ");
            int idx = sc.nextInt()-1;
            System.out.println();
            Item item = null;

            if (t==1){
                item = m.getWList().get(idx);
            }
            else if (t==2){
                item = m.getAList().get(idx);
            }
            else if (t==3){
                item = m.getPList().get(idx);
            }
            else if (t==4){
                item = m.getSList().get(idx);
            }

            if (!item.equals(null)){
                this.inventory.addItem(item);
                this.gold -= item.getPrice();
            }

            System.out.print("Would you like to buy any item with this hero: " + this.getName() + " y/n: ");
            c = sc.next().charAt(0);
            System.out.println();
        }
    }

    public void regain(){
        // regain health and mana
        this.HP = Math.min(this.HP * 1.1, this.maxHP);
        this.MP = Math.min(this.MP * 1.1, this.maxMP);
    }

    public void gain(int monsterL, int monsterN){
        if (this.status == 1) this.gold += monsterL;
        this.exp += (monsterN*2);

        // can I update thres?
        while (this.exp >= this.thres) {
            this.levelUp();
        }

    }

    public void usePotion(){
        if (this.inventory.potionEmpty()){
            System.out.println("Hero's potion inventory is empty.");
            return;
        }
        this.inventory.displayPotions();
        System.out.print("Enter the potion(ID) you want to use: ");
        Scanner sc = new Scanner(System.in);
        int potionID = sc.nextInt();
        Potion p = this.inventory.getPotion(potionID);
        for (String pt : p.getPtype()){
            if (pt.equals("Health")) {
                System.out.println("Your health gained " + p.getHeal()); 
                this.HP += p.getHeal();
                this.HP = Math.min(this.maxHP, this.HP);
            }
            if (pt.equals("Mana")) {
                System.out.println("Your mana gained " + p.getHeal()); 
                this.MP += p.getHeal();
                this.MP = Math.min(this.maxMP, this.MP);
            }
            if (pt.equals("Strength")) {
                System.out.println("Your strength gained " + p.getHeal()); 
                this.strengthV += p.getHeal();
            }
            if (pt.equals("Dexterity")) {
                System.out.println("Your dexterity gained " + p.getHeal()); 
                this.dexterityV += p.getHeal();
            }
            if (pt.equals("Agility")) {
                System.out.println("Your agility gained " + p.getHeal()); 
                this.agilityV += p.getHeal();
            }
            if (pt.equals("Defense")) {
                System.out.println("Your defense gained " + p.getHeal()); 
                this.defense += p.getHeal();
            }
        }
        this.inventory.removePotion(potionID);
    }

    public void attack(int monsterID, MonstersInfo ms){
        Weapon w = this.inventory.getMainhand();
        Monster m = ms.getMonster(monsterID);
        double damage = (w.getDamage() + this.strengthV) * 0.05;

        System.out.println(this.name + " have attacked monster" + m.getName() + " with " + w.getName());

        double HP = m.receiveWeaponDamage(damage);
        if (HP<=0){
            System.out.println(m.getName() + " has fainted.");
            ms.removeMonster(monsterID);
        }

    }

    public void castSpell(int monsterID, MonstersInfo ms){
        Spell s = this.chooseSpell();
        Monster m = ms.getMonster(monsterID);
        double damage = (s.getDamage() + this.dexterityV / 10000 * s.getDamage());

        System.out.println(this.name + " have casted sepll " + s.getName() + " on monster " + m.getName());

        double HP = m.receiveSpellDamage(s, damage);
        if (HP<=0){
            System.out.println(m.getName() + " has fainted.");
            ms.removeMonster(monsterID);
        }
    }

    public Spell chooseSpell(){
        this.inventory.displaySpells();
        System.out.print("Enter the spell(ID) you want to use: ");
        Scanner sc = new Scanner(System.in);
        int spellID = sc.nextInt();

        return this.inventory.getSpell(spellID);
    }

    public double receiveMonsterDamage(double damage){
        Random rand = new Random();
        double n = rand.nextInt(100);
        
        if (n < this.dodge){
            System.out.println(this.name + " have dodged monster's attack.");
        }
        else{
            double trueDam = damage - this.defense;
            this.HP -= trueDam;
            System.out.println(this.name + " received " + trueDam + " damage from the monster.");
        }
        return this.HP;

    }

    public void displayHero(){
        System.out.println("Name: " + this.getName());
        System.out.println("Level: " + this.level + " | " + "Health: " + this.HP + " | " + "Mana: " + this.MP + " | " + "Strength: " + this.strengthV + " | " + "Defense: " + this.defense + " | " + "Agility: " + this.agilityV + " | " + "Dexterity: " + this.dexterityV + " | " + "Money: " + this.gold + " | " + "Exp: " + this.exp + " | " + "Status: " + this.status + " | ");
    }

    public void displayInventory(){
        this.inventory.display();
    }
    
    public boolean inRange(World w, Monster m){
        // determine if a monster is in range (neighbor grids of the hero)
        return true;
    }

    public void move(World w){
        // move the hero on the map
    }

    public void teleport(World w){
        // teleport a hero to move to a space adjacent to a target hero in a different lane.
    }

    public void recall(){
        // return to their specific Nexus (where they originally spawned)
        this.position = this.birth;
    }

    public void respawn(){
        // return to their specific Nexus (where they originally spawned) - change location
        // reset status base on their current lvl
        this.recall();
        this.HP = this.maxHP;
        this.MP = this.maxMP;
    }


}
