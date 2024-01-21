package A_LeetCode_75;
// question number 1 on two pointer
public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        String word1="abc";
        String word2="pqrs";
        System.out.println(mergeAlternately(word1,word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder res=new StringBuilder();
        int j=0;
        int i=0;
        while(i<word1.length()&&j<word2.length()){
            res.append(word1.charAt(i));
            res.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<word1.length()){
            res.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            res.append(word2.charAt(j));
            j++;
        }
    return res.toString();
    }
}
