public class Solution {
    public bool IsAnagram(string s, string t) {
        if (s.Length != t.Length){
        return false;
    }

    int[] frequency = new int[26];

    foreach (char ch in s){
        frequency[ch - 'a']++;
    }

    foreach (char ch in t){
        frequency[ch - 'a']--;
    }

    foreach (int count in frequency){
        if (count != 0){
            return false;
        }
    }

    return true;
    }
}