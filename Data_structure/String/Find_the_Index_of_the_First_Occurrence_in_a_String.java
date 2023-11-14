package String;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        String haystack="mississippi";
        String needle="issipi";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
             if (haystack.length()<needle.length()){
                 return -1;
             }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i)==needle.charAt(0)){
                int last=i+needle.length();
                int start=i;
                int j=0;
                while (start<last&&last<=haystack.length()){
                    if (haystack.charAt(i+j)==needle.charAt(j)){
                        j++;
                    }else break;
                    start++;
                }
                if (j==needle.length()){
                    return i;
                }
            }

        }
        return -1;

    }
}
