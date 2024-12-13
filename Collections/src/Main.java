import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        //Create ConcurrentHashMap instance
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        //concurrent writing to the map
        Thread writer1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                map.put(i, "Value" + i);
                System.out.println("Writer1 added: " + i + " -> Value" + i);
                try {
                    Thread.sleep(100); // Simulate some delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread writer2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                map.put(i, "Value" + i);
                System.out.println("Writer2 added: " + i + " -> Value" + i);
                try {
                    Thread.sleep(250); // Simulate some delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // concurrent reading from the map
        Thread reader = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Reader sees: " + map);
                try {
                    Thread.sleep(200); // Simulate some delay in reading
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });


        writer1.start();
        writer2.start();
        reader.start();


        try {
            writer1.join();
            writer2.join();
            reader.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
