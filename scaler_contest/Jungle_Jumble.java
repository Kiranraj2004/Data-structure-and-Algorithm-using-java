package scaler_contest;

import java.util.Stack;

public class Jungle_Jumble {
    public static void main(String[] args) {
        String s="NNS";
        System.out.println(solve(s));
    }
    public static int solve(String A) {
        Stack<Character>res=new Stack<>();
        int count=0;
        for (int i = 0; i <A.length() ; i++) {
            if(res.isEmpty()){
                res.push(A.charAt(i));
                continue;
            }
            if (res.peek()==A.charAt(i)){
                res.push(A.charAt(i));
                continue;
            }
           boolean a=(A.charAt(i)=='N'||A.charAt(i)=='S')?false:true;
            while(true) {
                if (res.isEmpty())break;
                boolean b = (res.peek() == 'N' || res.peek() == 'S') ? false : true;
                if ((a ^ b)) {
                    res.push(A.charAt(i));
                    break;
                }
                res.pop();
                count++;
            }
        }
        return count-1;
    }
}
