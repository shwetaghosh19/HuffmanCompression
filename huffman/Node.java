package huffman;

public class Node implements Comparable<Node> {
    public char character;
    public int frequency;
    public Node left;
    public Node right;

    public Node(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }

    @Override
    public int compareTo(Node other) {
        return this.frequency - other.frequency;
    }
}

