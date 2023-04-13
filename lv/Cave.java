public class Cave extends Grid{
    protected char type='C';

    public char getType(){
        return this.type;
    }


    public void effect(Hero h) {
        h.clear();
        h.setCurAgilityV();
    }

    public void effect(Monster m){
        m.clear();
        m.setCurDodgeV();
    }
}
