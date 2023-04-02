import java.util.ArrayList;


/*
 * MonsterInfo class that serves as a factory of monsters
 * 
 * forms a monster team based on hero's highest level
 * 
 */
public class MonstersInfo{
    private ArrayList<Monster> monsters;
    private MonsterReader mr;

    public MonstersInfo(HerosInfo hf){
        this.monsters = new ArrayList<Monster>();
        MonsterReader mr = new MonsterReader();
        for (int i=1; i<=hf.getSize(); i++){
            this.monsters.add(mr.getMonster(hf.highestLvl(), i));
        }
    }

    public ArrayList<Monster> getMonsters(){
        return this.monsters;
    }

    public boolean allDefeated(){
        return this.monsters.isEmpty();
    }

    public void removeMonster(int idx){
        this.monsters.remove(idx);
    }

    public Monster getMonster(int idx){
        return this.monsters.get(idx);
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