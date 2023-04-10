import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * Player class that operates all actions a player can take during a game
 * 
 */
public class Player{
    private Control control;
    private HerosInfo herosFactory;
    private int status = 0;
    private boolean win = false;

    public Player(){
        this.control = new Control();
        // get user inputs to create the heros
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insert number of heros (1-3): ");
        int teamS = sc.nextInt();

        for (int i=1; i<teamS+1; i++){
            // select which type of hero
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

    public char move(ValorWorld w, Hero h){
        Grid[][] map = w.getMap();
        int size = w.getSize();
        int x = h.getPos()[0];
        int y = h.getPos()[1];
        boolean s = false;
        char move = ' ';

        while (!s){
            System.out.println(w);
            move = this.control.getMove();
            switch (move) {
                case 'w':   //move up
                            if (x-1<0) {
                                System.out.println("You can't move that way, out of the map.");
                                break;
                            }
                            if (map[x-1][y].getType() == 'i') {
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
                case 'i':   //show info
                            System.out.println("**** Current HERO team status ****");
                            this.herosFactory.displayAll();
                            break;
                case 'c':   //show info
                            this.herosFactory.changeInv();
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
        h.setPos(newPost);
        return move;
    }

    public int rollDice(){
        // if unlucky, battle begins
        System.out.println("Rolling a dice...");
        Random rn = new Random();
        int n = rn.nextInt(10);
        System.out.println("You rolled " + n);
        return n;
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