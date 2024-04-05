package A2Z_Strivers_DSA.recursion;

import java.util.Arrays;

public class Print_Fibonacci_Series {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(generateFibonacciNumbers(4)));
//        System.out.println(fact(4));

        System.out.println(memoizedFact(4,new int[5]));
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


    public static int[] optimlgenerateFibonacciNumbers(int n) {
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = memoizedFact(i, new int[n]);
        }
        return r;
    }

    static int memoizedFact(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        return memo[n] = memoizedFact(n - 1, memo) + memoizedFact(n - 2, memo);
    }


}
