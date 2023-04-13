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
                else if (n <= 3) this.map[i][j] = new Plain();
                else if (n <= 5) this.map[i][j] = new Cave();
                else if (n <= 7) this.map[i][j] = new Bush();
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

    public boolean heroOccupied(int i, int j){
        for (Hero h : this.player.getHeros()){
            if (h.getPos()[0] == i && h.getPos()[1] == j){
                return true;
            }
        }
        return false;
    }

    public void generateNewMonsters(){
        this.mf.addMonsters();
    }

    public void respond(Monster m){
        int[] pos = m.getPos();
        Grid g = this.map[pos[0]][pos[1]];
        char type = g.getType();
        switch(type){
            case 'N':
                Nexus n = (Nexus)g;
                n.effect(m);
                break;
            case 'I':
                Inaccessible i = (Inaccessible)g;
                i.effect(m);
                break;
            case 'P':
                Plain plain = (Plain)g;
                plain.effect(m);
                break;
            case 'B':
                Bush b = (Bush)g;
                b.effect(m);
                break;
            case 'C':
                Cave c = (Cave)g;
                c.effect(m);
                break;
            case 'K':
                Koulou k = (Koulou)g;
                k.effect(m);
                break;
        }
    }
    

    public void respond(Hero h){
        int[] pos = h.getPos();
        Grid g = this.map[pos[0]][pos[1]];
        char type = g.getType();
        switch(type){
            case 'N':
                Nexus n = (Nexus)g;
                n.effect(h);
                Market mar = new Market();
                mar.runMarket(h);
                break;
            case 'I':
                Inaccessible i = (Inaccessible)g;
                i.effect(h);
                break;
            case 'P':
                Plain plain = (Plain)g;
                plain.effect(h);
                break;
            case 'B':
                Bush b = (Bush)g;
                b.effect(h);
                break;
            case 'C':
                Cave c = (Cave)g;
                c.effect(h);
                break;
            case 'K':
                Koulou k = (Koulou)g;
                k.effect(h);
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
                String monsterName = "";
                String heroName = "";
                for (int k=0; k<this.player.getSize(); k++){
                    if(this.player.getHero(k).getPos() == null){break;}
                    if (this.player.getHero(k).getPos()[0] == i && this.player.getHero(k).getPos()[1] == j) {
                        heroName = this.player.getHero(k).getSymbol()+"";break;
                    }}
                    for (int k=0; k<this.mf.getSize(); k++){
                    if(this.mf.getMonster(k).getPos() == null){break;}
                    if (this.mf.getMonster(k).getPos()[0] == i && this.mf.getMonster(k).getPos()[1] == j){
                        monsterName = this.mf.getMonster(k).getSymbol()+"";break;
                    }} 

                if(monsterName.equals("")){monsterName = "   ";}
                else{monsterName = " "+monsterName;}
                if(heroName.equals("")){heroName = "   ";}
                else{heroName = " "+heroName;}
                s+="|"+ monsterName+" "+heroName+"|  ";
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
