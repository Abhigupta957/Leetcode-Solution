import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution {

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Object, Integer> lastSeen = new HashMap<>();

        // Loop through pattern and words
        for (int i = 0; i < pattern.length(); i++) {

            Integer prevCharIndex = lastSeen.put(pattern.charAt(i), i);

            Integer prevWordIndex = lastSeen.put(words[i], i);

            if (!Objects.equals(prevCharIndex, prevWordIndex)) {
                return false;
            }
        }

        return true;
    }
}