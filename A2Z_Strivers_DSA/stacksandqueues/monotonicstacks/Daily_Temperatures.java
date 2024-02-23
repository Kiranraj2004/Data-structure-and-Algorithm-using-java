package A2Z_Strivers_DSA.stacksandqueues.monotonicstacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Daily_Temperatures {
    public static void main(String[] args) {
        int[]nums={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(nums)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        HashMap<Integer,Integer>temp=new HashMap<>();
        Stack<Integer>res=new Stack<>();
        for (int i = temperatures.length-1; i >=0 ; i--) {
            while (!res.isEmpty()&&temperatures[i]>res.peek()){
                res.pop();
            }
            int data=temperatures[i];
            if (!res.isEmpty()){
                temperatures[i]=temp.get(res.peek())-i;

            }else{
                temperatures[i]=0;
            }
            res.push(data);
            temp.put(data,i);
        }
        return temperatures;
    }
}
