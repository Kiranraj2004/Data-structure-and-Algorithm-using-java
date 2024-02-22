package A2Z_Strivers_DSA.stacksandqueues.monotonicstacks;

import java.util.Stack;

public class Monotonic_Decreasing_Stack {
    public static void main(String[] args) {
        int[] arr={15, 17, 12, 13, 14, 10};
        Stack<Integer>res=new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            while (!res.isEmpty()&&res.peek()<arr[i]){
                res.pop();
            }
            res.push(arr[i]);
        }
        System.out.println(res);
    }
}
