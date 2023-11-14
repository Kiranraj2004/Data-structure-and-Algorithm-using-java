package Recursion;
//https://leetcode.com/problems/reverse-string/solutions
import java.util.Arrays;

public class Reverse_of_string_using_recursion {
    public static void main(String[] args) {
        char[]s={'h','e','y','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        solve(s,0,s.length-1);
    }

    public static void solve(char[] s, int start, int end) {
        if (start<end)return;
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;

        solve(s,++start,--end);

    }
}
