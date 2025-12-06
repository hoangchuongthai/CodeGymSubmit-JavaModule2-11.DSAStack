package src;

import java.util.Map;

public class WordCounterTest {
    public static void main(String[] args) {

        String text = "Java is easy and Java is powerful. Java Java Java!";

        Map<String, Integer> result = WordCounter.countWords(text);

        System.out.println("Word Frequency (Alphabetical Order):");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
