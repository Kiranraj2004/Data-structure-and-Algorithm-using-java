package A2Z_Strivers_DSA.string.Easy;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {

    }
    public String removeOuterParentheses(String s) {
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
