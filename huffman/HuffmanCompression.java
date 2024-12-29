package huffman;

import java.util.Map;

public class HuffmanCompression {
    public String encode(String text, Map<Character, String> codes) {
        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedText.append(codes.get(c));
        }
        return encodedText.toString();
    }
}

