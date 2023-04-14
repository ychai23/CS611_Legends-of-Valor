import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;  
import java.io.IOException;

/*
 * MonsterReader class that helps parse txt file into Monster objects
 */
public class MonsterReader {

    public ArrayList<Monster> readMonsters(int type){
        ArrayList<Monster> allMonsters = new ArrayList<Monster>();
        String line = "";
        String filename = "";
        if (type==1) filename = "ConfigFiles/Dragons.txt";
        if (type==2) filename = "ConfigFiles/Exoskeletons.txt";
        else filename = "ConfigFiles/Spirits.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // this will read the first line
            while ((line = br.readLine()) != null) {  
                    String[] hs = line.split("\\s+");    // use comma as separator
                    if (type==1) {
                        Monster m = new Dragon(hs[0], Integer.parseInt(hs[1]), 0, Double.parseDouble(hs[2]), Double.parseDouble(hs[3]), Double.parseDouble(hs[4]));
                        allMonsters.add(m);
                    }
                    if (type==2) {
                        Monster m = new Exoskeleton(hs[0], Integer.parseInt(hs[1]), 0, Double.parseDouble(hs[2]), Double.parseDouble(hs[3]), Double.parseDouble(hs[4]));
                        allMonsters.add(m);
                    }
                    if (type==3) {
                        Monster m = new Spirit(hs[0], Integer.parseInt(hs[1]), 0, Double.parseDouble(hs[2]), Double.parseDouble(hs[3]), Double.parseDouble(hs[4]));
                        allMonsters.add(m);
                    }
            }
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        return allMonsters;
    }

    public Monster getMonster(int level, int i){
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters = this.readMonsters(i);
        for (Monster m : monsters){
            if (m.getLevel() == level){
                return m;
            }
        }
        return new Monster("default");
    }

}