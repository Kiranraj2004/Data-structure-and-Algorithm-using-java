package stacks;

import java.util.Stack;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
       String s="(()())";
        System.out.println(removeOuterParentheses(s));
    }
//    public static  String removeOuterParentheses(String s) {
//        Stack<Character>temp=new Stack<>();
//        StringBuffer res=new StringBuffer();
//        for (int i = 0; i <s.length(); i++) {
//            if (s.charAt(i)=='('){
//                if (!temp.isEmpty()){
//                    res.append('(');
//                }
//                temp.push('(');
//            }
//            else{
//                temp.pop();
//                if (!temp.isEmpty()){
//                    res.append(')');
//                }
//            }
//        }
//        return res.toString();
//    }
    public static String removeOuterParentheses(String s) {
        StringBuffer res=new StringBuffer();
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='('&&count==0){
                count++;
        }
            else if(s.charAt(i)=='('&&count>0){
                res.append('(');
                count++;
            }
            else if(s.charAt(i)==')'&&count>1){
                res.append(')');
                count--;
            }
            else if(s.charAt(i)==')'&&count==1){
                count--;
            }
    }
        return res.toString();
}

}
