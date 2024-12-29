package huffman;

public class HuffmanDecompression {
    public String decode(String encodedText, Node root) {
        StringBuilder decodedText = new StringBuilder();
        Node current = root;

        for (char bit : encodedText.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;

            if (current.left == null && current.right == null) { // Leaf node
                decodedText.append(current.character);
                current = root;
            }
        }
        return decodedText.toString();
    }
}

