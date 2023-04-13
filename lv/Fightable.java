/*
 * Fightable interface that allows fighting
 * 
 */
public interface Fightable {
    public int[] getPos();
    public void clear();
    public char move(ValorWorld w, MonstersInfo mf, HerosInfo hf);
}
