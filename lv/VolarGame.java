import javax.sound.sampled.SourceDataLine;

public class VolarGame extends GameControl {
    Player volarPlayer = null;
    MonstersInfo mf = null;
    ValorWorld map = null;


    public void startSetUp(){
        System.out.println("Welcome to Game: Legends of Valor!");
        //SetUp Hero For 3 Lane
        volarPlayer = new Player(3);
        mf = new MonstersInfo(volarPlayer.getHeroFact(),3);

        ValorWorld map = new ValorWorld(8, volarPlayer, mf);
        System.out.println(map.toString());
        
        while (true){
            char move = ' ';
            for (Hero h : this.volarPlayer.getHeros()){
                System.out.println(h.getName() + " 's turn.");
                move = this.volarPlayer.move(this.map, h);
                this.map.respond(h);
                if (volarPlayer.getWinStatus()){
                    System.out.println("You won! ");
                    break;
                }
                if (move == 'q'){
                    break;
                }
            }
            if (move == 'q' || volarPlayer.getWinStatus()){
                break;
            }
        }

        System.out.println("Game ended");
    }
        
        
}