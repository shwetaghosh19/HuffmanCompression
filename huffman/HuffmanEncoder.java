package huffman;

import java.util.HashMap;
import java.util.Map;

public class HuffmanEncoder {
    public Map<Character, String> generateCodes(Node root) {
        Map<Character, String> codes = new HashMap<>();
        generateCodesRecursive(root, "", codes);
        return codes;
    }

    private void generateCodesRecursive(Node node, String code, Map<Character, String> codes) {
        if (node == null) return;

        if (node.left == null && node.right == null) { // Leaf node
            codes.put(node.character, code);
        }

        generateCodesRecursive(node.left, code + "0", codes);
        generateCodesRecursive(node.right, code + "1", codes);
    }
}

