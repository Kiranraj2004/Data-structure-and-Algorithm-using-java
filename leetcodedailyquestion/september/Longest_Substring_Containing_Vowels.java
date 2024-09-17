package leetcodedailyquestion.september;
import java.util.*;
public class Longest_Substring_Containing_Vowels {
    public static void main(String[] args) {
        Longest_Substring_Containing_Vowels obj=new Longest_Substring_Containing_Vowels();
        System.out.println(obj.findTheLongestSubstring1("bcabca"));
    }
    public int findTheLongestSubstring(String s) {
        int[] vowels = new int[5];
        Map<String, Integer> map = new HashMap<>();
        map.put("00000", -1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a') vowels[0]++;
            if (ch == 'e') vowels[1]++;
            if (ch == 'i') vowels[2]++;
            if (ch == 'o') vowels[3]++;
            if (ch == 'u') vowels[4]++;

            String key = "" + (vowels[0] % 2) + (vowels[1] % 2) + (vowels[2] % 2) +
                    (vowels[3] % 2) + (vowels[4] % 2);

            if (map.containsKey(key)) {
                maxLength = Math.max(maxLength, i - map.get(key));
            } else {
                map.put(key, i);
            }
        }

        return maxLength;
    }
    public int findTheLongestSubstring1(String s) {
        int prefixXOR = 0;
        int[] characterMap = new int[26];
        characterMap['a' - 'a'] = 1;
        characterMap['e' - 'a'] = 2;
        characterMap['i' - 'a'] = 4;
        characterMap['o' - 'a'] = 8;
        characterMap['u' - 'a'] = 16;
        int[] mp = new int[32];
        for (int i = 0; i < 32; i++) mp[i] = -1;
        int longestSubstring = 0;
        for (int i = 0; i < s.length(); i++) {
            prefixXOR ^= characterMap[s.charAt(i) - 'a'];
            if (mp[prefixXOR] == -1 && prefixXOR != 0) mp[prefixXOR] = i;
            longestSubstring = Math.max(longestSubstring, i - mp[prefixXOR]);
        }
        return longestSubstring;
    }
}
