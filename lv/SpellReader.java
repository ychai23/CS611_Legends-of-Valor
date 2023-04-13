import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;  
import java.io.IOException;

/*
 * SpellReader class that helps parse txt file into Spell objects
 */
public class SpellReader {
    public ArrayList<Spell> readSpells(int type){
        ArrayList<Spell> allSpells = new ArrayList<Spell>();
        String line = "";
        String filename = "";
        char t = ' ';
        if (type==1) {
            filename = "ConfigFiles/FireSpells.txt"; t = 'f';
        }
        if (type==2) {
            filename = "ConfigFiles/IceSpells.txt"; t = 'i';
        }
        else {
            filename = "ConfigFiles/LightningSpells.txt"; t = 'l';
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // this will read the first line
            while ((line = br.readLine()) != null) {  
                    String[] hs = line.split("\\s+");    // use comma as separator  
                    if (t=='f') {
                        Spell s = new FireSpell(hs[0], Double.parseDouble(hs[1]), Integer.parseInt(hs[2]), Double.parseDouble(hs[3]), Double.parseDouble(hs[4]), 's', t);
                        allSpells.add(s);
                    }
                    if (t=='i') {
                        Spell s = new IceSpell(hs[0], Double.parseDouble(hs[1]), Integer.parseInt(hs[2]), Double.parseDouble(hs[3]), Double.parseDouble(hs[4]), 's', t);
                        allSpells.add(s);
                    }
                    if (t=='l') {
                        Spell s = new LighteningSpell(hs[0], Double.parseDouble(hs[1]), Integer.parseInt(hs[2]), Double.parseDouble(hs[3]), Double.parseDouble(hs[4]), 's', t);
                        allSpells.add(s);
                    }
            }
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        return allSpells;
    }

}
