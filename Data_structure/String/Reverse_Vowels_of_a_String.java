package String;
//https://leetcode.com/problems/reverse-vowels-of-a-string

public class Reverse_Vowels_of_a_String {
    public static void main(String[] args) {
        String s="Ui";
        System.out.println(reverseVowels(s));

    }
    public  static String reverseVowels(String s) {
         char []arr=s.toCharArray();
     int start=0,end=arr.length-1;
     while (start<=end){
         if (!is_vowels(arr[start]))start++;
         else if (!is_vowels(arr[end])) {
             end--;
         }

         else  {
             char temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
         }
     }
     return new String(arr);
    }
    public static boolean is_vowels(char s){
        char[]vowel={'a','e','i','o','u','A','E','I','O','U'};
        for (int i = 0; i < vowel.length ; i++) {
            if (s==vowel[i]){
                return true;
            }
        }
       return false;

    }
}

