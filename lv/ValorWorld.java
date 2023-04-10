import java.util.Random;

public class ValorWorld{
    private Grid[][] map;
    private Player player;
    private MonstersInfo mf;
    private int size;

    public ValorWorld(int size, Player p, MonstersInfo mf){
        this.player = p;
        this.mf = mf;
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

    public void respond(Hero h){
        int[] pos = h.getPos();
        Grid g = this.map[pos[0]][pos[1]];
        char type = g.getType();
        switch(type){
            case 'N':
                Nexus n = (Nexus)g;
                n.effect();
                break;
            case 'I':
                Inaccessible i = (Inaccessible)g;
                i.effect();
                break;
            case 'P':
                Plain plain = (Plain)g;
                plain.effect();
                break;
            case 'B':
                Bush b = (Bush)g;
                b.effect();
                break;
            case 'C':
                Cave c = (Cave)g;
                c.effect();
                break;
            case 'K':
                Koulou k = (Koulou)g;
                k.effect();
                break;
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
                for (int k=0; k<3; k++){
                    if (this.player.getHero(i).getPos()[0] == i && this.player.getHero(0).getPos()[1] == j) {
                        s += this.player.getHero(i).getSymbol() + "     |";
                    } else if (this.mf.getMonster(i).getPos()[0] == i && this.mf.getMonster(i).getPos()[1] == j){
                        s += this.mf.getMonster(i).getSymbol() + "     |";
                    } else{
                        s+="|       |  ";
                    }
                }
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
