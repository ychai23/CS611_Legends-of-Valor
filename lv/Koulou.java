/*
 * Koulou class that give buff strength on hero and base damage on monster when it enters
 * 
 */
public class Koulou extends Grid{
    protected char type = 'K';

    public char getType(){
        return this.type;
    }


    public void effect(Hero h) {
        System.out.println(h.getSymbol()+" steped on Koulou. Buff on Strength.");
        h.clear();
        h.setCurDtrengthV();
    }

    public void effect(Monster m){
        System.out.println(m.getSymbol()+" steped on Koulou. Buff on Base Damage.");
        m.clear();
        m.setCurBaseDamage();
    }
}
