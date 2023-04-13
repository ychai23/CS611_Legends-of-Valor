/*
 * Bush class that give dexiterity on both hero and monster when it enters
 * 
 */
public class Bush extends Grid{
    protected char type = 'B';

    public char getType(){
        return this.type;
    }


    public void effect(Hero h) {
        System.out.println(h.getSymbol()+" steped on Bush. Buff on Dexterity.");
        h.clear();
        h.setCurDexterityV();
    }

    public void effect(Monster m){
        System.out.println(m.getSymbol()+" steped on Bush. Buff on Dodge.");
        m.clear();
        m.setCurDodgeV();
    }
}
