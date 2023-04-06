import java.util.Random;

public class ValorWorld{
    private Grid[][] map;
    private Player player;
    private int size;

    public ValorWorld(int size){

        this.size = size;
        this.map = new Grid[size][size];
        // random initilization of different spaces
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                Random rn = new Random();
                int n = rn.nextInt(10);
                if((i == 0 || i == size-1) && j != 2 && j != 5){
                    this.map[i][j] = new Nexus();
                }
                else if(j == 2 || j == 5){
                    this.map[i][j] = new Inaccessible();
                }
                else if (n <= 2.5) this.map[i][j] = new Plain();
                else if (n <= 5) this.map[i][j] = new Cave();
                else if (n <= 7.5) this.map[i][j] = new Bush();
                else this.map[i][j] = new Koulou();
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
        String s = "";
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                char sym = map[i][j].getType();
                switch (sym) {
                    case 'N':
                        s+="N - N - N  ";
                        break;
                    case 'I':
                        s+="I - I - I  ";
                        break;
                    case 'P':
                        s+="P - P - P  ";
                        break;
                    case 'C':
                        s+="C - C - C  ";
                        break;
                    case 'B':
                        s+="B - B - B  ";
                        break;
                    case 'K':
                        s+="K - K - K  ";
                        break;
                }

            }
            s+="\n";
            for (int j=0; j<size; j++){


                //TODO:
//                Get Position of Each Hero
//                Get Position of each Monster
//                Adjust Each Print
                s+="|       |  ";
            }
            s+="\n";
            for (int j=0; j<size; j++){
                char sym = map[i][j].getType();
                switch (sym) {
                    case 'N':
                        s+="N - N - N  ";
                        break;
                    case 'I':
                        s+="I - I - I  ";
                        break;
                    case 'P':
                        s+="P - P - P  ";
                        break;
                    case 'C':
                        s+="C - C - C  ";
                        break;
                    case 'B':
                        s+="B - B - B  ";
                        break;
                    case 'K':
                        s+="K - K - K  ";
                        break;
                }

            }s+="\n";
        }
        return s;
    }
}
