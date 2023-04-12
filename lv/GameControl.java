/*
 * Gamecontrol class that operates the main logic of the entire game
 * 
 * Take player's move
 * World responds to the move
 * 
 */
public class GameControl{
    private Player p;
    private MonstersInfo mf;
    private ValorWorld w;

    public void run(){
        // code to run game
        System.out.println("****** LEGENDS: MONSTORS AND HEROS ******");
        System.out.println("Welcome! Please set-up your party");
        this.p = new Player(3);
        this.mf = new MonstersInfo(p.getHeroFact());
        this.w = new ValorWorld(8, p, mf);

        while (true){
            char move = ' ';
            for (Hero h : this.p.getHeros()){
                System.out.println(h.getName() + " 's turn.");
                move = h.move(this.w, this.mf, this.p.getHeroFact());
                this.w.respond(h);
                if (p.getWinStatus()){
                    System.out.println("You won! ");
                    break;
                }
                if (move == 'q'){
                    break;
                }
            }
            if (move == 'q' || p.getWinStatus()){
                break;
            }
        }

        System.out.println("Game ended");
    }
}