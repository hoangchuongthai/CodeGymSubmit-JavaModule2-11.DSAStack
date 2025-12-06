package src;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {

    // Count word frequency using TreeMap (alphabetical order)
    public static Map<String, Integer> countWords(String text) {
        TreeMap<String, Integer> map = new TreeMap<>();

        if (text == null || text.isEmpty()) return map;

        // Normalize: lowercase + remove special characters
        text = text.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

        // Split by spaces
        String[] words = text.trim().split("\\s+");

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }
}
