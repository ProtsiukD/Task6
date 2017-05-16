package practicalTask;

import java.util.*;

/**
 * Created by prots on 04.05.2017.
 */
public class Map1 {
    public java.util.Map<Integer, String> createMap(java.util.Map<Integer, String> employeeMap){
        employeeMap.put(1, "Anna");
        employeeMap.put(2, "Vitalina");
        employeeMap.put(3, "Christina");
        employeeMap.put(4, "Anna");
        employeeMap.put(5, "Vica");
        employeeMap.put(6, "Sasha");
        employeeMap.put(7, "Ganna");

        return employeeMap;
    }

    public String searchName(java.util.Map<Integer, String> employeeMap, Integer ID){
        String tmp = "No elements";
        for (java.util.Map.Entry<Integer, String> entry : employeeMap.entrySet())        {
            if (entry.getKey()==ID){
                tmp = entry.getValue();
            }
        }
        return tmp;

    }

    public Integer searchID(java.util.Map<Integer, String> employeeMap, String name){
        Integer ID=0;
        for (java.util.Map.Entry<Integer, String> entry:employeeMap.entrySet())
        {
            if (entry.getValue() == name){
                ID = entry.getKey();
            }
        }
        return ID;
    }

    public static void main(String[] args) {
        java.util.Map<Integer, String> employeeMap = new TreeMap<>();
        Map1 main = new Map1();
        System.out.println(main.createMap(employeeMap));
        System.out.println(main.searchName(employeeMap, 4));
        System.out.println(main.searchID(employeeMap, "Vica"));

    }
}