package stacks;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public  static String removeDuplicates(String s) {
        Stack<Character>res=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if (res.isEmpty()){
                res.push(s.charAt(i));
            }
            else{
                if (s.charAt(i)==res.peek()){
                    res.pop();
                }
                else{
                    res.push(s.charAt(i));
                }
            }

        }
        StringBuilder string = new StringBuilder();
//        while (!res.isEmpty()) {
//            string.append(res.pop());
//        }
        for (Character re : res) {
            string.append(re);
        }
//        string.reverse();
        return string.toString();
    }
}
