package A2Z_Strivers_DSA.string.medium;
import java.util.*;
public class Maximum_Nesting_Depth_of_the_Parentheses {
    public static void main(String[] args) {

    }
    public int maxDepth(String s) {
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

    public int maxDepth1(String s) {
        int ans=0;
        int count=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                count++;
            }
            else if(i==')'){
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }

}
