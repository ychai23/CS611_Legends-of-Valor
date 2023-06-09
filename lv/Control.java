import java.util.Scanner;
import java.util.InputMismatchException;
/*
 * Control class that display options and take input from a hero for move
 */
public class Control{
    private final char[] options = {'w', 'a', 's', 'd', 'q', 'i', 'm', 'c', 'p', 't', 'u', 'l', 'e', 'r'};

    public char getMove(){
        System.out.println();
        //move
        System.out.println("W/w: move up");
        System.out.println("A/a: move left");
        System.out.println("S/s: move down");
        System.out.println("D/d: move right");

        System.out.println("Q/q: quit game");
        System.out.println("I/i: show information");
        System.out.println("C/c: change armor/weapon");
        System.out.println("P/p: pass");
        System.out.println("T/t: attack");
        System.out.println("U/u: use a potion");
        System.out.println("L/l: cast a spell");
        System.out.println("E/e: teleport");
        System.out.println("R/r: recall");
        
        System.out.println();
        System.out.print("Enter your move for the hero: ");

        Scanner sc = new Scanner(System.in);
        char c = ' ';
        while (true){
            try {
                c = Character.toLowerCase(sc.next().charAt(0));
                if (new String(this.options).indexOf(c) == -1) {
                    System.out.print("Input invalid, please enter a valid move option: ");
                    continue;
                }
                break;
            }
            catch (InputMismatchException a) {
                System.out.print("Input invalid, please enter a valid character: ");
                sc.next();
            }
        }
        return c;
    }
}