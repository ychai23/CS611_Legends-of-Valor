import java.util.Scanner;
import java.util.ArrayList;

/*
 * Player class that operates all actions a player can take during a game
 * 
 */
public class Player{
    private HerosInfo herosTeam;
    private int status = 0;
    private boolean win = false;
    private int size;

    public Player(int number){
        HerosInfo herosFactory;
        this.size = number;
        ArrayList<Hero> heros = new ArrayList<Hero>();
        // get user inputs to create the heros
        Scanner sc = new Scanner(System.in);
        int teamS = number;
        String[] s = new String[]{"Choose your Hero For Top Lane:", "Choose your hero For Mid Lane:","Choose your hero for Bot Lane: "};

        for (int i=1; i<teamS+1; i++){
            // select which type of hero
            System.out.println(s[i-1]);
            this.displayTypes();
            System.out.print("Selection? ");
            int type = sc.nextInt();
            System.out.println();

            // create hero factory
            herosFactory = new HerosInfo(type);
            herosFactory.displayHeros();

            // select hero from the specific type
            System.out.print("Selection? ");
            int heroSelected = sc.nextInt();

            // add hero to player's team
            Hero h = herosFactory.getHeros().get(heroSelected);
            System.out.println("You selected " + h.getName());
            heros.add(h);
        }
        System.out.println();
        this.herosTeam = new HerosInfo(heros);

        System.out.println("You have formed your hero team.");
        this.herosTeam.displayHeros();
        for(int num = 0; num < 3; num++){
            this.herosTeam.getHero(num).setPos(new int[]{7, 3*(num)});
            this.herosTeam.getHero(num).setBirth(new int[]{7, 3*(num)});
            this.herosTeam.getHero(num).setSymbol("H"+num);
            this.herosTeam.getHero(num).setIndex(num);
        }
    }

    public int getSize(){
        return this.size;
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
        return this.herosTeam.getHeros();
    }

    public HerosInfo getHeroFact(){
        return this.herosTeam;
    }

    public Hero getHero(int i){
        return this.herosTeam.getHero(i);
    }

    public void displayTypes(){
        System.out.println("1) Warrior");
        System.out.println("2) Sorccerer");
        System.out.println("3) Paladin");
        System.out.println();
    }

    public boolean checkWin(){
        for (Hero h : this.herosTeam.getHeros()){
            // if one of heros are in monster's nexus
            if (h.getPos()[0] == 0){
                return true;
            }
        }
        return false;
    }

}