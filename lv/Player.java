import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * Player class that operates all actions a player can take during a game
 * 
 */
public class Player{
    private HerosInfo herosFactory;
    private int status = 0;
    private boolean win = false;

    public Player(int number){
        // get user inputs to create the heros
        Scanner sc = new Scanner(System.in);
        int teamS = number;
        String[] s = new String[]{"Choose your Hero For Top Lane:","Choose your hero For Mid Lane:","Choose your hero for Bot Lane: "};

        for (int i=1; i<teamS+1; i++){
            // select which type of hero
            System.out.println(s[i-1]);
            this.displayTypes();
            System.out.print("Selection? ");
            int type = sc.nextInt();
            System.out.println();

            // create hero factory
            this.herosFactory = new HerosInfo(type);
            this.herosFactory.displayHeros();

            // select hero from the specific type
            System.out.print("Selection? ");
            int heroSelected = sc.nextInt();

            // add hero to player's team
            Hero h = this.herosFactory.getHeros().get(heroSelected);
            System.out.println("You selected " + h.getName());
            h.setSymbol("H" + i);
            h.setPos(new int[]{7, (i-1)*3+1});;
            this.herosFactory.addHero(this.herosFactory.getHeros().get(heroSelected));
        }
        System.out.println();
        System.out.println("You have formed your hero team.");
    }

    public void setStatus(int i){
        this.status = i;
    }

    public boolean getWinStatus(){
        return this.win;
    }

    public int getStatus(){
        return this.status;
    }

    public ArrayList<Hero> getHeros(){
        return this.herosFactory.getHeros();
    }

    public HerosInfo getHeroFact(){
        return this.herosFactory;
    }

    public Hero getHero(int i){
        return this.herosFactory.getHero(i);
    }

    public void displayTypes(){
        System.out.println("1) Warrior");
        System.out.println("2) Sorccerer");
        System.out.println("3) Paladin");
        System.out.println();
    }

    public boolean checkWin(){
        for (Hero h : this.herosFactory.getHeros()){
            // if one of heros are in monster's nexus
            return true;
        }
        return false;
    }

}