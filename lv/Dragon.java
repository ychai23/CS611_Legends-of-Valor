/*
 * Dragon class that provides a template to create a dragon (baseDamage 10% higher)
 */
public class Dragon extends Monster{
    public Dragon(String name, int level, double HP, double baseDam, double defenseV, double dodgeV){
        // initialize items in an inventory
        super(name, level, HP, baseDam*1.01, defenseV, dodgeV);
    }

}