import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "This is a sample text. This text contains some words. Some words may repeat.";

        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
