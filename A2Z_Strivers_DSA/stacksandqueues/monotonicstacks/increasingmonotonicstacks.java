package A2Z_Strivers_DSA.stacksandqueues.monotonicstacks;

import java.util.Stack;

public class increasingmonotonicstacks {
    public static void main(String[] args) {
        int []arr={1, 4, 5, 3, 12, 10};
        Stack<Integer>res=new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            while (!res.isEmpty()&&res.peek()>arr[i]){
                res.pop();
            }
                res.push(arr[i]);
        }
        System.out.println(res);
    }
}
