import java.util.ArrayList;

/*
 * HeroInfo class that serves as a factory of heros
 * 
 * Allows players to form hero team and display hero options to choose for players at the begining of the game
 * 
 */
public class HerosInfo{
    private ArrayList<Hero> heros;
    private HeroReader hr;

    public HerosInfo(int ht){
        this.hr = new HeroReader();
        this.heros = this.hr.readHeros(ht);
    }

    public HerosInfo(ArrayList<Hero> heros){
        this.heros = heros;
    }

    public boolean allDefeated(){
        return this.heros.isEmpty();
    }

    public int highestLvl(){
        int hl = 0;
        for (int i=0; i<this.getSize(); i++){
            hl = Math.max(hl, this.getHero(i).getLevel());
        }
        return hl;
    }

    public int getSize(){
        return this.heros.size();
    }

    public Hero getHero(int idx){
        return this.heros.get(idx);
    }

    public void removeHero(int idx){
        this.heros.remove(idx);
    }

    public ArrayList<Hero> getHeros(){
        return this.heros;
    }

    public void changeInv(){
        for (Hero h : this.heros){
            h.changeInv();
        }
    }

    public void displayHeros(){
        int i = 0;
        for (Hero hero : this.heros){
            System.out.print("[" + i + "] ");
            hero.displayHero();
            i++;
        }
        System.out.println();
    }

    public void displayAll(){
        int i = 0;
        for (Hero hero : this.heros){
            System.out.print("[" + i + "] ");
            hero.displayHero();
            hero.displayInventory();
            i++;
        }
    }
}