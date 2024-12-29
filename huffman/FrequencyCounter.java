package huffman;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public Map<Character, Integer> countFrequencies(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }
}

