package String;
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent
public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[] word1={"ab","c"};
        String[] word2={"abc"};
        System.out.println( arrayStringsAreEqual(word1,word2));

    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String one=String.join("",word1);
       String two=String.join("",word2);

        return one.equals(two);

    }
}
