import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;  
import java.io.IOException;

/*
 * ArmorReader class that helps parse txt file into Armor objects
 */
public class ArmorReader {
    public ArrayList<Armor> readArmors(int type){
        ArrayList<Armor> allArmors = new ArrayList<Armor>();
        String line = "";
        String filename = "./ConfigFiles/Armory.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // this will read the first line
            while ((line = br.readLine()) != null) {  
                    String[] hs = line.split("\\s+");    // use comma as separator  
                    Armor a = new Armor(hs[0], Double.parseDouble(hs[1]), Integer.parseInt(hs[2]), Double.parseDouble(hs[3]));
                    allArmors.add(a);
            }
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        return allArmors;
    }

}
