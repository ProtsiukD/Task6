package homework.first;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by prots on 14.05.2017.
 */
public class Map2 {
    public Map<String,String> createMap(Map<String,String> personMap){
        personMap.put("Dutchack","Anna");
        personMap.put("Babich","Anna");
        personMap.put("Greckhem","Eashley");
        personMap.put("Redfild","Kler");
        personMap.put("Birkin","Sherry");
        personMap.put("Harper","Helena");
        personMap.put("Simens","Karla");
        personMap.put("Alomar","Sheva");
        personMap.put("Vong","Ada");
        personMap.put("Herper","Debora");

        return personMap;
    }

    public boolean theSameName(Map<String, String>personMap){
        Set valueSet = new HashSet(personMap.values());
        if(personMap.values().size()!=valueSet.size()){
            return true;
        }
        return false;
    }

    public Map<String, String> removeTheElement(Map<String, String> personMap, String name){
        Set<String> values = new HashSet<>();
        for(Map.Entry<String,String> entry : personMap.entrySet()){
            if (name.equals(entry.getValue())){
                values.remove(entry.getKey());//?
            }
        }
        return personMap;
    }
    public static void main(String[] args) {
        Map<String,String> personMap = new TreeMap<>();
        Map2 map2 = new Map2();

        System.out.println(map2.createMap(personMap));
        System.out.println(map2.theSameName(personMap));
        System.out.println(map2.removeTheElement(personMap,"Anna"));
    }
}
