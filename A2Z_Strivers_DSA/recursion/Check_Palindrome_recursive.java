package A2Z_Strivers_DSA.recursion;

public class Check_Palindrome_recursive {
    public static void main(String[] args) {
        String s="racecer";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return helper(0,str.length()-1,str);
    }
    static boolean helper(int start,int end,String s){
        if (start>end){
            return true;
        }
        if (s.charAt(start)==s.charAt(end)){
            return helper(++start,--end,s);
        }
          else {
            return false;
        }
    }
}
