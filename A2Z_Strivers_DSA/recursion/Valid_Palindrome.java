package A2Z_Strivers_DSA.recursion;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        return helper(0,s.length()-1,s);
    }
    static boolean helper(int start,int end,String s){
        if(start>end){
            return true;
        }
        int a=(int)s.charAt(start);
        int d=(int)s.charAt(end);
        if ((a<97&&a>57) || a>122 ||a<48 ) return helper(++start,end,s);
        else if  ((d<97&&d>57)|| d>122 ||d<48 ){
            return helper(start,--end,s);
        }
       if (s.charAt(start)==s.charAt(end)){
           return helper(++start,--end,s);
       }
       return false;
    }
}
