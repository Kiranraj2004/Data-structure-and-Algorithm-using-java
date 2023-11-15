package String;
//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word
public class Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public static void main(String[] args) {
        String[] patterns={"a","a","a","d"};
        String word="ab";
        System.out.println(numOfStrings(patterns,word));
    }
    public  static int numOfStrings(String[] patterns, String word) {
        int count=0;
        for (String i:patterns) {
            if (word.contains(i)){
                count++;
            }
        }
        return count;
    }
}
