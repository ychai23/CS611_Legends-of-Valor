public class ValorGame {
    Player volarPlayer = null;
    MonstersInfo mf = null;
    ValorWorld map = null;

    public ValorGame() {
        //SetUp Hero For 3 Lane
        this.volarPlayer = new Player(3);
        this.mf = new MonstersInfo(this.volarPlayer.getHeroFact(),3);
        this.map = new ValorWorld(8, this.volarPlayer, this.mf);
    }

    public void startSetUp(){
        System.out.println("Welcome to Game: Legends of Valor!");
        
        while (true){
            char move = ' ';
            for (Hero h : this.volarPlayer.getHeros()){
                move = h.move(this.map, this.mf, this.volarPlayer.getHeroFact());
                this.map.respond(h);
                if (this.volarPlayer.checkWin()){
                    System.out.println("You won! ");
                    break;
                }   
                if (move == 'q'){
                    break;
                }
            }

            for (Monster m : this.mf.getMonsters()){
                m.move(this.map, this.mf, this.volarPlayer.getHeroFact());
                if (m.checkWin()){
                    System.out.println("Monster won! ");
                    break;
                }   
            }
            
            if (move == 'q' || this.volarPlayer.checkWin()){
                break;
            }
        }

        System.out.println("Game ended");
    }
        
        
}