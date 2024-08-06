package wipro.IOStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input file name:");
        String inputFileName = scanner.nextLine();

        System.out.println("Enter the output file name:");
        String outputFileName = scanner.nextLine();

        try {
            Map<String, Integer> wordCountMap = countWords(inputFileName);
            writeWordCounts(outputFileName, wordCountMap);
            System.out.println("Word counts have been written to " + outputFileName);
        } catch (IOException e) {
            System.out.println("Error during file processing: " + e.getMessage());
        }

        scanner.close();
    }

    private static Map<String, Integer> countWords(String inputFileName) throws IOException {
        Map<String, Integer> wordCountMap = new TreeMap<>(); // TreeMap keeps entries sorted by key

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by whitespace
                for (String word : words) {
                    word = word.toLowerCase(); // Convert to lowercase for case-insensitive counting
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }

        return wordCountMap;
    }

    private static void writeWordCounts(String outputFileName, Map<String, Integer> wordCountMap) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
        }
    }
}

