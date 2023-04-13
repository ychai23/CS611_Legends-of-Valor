public class Plain extends Grid {
    protected char type = 'P';

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
