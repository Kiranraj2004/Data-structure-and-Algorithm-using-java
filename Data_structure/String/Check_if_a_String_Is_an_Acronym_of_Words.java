package String;
//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words
import java.util.*;

public class Check_if_a_String_Is_an_Acronym_of_Words {
    public static void main(String[] args) {

        List<String>word= Arrays.asList("cat","19","new");
        List<String> words = List.of("alice","bob","charlie");
        String s="abc";
        System.out.println(isAcronym(words,s));
        System.out.println();

    }

    public static boolean isAcronym(List<String> words, String s) {
       StringBuilder answer=new StringBuilder();
        for (String name : words) {
            answer.append(name.charAt(0));
        }
       String a= answer.toString();
        return a.equals(s);
    }
}
