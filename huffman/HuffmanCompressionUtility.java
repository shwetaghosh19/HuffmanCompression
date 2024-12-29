package huffman;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class HuffmanCompressionUtility {
    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);
    
        while (true) {
            System.out.println("Enter the text you want to compress (or type 'exit' to quit):");

            String inputText = scanner.nextLine(); // Read input from the user

            // Check if the user wants to exit
            if ("exit".equalsIgnoreCase(inputText.trim())) {
                System.out.println("Exiting the program. Goodbye!");
                break; // Exit the loop and program
            }

            // Check if inputText is empty
            if (inputText.trim().isEmpty()) {
                System.out.println("No input provided. Please provide text to compress.");
                continue; // Ask for input again
            }

            FrequencyCounter counter = new FrequencyCounter();
            Map<Character, Integer> frequencyMap = counter.countFrequencies(inputText);

            HuffmanTree tree = new HuffmanTree();
            Node root = tree.buildTree(frequencyMap);

            HuffmanEncoder encoder = new HuffmanEncoder();
            Map<Character, String> codes = encoder.generateCodes(root);

            HuffmanCompression compression = new HuffmanCompression();
            String encodedText = compression.encode(inputText, codes);

            HuffmanDecompression decompression = new HuffmanDecompression();
            String decodedText = decompression.decode(encodedText, root);

            // Display results
            System.out.println("Original: " + inputText);
            System.out.println("Encoded: " + encodedText);
            System.out.println("Decoded: " + decodedText);
        }

        scanner.close(); // Close the scanner to release resources
    }
}