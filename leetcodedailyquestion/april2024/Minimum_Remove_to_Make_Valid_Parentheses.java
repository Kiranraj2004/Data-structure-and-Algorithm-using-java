package leetcodedailyquestion.april2024;

import java.util.Stack;

//6/4/2024
public class Minimum_Remove_to_Make_Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid( "lee(t(c)o)de)"));

    }
    public static String minRemoveToMakeValid(String s) {
        StringBuffer res=new StringBuffer();
        Stack<Integer>r=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='('){
                r.push(i);
            }else if(s.charAt(i)==')'){
                if (!r.isEmpty()&&s.charAt(r.peek())=='('){
                    r.pop();
                }
                else{
                    r.push(i);
                }
            }
        }
        for (int i = s.length()-1; i >=0 ; i--) {
            if (!r.isEmpty()&&r.peek()==i){
                r.pop();
            }
            else{
                res.append(s.charAt(i));
            }

        }
        return res.reverse().toString();

    }
}
