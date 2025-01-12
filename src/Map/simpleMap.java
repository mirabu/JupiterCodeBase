package Map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class simpleMap {
    public static void main(String[] args) {
        // Create a NavigableMap and add entries
        NavigableMap<String, String> original = new TreeMap<>();
        original.put("1", "1");
        original.put("2", "2");
        original.put("3", "3");

        // HeadMap up to "3" (exclusive)
        SortedMap<String, String> headmap1 = original.headMap("3");

        // HeadMap up to "3" (inclusive)
        NavigableMap<String, String> headmap2 = original.headMap("3", true);

        // Print the original map
        System.out.println("Original Map: " + original);

        // Print headmap1
        System.out.println("HeadMap1 (up to '3' exclusive):");
        headmap1.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // Print headmap2
        System.out.println("HeadMap2 (up to '3' inclusive):");
        headmap2.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
