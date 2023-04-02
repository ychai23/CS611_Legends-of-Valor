/*
 * BattleGrid class that provides a template for creating grid where a battle could potentially happen
 */
public class BattleGrid extends Grid{
    private Battle battle;

    public BattleGrid(){
        super();
        this.type = ' ';
    }

    public void runBattle(Player p){
        int dice = p.rollDice();
        if (dice < 8){
            // 80% chance to fight in battle
            this.battle = new Battle(p);
            this.battle.runBattle();
        }
        else{
            System.out.println("You encountered no enemies.");
        }
    }
}