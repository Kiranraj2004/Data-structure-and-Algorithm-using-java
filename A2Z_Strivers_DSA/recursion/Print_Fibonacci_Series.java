package A2Z_Strivers_DSA.recursion;

import java.util.Arrays;

public class Print_Fibonacci_Series {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateFibonacciNumbers(3)));
    }
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
//        using loop
        int []r=new int[n];
//        int first=0;
//        int second=1;
//        for (int i = 0; i <n ; i++) {
//            int sum=first+second;
//            r[i]=first;
//            first=second;
//            second=sum;
//        }
//        return r;
        for (int i = 0; i <n ; i++) {
            r[i]=fact(i);
        }
        return r;
    }
    static int fact(int n){
        if (n<=1){
            return n;
        }
        return fact(n-1)+fact(n-2);
    }

}
