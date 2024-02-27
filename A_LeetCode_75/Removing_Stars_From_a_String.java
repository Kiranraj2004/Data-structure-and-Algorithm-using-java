package A_LeetCode_75;

import java.util.Stack;

public class Removing_Stars_From_a_String {
    public static void main(String[] args) {
        String s="ferase*****";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
//        Stack<Character>res=new Stack<>();
//        for (int i = 0; i <s.length() ; i++) {
//            if (s.charAt(i)=='*'){
//                res.pop();
//            }
//            else{
//                res.push(s.charAt(i));
//            }
//        }
//        StringBuffer n=new StringBuffer();
//        for (Character re : res) {
//            n.append(re);
//        }
//        return n.toString();
        StringBuffer n=new StringBuffer();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='*'){
                n.deleteCharAt(n.length()-1);
            }
            else{
                n.append(s.charAt(i));
            }
        }
        return n.toString();
    }
}
