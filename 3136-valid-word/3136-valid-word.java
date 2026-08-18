class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean vowel = false;
        boolean consonant = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if ("aeiouAEIOU".indexOf(ch) >= 0) {
                vowel = true;
            } else if (Character.isLetter(ch)) {
                consonant = true;
            }
        }

        return vowel && consonant;
    }
}