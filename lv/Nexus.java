/*
 * Nexus class that offer heros the abilility to interact with a market
 * 
 */

public class Nexus extends Grid{
    protected char type = 'N';

    public char getType(){
        return this.type;
    }

    public void effect(Hero h) {
        h.clear();
    }

    public void effect(Monster m){
        m.clear();
    }
}
