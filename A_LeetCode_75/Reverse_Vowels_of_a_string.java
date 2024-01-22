package A_LeetCode_75;


//third question of 75 question based on two pointer
public class Reverse_Vowels_of_a_string {
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(reverseVowels(s));
    }
    public  static String reverseVowels(String s) {
        int  start=0;
        int end=s.length()-1;
        String temp="aeiouAEIOU";
        StringBuffer res=new StringBuffer(s);
        while (start<=end){
            if (temp.indexOf(s.charAt(start))==-1){
                start++;
            } else if (temp.indexOf(s.charAt(end))==-1) {
                end--;
            }
            else {
              char t=s.charAt(start);
              res.setCharAt(start,s.charAt(end));
              res.setCharAt(end,t);
              start++;
              end--;
            }
        }
        return res.toString();
    }
}
