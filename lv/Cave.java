/*
 * Cave class that give agility on hero and defense on monster when it enters
 * 
 */
public class Cave extends Grid{
    protected char type='C';

    public char getType(){
        return this.type;
    }


    public void effect(Hero h) {
        System.out.println(h.getSymbol()+" steped on Cave. Buff on Agility.");
        h.clear();
        h.setCurAgilityV();
    }

    public void effect(Monster m){
        System.out.println(m.getSymbol()+" steped on Cave. Buff on Defense.");
        m.clear();
        m.setCurDefense();
    }
}
