import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;  
import java.io.IOException;

/*
 * PotionReader class that helps parse txt file into Potion objects
 */
public class PotionReader {
    public ArrayList<Potion> readPotions(int type){
        ArrayList<Potion> allPotions = new ArrayList<Potion>();
        String line = "";
        String filename = "ConfigFiles/Potions.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // this will read the first line
            while ((line = br.readLine()) != null) {  
                    String[] hs = line.split("\\s+");    // use comma as separator
                    String[] effects = hs[4].split("/");
                    Potion p = new Potion(hs[0], Double.parseDouble(hs[1]), Integer.parseInt(hs[2]), Double.parseDouble(hs[3]), effects);
                    allPotions.add(p);
            }
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        return allPotions;
    }

}

