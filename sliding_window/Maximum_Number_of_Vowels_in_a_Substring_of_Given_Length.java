package sliding_window;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public static void main(String[] args) {
        String s="abciiidef";
        System.out.println(maxVowels(s,3));
    }
    public  static int maxVowels(String s, int k) {
        int max=0;
        int window=0;
        StringBuffer o=new StringBuffer("aeiou");
        for (int i = 0; i <k ; i++) {
            if (vowel(s.charAt(i))){
                window++;
            }
        }
        max=window;
        for (int end = k; end <s.length() ; end++) {
            if (vowel(s.charAt(end-k))){
                window--;
            }
            if (vowel(s.charAt(end))){
                window++;
            }
            max=Math.max(max,window);
        }
         return max;
    }
    public static boolean vowel(char s){
        return (s=='a'||s=='e'||s=='i'||s=='o'||s=='u');
    }
}
