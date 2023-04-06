/*
 * Gamecontrol class that operates the main logic of the entire game
 * 
 * Take player's move
 * World responds to the move
 * 
 */
public class GameControl{
    private Player p;
    private World w;

    public void run(){
        // code to run game
        System.out.println("****** LEGENDS: MONSTORS AND HEROS ******");
        System.out.println("Welcome! Please set-up your party");
        this.p = new Player();
        this.w = new World(8, p);

        while (true){
            char move = ' ';
            for (Hero h : this.p.getHeros()){
                System.out.println(h.getName() + " 's turn.");
                move = this.p.move(this.w, h);
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