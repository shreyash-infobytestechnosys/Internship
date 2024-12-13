import java.util.*;
import java.util.concurrent.*;

public class FailFastFailSafeInfobyte {
    public static void main(String[] args) {
        // Fail-Fast Example
        System.out.println("Fail-Fast Example:");
        List<String> failFastList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        try {
            Iterator<String> iterator = failFastList.iterator();
            while (iterator.hasNext()) {
                System.out.println("Element: " + iterator.next());
                failFastList.add("D");
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Exception: ConcurrentModificationException");
        }

        // Fail-Safe Example
        System.out.println("\nFail-Safe Example:");
        CopyOnWriteArrayList<String> failSafeList = new CopyOnWriteArrayList<>(Arrays.asList("A", "B", "C"));
        for (String element : failSafeList) {
            System.out.println("Element: " + element);
            failSafeList.add("D");
        }
        System.out.println("Updated CopyOnWriteArrayList: " + failSafeList);
    }
}