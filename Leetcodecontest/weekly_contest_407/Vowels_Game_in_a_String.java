package Leetcodecontest.weekly_contest_407;
import java.util.*;
public class Vowels_Game_in_a_String {
    public static void main(String[] args) {

    }
    public boolean doesAliceWin(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');


        int totalVowels = 0;
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                totalVowels++;
            }
        }
        return totalVowels != 0;
    }
}
