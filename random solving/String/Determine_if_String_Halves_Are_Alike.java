package String;
//https://leetcode.com/problems/determine-if-string-halves-are-alike
public class Determine_if_String_Halves_Are_Alike {
    public static void main(String[] args) {
        String s=" textbook";
        System.out.println(halvesAreAlike(s));
    }
    public  static boolean halvesAreAlike(String s) {
        int a=0,b=0;
        for (int i = 0; i <s.length()/2 ; i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
            s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U' )a++;
            int f=s.length()-1-i;
            if (s.charAt(f)=='a'||s.charAt(f)=='e'||s.charAt(f)=='i'||s.charAt(f)=='o'||s.charAt(f)=='u'||
                    s.charAt(f)=='A'||s.charAt(f)=='E'||s.charAt(f)=='I'||s.charAt(f)=='O'||s.charAt(f)=='U' )b++;
        }
        return a==b;
    }
}
