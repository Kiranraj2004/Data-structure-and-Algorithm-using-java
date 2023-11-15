package String;
//https://leetcode.com/problems/length-of-last-word
import java.util.Arrays;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s="hello world     ";
      String a=  Arrays.toString(s.split(" "));
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int length=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                if (length > 0) return length;
            }
        }
        return length;
    }
}
