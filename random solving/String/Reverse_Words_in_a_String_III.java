package String;
//https://leetcode.com/problems/reverse-words-in-a-string-iii
public class Reverse_Words_in_a_String_III {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public  static String reverseWords(String s) {
        String[]a=s.split(" ");
        for (int i = 0; i <a.length ; i++) {
            StringBuilder f=new StringBuilder(a[i]);
            a[i]= String.valueOf(f.reverse());
        }
        return String.join(" ",a);
    }
}
