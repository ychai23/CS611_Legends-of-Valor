import java.util.Random;

import javax.lang.model.util.ElementScanner14;
import javax.management.monitor.MonitorSettingException;

/*
 * Monster class that contains all the actions a monster can take during the game
 * 
 * Attack a hero
 * 
 */
public class Monster{
    protected String name;
    protected int level;
    protected double HP;
    protected double baseDam;
    protected double curBaseDam;

    protected double defenseV;
    protected double curDefenseV;


    protected double dodgeV;
    protected double curDodgeV;

    protected double dodgeC;
    protected String symbol;
    protected int status;
    protected int[] position;


    public Monster(String name){
        // initialize items in an inventory
        this.name = name;
        this.level = 0;
        this.HP = 100*this.level;
        this.baseDam = 0;
        this.defenseV = 0;
        this.dodgeV = 0;
        this.status = 1;
    }

    public Monster(String name, int level, double HP, double baseDam, double defenseV, double dodgeV){
        // initialize items in an inventory
        this.name = name;
        this.level = level;
        this.HP = 100*this.level;
        this.baseDam = baseDam;
        this.defenseV = defenseV;
        this.dodgeV = dodgeV;
        this.dodgeC = dodgeV*0.01;
        this.status = 1;
    }

    public String getName(){
        return this.name;
    }

    public int getLevel(){
        return this.level;
    }

    public int[] getPos(){
        return this.position;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public void setSymbol(String s){
        this.symbol = s;
    }

    public void setPos(int[] pos){
        this.position = pos;
    }

    public void setCurBaseDamage(){
        this.curBaseDam = baseDam*1.1;
    }
    public void setCurDefense(){
        this.curDefenseV = defenseV*1.1;
    }
    public void setCurDodgeV(){
        this.curDodgeV = dodgeV*1.1;
    }

    public void clear(){
        this.curBaseDam = this.baseDam;
        this.curDefenseV = this.defenseV;
        this.curDodgeV = this.dodgeV;
    }

    public void move(ValorWorld w, MonstersInfo mf, HerosInfo hf){
        Grid[][] map = w.getMap();
        int size = w.getSize();
        if(this.getPos() == null){return;}
        int x = this.getPos()[0];
        int y = this.getPos()[1];
        boolean s = false;
        
        for(Hero h : hf.getHeros()){
            if(this.inRange(w, h)){
                double HP = h.receiveMonsterDamage(this.baseDam*0.01);
                System.out.println("Monster "+ this.getSymbol()+ " Attacked "+h.getSymbol()+" Deal Damage "+ HP);
                if (HP<=0){
                    System.out.println(h.getName() + " has been defeated, fainted");
                    h.respawn();
                }
                return;
            }
        }


        this.setPos(new int[] {x+1, y});
    }

    public boolean checkWin(){
        if(getPos() == null){return false;}
        int x = this.getPos()[0];
        int y = this.getPos()[1];
        if(x== 7){return true;}
        return false;
    }

    public boolean inRange(ValorWorld w, Hero h){
        // determine if a monster is in range (neighbor grids of the hero)
        int[] monsterPos = h.getPos();
        System.out.println("Hero POS:"+ monsterPos[0]+" " +monsterPos[1]);
        System.out.println("Monster POS: "+getPos()[0] +" "+ getPos()[1]);
        if ((this.getPos()[0] - 1 == monsterPos[0] && this.getPos()[0]  == monsterPos[1]) ||
            (this.getPos()[0] + 1 == monsterPos[0] && this.getPos()[0]  == monsterPos[1]) ||
            (this.getPos()[0]  == monsterPos[0] && this.getPos()[0] + 1 == monsterPos[1]) ||
            (this.getPos()[0]  == monsterPos[0] && this.getPos()[0] + 1 == monsterPos[1]) ||
            (this.getPos()[0] - 1 == monsterPos[0] && this.getPos()[0] - 1 == monsterPos[1]) ||
            (this.getPos()[0] + 1 == monsterPos[0] && this.getPos()[0] - 1 == monsterPos[1]) ||
            (this.getPos()[0] - 1 == monsterPos[0] && this.getPos()[0] + 1 == monsterPos[1]) ||
            (this.getPos()[0] + 1 == monsterPos[0] && this.getPos()[0] + 1 == monsterPos[1]) ||
            (this.getPos()[0]  == monsterPos[0] && this.getPos()[0]  == monsterPos[1])){
                return true;
            }
        return false;
    }


    public double receiveWeaponDamage(double damage){
        // can dodge
        Random rand = new Random();
        int d = rand.nextInt(100);

        if (d > this.dodgeV){
            this.HP -= (damage - this.defenseV*0.05);
            System.out.println("Weapon dealt damage of " + (damage - this.defenseV*0.05) + " to " + this.getName());
        } else{
            System.out.println(this.getName() + " dodged your weapon attack.");
        }
        return this.HP;
    }

    public double receiveSpellDamage(Spell s, double damage){
        // can dodge
        Random rand = new Random();
        int d = rand.nextInt(100);
        double reducedD = (damage - this.defenseV)*0.05;
        if (d > this.dodgeV){
            this.HP -= reducedD;
            System.out.println("Spell dealt damage of " + reducedD + " to " + this.getName());
            this.skillLoss(s.getType());
        } else{
            System.out.println(this.getName() + " dodged your spell attack.");
        }
        return this.HP;

    }

    public void attack(HerosInfo hf){
        int size = hf.getHeros().size();
        Random rand = new Random();
        int idx = rand.nextInt(size);
        Hero h = hf.getHeros().get(idx);

        double HP = h.receiveMonsterDamage(this.baseDam*0.01);
        if (HP<=0){
            System.out.println(h.getName() + " has been defeated, fainted");
            h.respawn();
        }
    }

    public void skillLoss(char skill){
        if (skill == 'i') {
            this.baseDam *= 0.9;
            System.out.println(this.getName() + "'s base damage has been reduced by 10%");
        }
        if (skill == 'f') {
            this.defenseV *= 0.9;
            System.out.println(this.getName() + "'s defense has been reduced by 10%");
        }
        if (skill == 'l') {
            this.dodgeV *= 0.9;
            System.out.println(this.getName() + "'s dodge value has been reduced by 10%");
        }
    }

    public void display(){
        System.out.println("Name: " + this.getName());
        System.out.println("Level: " + this.level + " | " + "Health: " + this.HP + " | " + "Strength: " + this.baseDam + " | " + "Defense: " + this.defenseV + " | " + "Agility: " + this.dodgeV + " | " + "Status: " + this.status + " | ");
    }

}