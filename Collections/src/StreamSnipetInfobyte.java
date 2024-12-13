import java.util.*;
import java.util.stream.*;

public class StreamSnipetInfobyte {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("After", "Pankaj", "Chacha", "diksha", "meghana");

        // Filter names starting with 'A'
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        // Map to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}
