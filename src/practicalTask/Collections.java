package practicalTask;

import java.util.*;

/**
 * Created by prots on 04.05.2017.
 */
public class Collections {

    public List<Integer> createCollection(List<Integer> myCollection, int elements){
        Random random = new Random();
        for (int i = 0; i < elements; i++) {
            myCollection.add(random.nextInt(50) - 20);
        }
        return myCollection;
    }

    public List<Integer> findAndSave(List<Integer> myCollection, int position) {
        List<Integer> newCollections = new ArrayList<>();
        int i = 0;
        for (Integer l : myCollection) {
            if (l > position) {
                newCollections.add(i);
            }
            i++;
        }
        return newCollections;
    }

    public List<Integer> removeElement(List<Integer> myCollections, int element) {
        Iterator<Integer> li = myCollections.listIterator();
        while (li.hasNext()) {
            if (li.next() >= element) {
                li.remove();
            }
        }
        return myCollections;
    }

    public List<Integer> insertElement(List<Integer> myCollection){
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        return myCollection;
    }

    public List<Integer> sortElement(List<Integer> myCollection){
        myCollection.sort(Comparator.comparingInt(Integer::intValue));
        return myCollection;
    }

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Collections c = new Collections();
        int element = 20;

        System.out.println(c.createCollection(myCollection, element));
        System.out.println(c.findAndSave(myCollection, 5));
        System.out.println(c.removeElement(myCollection, 20));
        System.out.println(c.insertElement(myCollection));
        System.out.println(c.sortElement(myCollection));
    }
}
