package leetcodedailyquestion.april2024;
//4/4/2024
import java.util.Stack;

public class Maximum_Nesting_Depth_of_the_Parentheses {
    public static void main(String[] args) {
        String s="(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));

    }
    public static int maxDepth(String s) {
        Stack<Character>res=new Stack<>();
        int length=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='('){
                res.add('(');
            }
            else if(s.charAt(i)==')'){
                res.pop();
            }
            length=Math.max(length,res.size());
        }
        return length;

    }

}
