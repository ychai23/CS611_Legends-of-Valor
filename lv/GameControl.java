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
        
        System.out.println("Your current position is " + p.getPos()[0]+ p.getPos()[1]);

        while (true){
            char move = this.p.move(this.w);
            if (move == 'q'){
                break;
            }
            this.w.respond(this.p);
            if (p.getWinStatus()){
                System.out.println("You won! ");
                break;
            }
        }

        System.out.println("Game ended");
    }
}