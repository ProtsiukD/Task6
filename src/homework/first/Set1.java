package homework.first;

import java.util.*;

/**
 * Created by prots on 11.05.2017.
 */
public class Set1 {
    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set3 = new TreeSet <Integer>(set1);
        set3.addAll(set2);
        return set3;
    }

    public Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set3 = new TreeSet <Integer>(set1);
        set3.retainAll(set2);
        return set3;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>(Arrays.asList(new Integer[]{2,5,7,9}));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(new Integer[]{4,5,6,7,8}));

        Set1 main = new Set1();
        System.out.println(main.union(set1,set2));
    }
}
