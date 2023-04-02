/*
 * IllegalGrid class that provides a template for a grid that player can't enter
 */

public class IllegalGrid extends Grid{
    public IllegalGrid(){
        super();
        this.type = 'X';
    }

    public void runIllegal() {
        System.out.println("Illegal Grid, unable to enter");
    }
}