package String;
//https://leetcode.com/problems/longest-common-prefix
import java.util.Arrays;

public class Longest_prefix {
    public static void main(String[] args) {
        String[]strs={"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String second=strs[strs.length-1];

        int i=0;
        while (i <  first.length()){
            if (first.charAt(i)==second.charAt(i)){
                i++;
            }
            else  break;
        }
        return first.substring(0,i);
    }
}
