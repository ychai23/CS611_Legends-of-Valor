public class ValorGame {
    Player volarPlayer = null;
    MonstersInfo mf = null;
    ValorWorld map = null;
    int iter;

    public ValorGame() {
        //SetUp Hero For 3 Lane
        this.volarPlayer = new Player(3);
        this.mf = new MonstersInfo(this.volarPlayer.getHeroFact(),3);
        this.map = new ValorWorld(8, this.volarPlayer, this.mf);
        this.iter = 0;
    }

    public void startSetUp(){
        System.out.println("Welcome to Game: Legends of Valor!");

        System.out.println(this.map);
        // initial response
        for (Hero h : this.volarPlayer.getHeros()){
                this.map.respond(h);
        }
        
        while (true){
            char move = ' ';
            //hero move
            for (Hero h : this.volarPlayer.getHeros()){
                move = h.move(this.map, this.mf, this.volarPlayer.getHeroFact());
                // map add effect/buff
                this.map.respond(h);

                // update iteration
                this.iter += 1;

                // hero team wins
                if (this.volarPlayer.checkWin()){
                    System.out.println("H" + h.getIndex() + " " + h.getName() + " has reached monster's Nexus. " + "You won! ");
                    break;
                }   
                if (move == 'q'){
                    break;
                }
            }

            // generate new monsters every 9 iterations
            if (this.iter % 9 == 0){
                System.out.println("New monsters generated!");
                this.map.generateNewMonsters();
                System.out.println(map);
            }


            // monster move
            for (Monster m : this.mf.getMonsters()){
                m.move(this.map, this.mf, this.volarPlayer.getHeroFact());
                // add buff to monster
                this.map.respond(m);
                // monster wins
                if (m.checkWin()){
                    System.out.println("Monster won! ");
                    break;
                }
            }
            
            if (move == 'q' || this.volarPlayer.checkWin() || this.mf.checkWin()){
                break;
            }

        }

        System.out.println(this.map);
        System.out.println("Game ended");
    }
        
        
}