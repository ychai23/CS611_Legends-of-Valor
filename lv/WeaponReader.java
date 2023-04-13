import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;  
import java.io.IOException;
/*
 * WeaponReader class that helps parse txt file into Weapon objects
 */
public class WeaponReader {
    public ArrayList<Weapon> readWeapons(int type){
        ArrayList<Weapon> allWeapons = new ArrayList<Weapon>();
        String line = "";
        String filename = "ConfigFiles/Weaponry.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // this will read the first line
            while ((line = br.readLine()) != null) {  
                    String[] hs = line.split("\\s+");    // use comma as separator  
                    Weapon w = new Weapon(hs[0], Double.parseDouble(hs[1]), Integer.parseInt(hs[2]), Double.parseDouble(hs[3]));
                    allWeapons.add(w);
            }
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        return allWeapons;
    }

}
