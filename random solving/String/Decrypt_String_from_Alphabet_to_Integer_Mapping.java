package String;
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping
public class Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static void main(String[] args) {
        String s="10#11#12";
        System.out.println(freqAlphabets(s));

    }
    public static String freqAlphabets(String s) {
        StringBuilder answer=new StringBuilder();
        for (int i = s.length()-1; i>=0; i--) {
            int number;
            if (s.charAt(i)=='#'){
                number=(s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0');
                i-=2;
            } else {
                number=s.charAt(i)-'0';
            }
            answer.append((char)(number+96));
        }
    return  answer.reverse().toString();
    }
}
