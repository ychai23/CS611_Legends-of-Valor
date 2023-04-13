import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;  
import java.io.IOException;

/*
 * HeroReader class that helps parse txt file into Hero objects
 */
public class HeroReader {
    // 1 for warriors; 2 for sorccerer; 3 for paladin
    public ArrayList<Hero> readHeros(int type){
        ArrayList<Hero> allHeros = new ArrayList<Hero>();
        String line = "";
        String filename = "";
        if (type==1) filename = "ConfigFiles/Warriors.txt";
        if (type==2) filename = "ConfigFiles/Sorcerers.txt";
        else filename = "ConfigFiles/Paladins.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // this will read the first line
            while ((line = br.readLine()) != null) {  
                    String[] hs = line.split("\\s+");    // use comma as separator  
                    Hero hero;
                    if (type==1) {
                        hero = new Warrior(hs[0], Double.parseDouble(hs[1]), Double.parseDouble(hs[2]), Double.parseDouble(hs[3]), Double.parseDouble(hs[4]), Double.parseDouble(hs[5]), Double.parseDouble(hs[6]));
                    }
                    else if (type==2) {
                        hero = new Sorcerer(hs[0], Double.parseDouble(hs[1]), Double.parseDouble(hs[2]), Double.parseDouble(hs[3]), Double.parseDouble(hs[4]), Double.parseDouble(hs[5]), Double.parseDouble(hs[6]));
                    }
                    else {
                        hero = new Paladin(hs[0], Double.parseDouble(hs[1]), Double.parseDouble(hs[2]), Double.parseDouble(hs[3]), Double.parseDouble(hs[4]), Double.parseDouble(hs[5]), Double.parseDouble(hs[6]));
                    }
                    allHeros.add(hero);
            }
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        return allHeros;
    }

    
}
