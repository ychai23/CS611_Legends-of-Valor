import java.util.ArrayList;
import java.util.Random;


/*
 * MonsterInfo class that serves as a factory of monsters
 * 
 * forms a monster team based on hero's highest level
 * 
 */
public class MonstersInfo{
    private ArrayList<Monster> monsters;
    private int monsterLvl;
    private MonsterReader mr;
    private int size;

    public MonstersInfo(HerosInfo hf){
        this.monsters = new ArrayList<Monster>();
        this.mr = new MonsterReader();
        this.monsterLvl = hf.highestLvl();
        for (int i=1; i<=hf.getSize(); i++){
            Monster m = mr.getMonster(monsterLvl, i);
            m.setSymbol("M" + i);
            this.monsters.add(m);
        }
    }

    public MonstersInfo(HerosInfo hf, int number){
        this.size = 3;
        this.monsters = new ArrayList<Monster>();
        this.mr = new MonsterReader();
        this.monsterLvl = hf.highestLvl();
        for (int i=0; i<this.size; i++){
            Monster m = mr.getMonster(monsterLvl, i);
            m.setSymbol("M" + i);
            this.monsters.add(m);
            this.getMonster(i).setPos(new int[]{0, 3*(i)+1});
        }
    }

    public ArrayList<Monster> getMonsters(){
        return this.monsters;
    }

    public int getSize(){
        return this.size;
    }

    public boolean allDefeated(){
        return this.monsters.isEmpty();
    }

    public void replaceMonster(int idx, int col, int level){
        Random rand = new Random();
        int i = rand.nextInt(2) + 1;
        Monster m = mr.getMonster(level, i);
        m.setPos(new int[]{0, col});
        
        m.setSymbol("M" + i);
        this.monsters.set(idx, m);
    }

    public void addMonsters(){
        int j = 0;
        for (int i=this.size; i<this.size+3; i++){
            Monster m = mr.getMonster(monsterLvl, j);
            m.setSymbol("M" + i);
            this.monsters.add(m);
            this.getMonster(i).setPos(new int[]{0, 3*(j)+1});
            j+=1;
        }
        this.size += 3;
        System.out.println("monster team increased to " + this.size);
    }

    public void removeMonster(int idx){
        this.monsters.remove(idx);
    }

    public Monster getMonster(int idx){
        return this.monsters.get(idx);
    }

    public boolean checkWin(){
        for(Monster m: this.getMonsters()){
            if(m.checkWin()){return true;}
        }
        return false;
    }

    public void receiveWeaponDamage(int idx, double d){
        this.getMonster(idx).receiveWeaponDamage(d);
    }

    public void display(){
        System.out.println();
        System.out.println("        **** Current MONSTER team ****");
        int i = 0;
        for (Monster monster : this.monsters){
            System.out.print("[" + i + "] ");
            monster.display();
            i++;
        }
        System.out.println();
    }

}