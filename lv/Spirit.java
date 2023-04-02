/*
 * Spirit class that provides a template to create spirit (dodge 10% higher)
 */
public class Spirit extends Monster{

    public Spirit(String name, int level, double HP, double baseDam, double defenseV, double dodgeV){
        super(name, level, HP, baseDam, defenseV, dodgeV*1.01);
    }
}