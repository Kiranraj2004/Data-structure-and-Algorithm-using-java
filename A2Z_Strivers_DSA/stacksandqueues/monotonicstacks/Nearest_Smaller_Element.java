package A2Z_Strivers_DSA.stacksandqueues.monotonicstacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Nearest_Smaller_Element {
    public static void main(String[] args) {
//        int[]nums={1,5,2,10,8};
        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(1,5,2,10,8));
        System.out.println(prevSmaller(nums));
}
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer>res=new Stack<>();
        ArrayList<Integer>arr=new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            while (!res.isEmpty()&&A.get(i)<res.peek()){
                res.pop();
            }
            if (!res.isEmpty()){
                arr.add(i,res.peek());
            }
            else{
                arr.add(i,-1);
            }
            res.push(A.get(i));
        }
        return arr;
    }
}
