public class Inaccessible extends Grid{
    protected char type = 'I';

    public char getType(){
        return this.type;
    }

    
    public void effect(Hero h) {
        System.out.println("Inaccessable Space! Move Back!");
    }

    public void effect(Monster m){
        return;
    }
}
