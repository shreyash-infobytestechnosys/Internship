import java.util.*;

public class CollectionsDetailedExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();


        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");


        map.put(null, "NullKey");
        map.put(4, null);


        System.out.println("HashMap Iteration (Key-Value Pairs):");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }


        System.out.println("\nValue for key 1: " + map.get(1));
        System.out.println("Value for null key: " + map.get(null));
        System.out.println("Value for key 4 (null value): " + map.get(4));


        // HashSet And TreeSet

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Cherry");
        hashSet.add("Apple");
        hashSet.add("Mango");

        System.out.println("HashSet (No Duplicates, No Guaranteed Order):");
        for (String item : hashSet) {
            System.out.println(item);
        }


        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Apple");
        treeSet.add("Mango");

        System.out.println("\nTreeSet (No Duplicates, Sorted Order):");
        for (String item : treeSet) {
            System.out.println(item);
        }
    }
}