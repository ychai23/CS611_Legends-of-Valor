import java.util.Scanner;
/*
 * Battle class that operates actions of player and monsters during a battle
 */
public class Battle{
    private Player player;
    private HerosInfo herosInfo;
    private MonstersInfo monstersInfo;
    private boolean over;

    public Battle(Player player){
        this.over = false;
        this.player = player;
        this.herosInfo = new HerosInfo(this.player.getHeros());
        this.monstersInfo = new MonstersInfo(this.herosInfo);
    }

    public void runBattle(){
        System.out.println("        **** BATTLE HAS BEGUN ****");
        while (!this.over){
            this.playRound();
        }
        System.out.println("        **** BATTLE IS OVER ****");
        if (this.player.getStatus() == 1){
            for (Hero h : this.herosInfo.getHeros()) {
                h.regain(); 
                h.gain(h.getLevel(), this.herosInfo.getSize());
            }
        }
    }

    public void playRound(){
        System.out.println();
        System.out.println("**** Round has started. ****");
        this.displayBattleStatus();
        Scanner sc = new Scanner(System.in);
        
        for (Hero h: this.herosInfo.getHeros()){
            boolean action = false;
            while (!action){
                this.displayBattleOps();
                char c = ' ';
                System.out.print("Enter your move for hero: " + h.getName() + " ");
                c = Character.toLowerCase(sc.next().charAt(0));

                while (c=='i'){
                    this.displayBattleStatus();
                    displayBattleOps();
                    System.out.print("Enter your move for hero: " + h.getName() + " ");
                    c = Character.toLowerCase(sc.next().charAt(0));
                }
                action = this.playerOps(h, c);
            }
        }

        for (Monster m : this.monstersInfo.getMonsters()){
            m.attack(this.herosInfo);
        }

        if (this.monstersInfo.allDefeated()){
            System.out.println("All the monsters have been defeated.");
            this.over = true;
        }
        else if (this.herosInfo.allDefeated()){
            System.out.println("All your heros have been defeated.");
            this.over = true;
            this.player.setStatus(0);
        }
        System.out.println("**** Round ended ****");
        System.out.println();
    }

    public boolean playerOps(Hero h, char c){
        Scanner sc = new Scanner(System.in);
        if (c=='a') {
            // choose target to attack to
            this.monstersInfo.display();
            System.out.print("Enter which monster(ID) you want to attack: ");
            int monsterID = sc.nextInt();

            // attack
            h.attack(monsterID, this.monstersInfo);
            this.monstersInfo.display();
            return true;
        }
        else if (c=='s'){
            // cast a spell
            // choose target to attack to
            if (h.getInv().spellEmpty()){
                System.out.println("You spell inventory is empty.");
                return false;
            }
            this.monstersInfo.display();
            System.out.print("Enter which monster(ID) you want to cast a spell to: ");
            int monsterID = sc.nextInt();

            // attack
            h.castSpell(monsterID, this.monstersInfo);
            this.monstersInfo.display();
            return true;
        }
        else if (c=='p'){
            if (h.getInv().potionEmpty()){
                System.out.println("You potion inventory is empty.");
                return false;
            }
            // use a potion
            h.usePotion();
            return true;
        }
        else{
            System.out.println("Invalid Option.");
            return false;
        }
    }

    public void displayBattleStatus(){
        System.out.println();
        System.out.println("        **** Current HERO team ****");
        this.herosInfo.displayHeros();
        this.monstersInfo.display();
    }

    public void displayBattleOps(){
        System.out.println("a/A: Attack");
        System.out.println("s/S: Cast a spell");
        System.out.println("p/P: Use Potion");
        System.out.println("i/I: Show Battle Status");
    }
}