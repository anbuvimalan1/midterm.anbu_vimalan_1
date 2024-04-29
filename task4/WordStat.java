package midterm.anbu_vimalan_1.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordStat {

    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Create a set of all different words
        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);

        // Print the set of unique words on the console
        System.out.println("Set of unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        // Create a map to store word lengths and their counts
        Map<Integer, Integer> wordLengthCounts = new HashMap<>();
        for (String word : fantasyFormatData) {
            int wordLength = word.length();
            wordLengthCounts.put(wordLength, wordLengthCounts.getOrDefault(wordLength, 0) + 1);
        }

        // Print the map of word lengths and their counts on the console
        System.out.println("\nMap of word lengths and their counts:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCounts.entrySet()) {
            System.out.println("Length: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Append the console output to the "task4.txt" file
        appendToTask4File(uniqueWords, wordLengthCounts);
    }

    private static void appendToTask4File(Set<String> uniqueWords, Map<Integer, Integer> wordLengthCounts) {
        try (FileWriter writer = new FileWriter("task4.txt", true)) {
            // Skip 2 lines after existing content
            writer.append("\n\n");

            // Append set of unique words
            writer.append("Set of unique words:\n");
            for (String word : uniqueWords) {
                writer.append(word).append("\n");
            }

            // Append map of word lengths and their counts
            writer.append("\nMap of word lengths and their counts:\n");
            for (Map.Entry<Integer, Integer> entry : wordLengthCounts.entrySet()) {
                writer.append("Length: ").append(String.valueOf(entry.getKey()))
                        .append(", Count: ").append(String.valueOf(entry.getValue())).append("\n");
            }

            System.out.println("Data appended to task4.txt successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to task4.txt: " + e.getMessage());
        }
    }
}