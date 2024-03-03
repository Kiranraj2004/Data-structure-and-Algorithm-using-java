package A2Z_Strivers_DSA.stacksandqueues.postfix_prefix_infix;

import java.util.Stack;

public class prefix_to_postfix {
    public static void main(String[] args) {
        String s="-/A+BC*DE";
        System.out.println(preToPost(s));
    }
    public static String preToPost(String s) {
        // Write Your Code Here
//        StringBuffer a=new StringBuffer(s);
//        a.reverse();
        Stack<String>res=new Stack<>();
        String d="+-/*";
        for (int i = s.length()-1; i >=0 ; i--) {
            if (d.indexOf(s.charAt(i))==-1){
                res.push(String.valueOf(s.charAt(i)));
            }
            else{
                StringBuffer r=new StringBuffer();
                r.append(res.pop());
                r.append(res.pop());
                r.append(s.charAt(i));
                res.push(r.toString());
            }
        }
        return res.pop();
    }
}
