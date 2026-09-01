using System.Collections.Generic;

public class Solution
{
    public bool WordPattern(string pattern, string s)
    {
        string[] words = s.Split(' ');

        if (pattern.Length != words.Length)
        {
            return false;
        }

        Dictionary<char, string> map1 = new Dictionary<char, string>();
        Dictionary<string, char> map2 = new Dictionary<string, char>();

        for (int i = 0; i < pattern.Length; i++)
        {
            char c = pattern[i];
            string word = words[i];

            if (map1.ContainsKey(c))
            {
                if (map1[c] != word)
                {
                    return false;
                }
            }

            if (map2.ContainsKey(word))
            {
                if (map2[word] != c)
                {
                    return false;
                }
            }

            map1[c] = word;
            map2[word] = c;
        }

        return true;
    }
}
