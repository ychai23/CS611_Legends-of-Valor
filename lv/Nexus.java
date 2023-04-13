public class Nexus extends Grid{
    protected char type = 'N';

    public char getType(){
        return this.type;
    }

    public void effect(Hero h) {
        System.out.println(h.getSymbol()+" back to Home.");

        h.clear();
        h.respawn();
    }

    public void effect(Monster m){
        m.clear();
    }
}
