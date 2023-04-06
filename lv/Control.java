import java.util.Scanner;
import java.util.InputMismatchException;
/*
 * Control class that take input from player for option
 */
public class Control{
    private final char[] options = {'w', 'a', 's', 'd', 'q', 'i', 'm', 'c', 'p'};

    public char getMove(){
        System.out.println();
        System.out.println("W/w: move up");
        System.out.println("A/a: move left");
        System.out.println("S/s: move down");
        System.out.println("D/d: move right");
        System.out.println("Q/q: quit game");
        System.out.println("I/i: show information");
        System.out.println("C/c: change armor/weapon");
        System.out.println("P/p: pass");
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