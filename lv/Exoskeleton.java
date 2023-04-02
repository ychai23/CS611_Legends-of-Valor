/*
 * Exoskeleton class that provides a template to create an exoskeleton (defense 10% higher)
 */
public class Exoskeleton extends Monster{
    public Exoskeleton(String name, int level, double HP, double baseDam, double defenseV, double dodgeV){
        // initialize items in an inventory
        super(name, level, HP, baseDam, defenseV*1.01, dodgeV);
    }
}