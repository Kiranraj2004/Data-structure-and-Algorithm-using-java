package String;
//https://leetcode.com/problems/valid-palindrome
public class Valid_Palindrome {
    public static void main(String[] args) {
        String s="0p";
        System.out.println(isPalindrome(s));
    }
    public  static boolean isPalindrome(String s) {
        String k=s.toLowerCase();
        int start=0;
        int end=k.length()-1;
        while (start<end){
            int a=(int)k.charAt(start);
            int d=(int)k.charAt(end);
            if ((a<97&&a>57) || a>122 ||a<48 ) start++;
            else if  ((d<97&&d>57)|| d>122 ||d<48 ){
                end--;
            }

               else if (k.charAt(start)!=k.charAt(end)){
                    return false;}

               else{ start++;
                end--;}
            }
        return true;
        }

    }


