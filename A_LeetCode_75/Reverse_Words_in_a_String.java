package A_LeetCode_75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] split = s.split(" ");
        System.out.println(Arrays.toString(split));
        int start=0;
        int end= split.length-1;
        while (start<end){
            String temp=split[start];
            split[start]=split[end];
            split[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(split));
        StringBuffer res=new StringBuffer();
        List<String>e=new ArrayList<>();

        for (String value : split) {
            if (!value.equals("")) {
                res.append(value);
                res.append(" ");
            }
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
