package String;
//https://leetcode.com/problems/goal-parser-interpretation
public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String command="G()()()()(al)";
        System.out.println(interpret(command));
    }
    public static  String interpret(String c) {
        StringBuilder answer=new StringBuilder();
        for (int i = 0; i <c.length() ; i++) {
            if (c.charAt(i)=='('&&c.charAt(i+1)==')'){
                answer.append('o');
            }
           else if (c.charAt(i)=='('&&c.charAt(i+1)=='a'){
                answer.append("al");
            } else if (c.charAt(i)=='G') {
               answer.append('G');
            }
        }
       return answer.toString();
    }
}
