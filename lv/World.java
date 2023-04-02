import java.util.Random;
/*
 * World class where the map is created and player can make move/visualize the map
 */
public class World{
    private Grid[][] map;
    private Player player;
    private int size;

    public World(int size, Player p){
        this.player = p;
        this.size = size;
        this.map = new Grid[size][size];
        // random initilization of different spaces
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                Random rn = new Random();
                int n = rn.nextInt(10);
                if (n <= 4) this.map[i][j] = new BattleGrid();
                else if (n <= 7) this.map[i][j] = new MarketGrid();
                else this.map[i][j] = new IllegalGrid();
            }
        }
    }

    public Grid[][] getMap(){
        return this.map;
    }

    public int getSize(){
        return this.size;
    }

    public void respond(Player p){
        int[] pos = p.getPos();

        Grid g = this.map[pos[0]][pos[1]];

        if (g.getType() == ' ') {
            System.out.println("**** You have entered a BATTLE Grid! ****");
            ((BattleGrid) g).runBattle(p);
        }
        if (g.getType() == 'M') {
            System.out.println("**** You have entered a MARKET Grid! ****");
            ((MarketGrid) g).runMarket(this.player);
        }

    }

    public String toString(){
        String s = " ";
        for (int i=0; i<this.size; i++){
            for (int k=0; k<this.size;k++){
                s += "+--";
            }
            s += "\n";
            s += (i + "|");
            for (int j=0; j<this.size; j++){
                Grid g = this.map[i][j];
                if (this.player.getPos()[0] == i && this.player.getPos()[1] == j) s += this.player.getSymbol() + " |";
                else s += g.getType() + " |";
            }
            s += "\n ";
        }
        for (int k=0; k<this.size;k++){
            s += "+--";
        }
        s += "\n  ";
        for (int k=0; k<this.size;k++){
            s += (k + "  ");
        }
        s += "\n";
        s += "\n";
        return s;
    }

}