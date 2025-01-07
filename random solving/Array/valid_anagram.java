package Array;
import java.util.Arrays;
public class valid_anagram {
    public static void main(String[] args) {
        String s="cat";
        String r="car";
        System.out.println(isAnagram(s,r));

    }
    public  static boolean isAnagram(String s, String t) {
        char[]sr=s.toCharArray();
        char[]tr=t.toCharArray();
        Arrays.sort(sr);
        Arrays.sort(tr);
        return Arrays.equals(sr,tr);

    }
}
