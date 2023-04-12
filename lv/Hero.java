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
    protected Control control;
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
    protected String symbol;
    protected int[] position;
    protected int[] birth;
    protected int range;
    protected int index;

    public Hero(String name, double mana, double strength, double agility, double dexterity, double m, double exp){
        // initialize items in an inventory
        this.control = new Control();
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
        this.position = new int[]{0,0};
        this.birth = new int[]{0,0};
        this.range = 1;
    }

    public int[] getPos(){
        return this.position;
    }

    public int getLevel(){
        return this.level;
    }

    public int getIndex(){
        return this.index;
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

    public String getSymbol(){
        return this.symbol;
    }

    public void setIndex(int i){
        this.index = i;
    }

    public void setBirth(int[] pos){
        this.birth = pos;
    }

    public void setSymbol(String s){
        this.symbol = s;
    }

    public void setStatus(int i){
        this.status = i;
    }

    public void setDefense(double d){
        this.defense = d;
    }

    public void setPos(int[] pos){
        this.position = pos;
    }

    public char move(ValorWorld w, MonstersInfo mf, HerosInfo hf){
        Grid[][] map = w.getMap();
        int size = w.getSize();
        int x = this.getPos()[0];
        int y = this.getPos()[1];
        boolean s = false;
        char move = ' ';

        while (!s){
            System.out.println(w);
            System.out.println(this.getName() + "(H" + this.index + ")" + " 's turn.");
            move = this.control.getMove();
            switch (move) {
                case 'w':   //move up
                            if (x-1<0) {
                                System.out.println("You can't move that way, out of the map.");
                                break;
                            }
                            if (map[x-1][y].getType() == 'i' || map[x-1][y].getType() == 'I') {
                                System.out.println("You can't move that way, Illegal Grid.");
                                break;
                            }
                            x-=1;
                            s = true;
                            break;
                case 'a':   //move left
                            if (y-1<0) {
                                System.out.println("You can't move that way, out of the map.");
                                break;
                            }
                            if (map[x][y-1].getType() == 'X') {
                                System.out.println("You can't move that way, Illegal Grid.");
                                break;
                            }
                            y-=1;
                            s = true;
                            break;
                case 's':   //move up
                            if (x+1>size) {
                                System.out.println("You can't move that way, out of the map.");
                                break;
                            }
                            if (map[x+1][y].getType() == 'X') {
                                System.out.println("You can't move that way, Illegal Grid.");
                                break;
                            }
                            x+=1;
                            s = true;
                            break;
                case 'd':   //move right
                            if (y+1>size) {
                                System.out.println("You can't move that way, out of the map.");
                                break;
                            }
                            if (map[x][y+1].getType() == 'X') {
                                System.out.println("You can't move that way, Illegal Grid.");
                                break;
                            }
                            y+=1;
                            s = true;
                            break;
                case 'c':   //change inventory
                            this.changeInv();
                            break;
                case 't':   //attack
                            s = this.attack(w, mf);
                            break;
                case 'l':   //cast spell
                            s = this.castSpell(w, mf);
                            break;
                case 'u':   //use potion
                            this.usePotion();
                            s = true;
                            break;
                case 'e':   //teleport
                            s = this.teleport(w, hf);
                            break;
                case 'r':   //recall
                            this.recall();
                            s = true;
                            break;
                case 'p':   //pass
                            s = true;
                            break;
                default:    
                            s = true;
                            break;
            }
        }
        int[] newPost = {x,y};
        this.setPos(newPost);
        return move;
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

    public boolean attack(ValorWorld world, MonstersInfo mf){
        boolean success = false;
        if (!this.displayInRange(world, mf)) {
            System.out.println("No Monsters in Range, cannot attack.");
        }
        else{
            // select monster to attack
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter which monster(ID) you want to attack: ");
            int monsterID = sc.nextInt();
            
            Weapon w = this.inventory.getMainhand();
            Monster m = mf.getMonster(monsterID);
            double damage = (w.getDamage() + this.strengthV) * 0.05;

            // attack
            System.out.println(this.name + " have attacked monster" + m.getName() + " with " + w.getName());

            double HP = m.receiveWeaponDamage(damage);
            if (HP<=0){
                System.out.println(m.getName() + " has fainted.");
                mf.replaceMonster(monsterID);
            }
            success = true;
        }
        return success;
    }

    public boolean castSpell(ValorWorld world, MonstersInfo mf){
        boolean success = false;
        if (!this.displayInRange(world, mf)) {
            System.out.println("No Monsters in Range, cannot cast.");
        }
        else{
            // select monster to cast spell
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter which monster(ID) you want to attack: ");
            int monsterID = sc.nextInt();
            
            Spell s = this.chooseSpell();
            Monster m = mf.getMonster(monsterID);
            double damage = (s.getDamage() + this.dexterityV / 10000 * s.getDamage());

            // cast a spell
            System.out.println(this.name + " have casted sepll " + s.getName() + " on monster " + m.getName());

            double HP = m.receiveSpellDamage(s, damage);
            if (HP<=0){
                System.out.println(m.getName() + " has fainted.");
                mf.replaceMonster(monsterID);
            }
            success = true;
        }
        return success;
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

    public boolean displayInRange(ValorWorld w, MonstersInfo mf){
        boolean canAttack = false;
        // (display the monsters that you can attack) choose target to attack to
        int i = 0;
        for (Monster m : mf.getMonsters()){
            if (this.inRange(w, m)){
                System.out.print("[" + i + "] " + m.getName() + " is in range");
                m.display();
                canAttack = true;
            }
        }
        return canAttack;
    }

    public boolean inRange(ValorWorld w, Monster m){
        // determine if a monster is in range (neighbor grids of the hero)
        int[] monsterPos = m.getPos();
        if ((this.getPos()[0] - 1 == monsterPos[0] && this.getPos()[0] - 1 == monsterPos[1]) ||
            (this.getPos()[0] + 1 == monsterPos[0] && this.getPos()[0] - 1 == monsterPos[1]) ||
            (this.getPos()[0] - 1 == monsterPos[0] && this.getPos()[0] + 1 == monsterPos[1]) ||
            (this.getPos()[0] + 1 == monsterPos[0] && this.getPos()[0] + 1 == monsterPos[1])){
                return true;
            }
        return false;
    }

    public boolean teleport(ValorWorld w, HerosInfo hf){
        // teleport a hero to move to a space adjacent to a target hero in a different lane.
        boolean valid = false;
        boolean success = false;
        Grid[][] map = w.getMap();
        int heroID = -1;
        Scanner sc = new Scanner(System.in);
        int[] heroPos = new int[]{0,0};
        
        while (!valid){
            System.out.print("Enter the hero ID you want to teleport next to: ");
            heroID = sc.nextInt();
            // check the hero is not in the same lane
            if (hf.getHero(heroID).getPos()[1] != this.position[1]){
                heroPos[0] = hf.getHero(heroID).getPos()[0];
                heroPos[1] = hf.getHero(heroID).getPos()[1];
                valid = true;
            }
        }

        System.out.print("Enter the location in respect to the target hero, side or below? enter character (s/b): ");
        char pos = sc.next().charAt(0);
        if (pos == 's'){
            if (map[heroPos[0]][heroPos[1]+1].getType() != 'X' && !w.heroOccupied(heroPos[0], heroPos[1]+1)) {
                System.out.println("Teleported to the Right Successfully.");
                this.setPos(new int[]{heroPos[0], heroPos[1]+1});
                success = true;
            } else if (map[heroPos[0]][heroPos[1]-1].getType() != 'I' && !w.heroOccupied(heroPos[0], heroPos[1]-1)){
                System.out.println("Teleported to the Left Successfully.");
                this.setPos(new int[]{heroPos[0], heroPos[1]-1});
                success = true;
            } else{
                System.out.println("Cannot teleport to that position.");
            }
        } else{
            if (heroPos[0] + 1 >= 0 && map[heroPos[0]+1][heroPos[1]].getType() != 'I' && w.heroOccupied(heroPos[0]+1, heroPos[1])) {
                System.out.println("Teleported Below Successfully.");
                this.setPos(new int[]{heroPos[0]+1, heroPos[1]});
                success = true;
            } else{
                System.out.println("Cannot teleport to that position.");
            }
        }
        if (!success) System.out.println("Teleportation failed.");
        return success;
    }

    public void recall(){
        // return to their specific Nexus (where they originally spawned)
        this.setPos(this.birth);
    }

    public void respawn(){
        // return to their specific Nexus (where they originally spawned) - change location
        // reset status base on their current lvl
        this.recall();
        this.HP = this.maxHP;
        this.MP = this.maxMP;
    }


}
