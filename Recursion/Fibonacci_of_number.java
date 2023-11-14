package Recursion;
//https://leetcode.com/problems/fibonacci-number
public class Fibonacci_of_number {
    public static void main(String[] args) {
        int fibbo=2;
        for (int i = 0; i <=fibbo ; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
    static int fibonacci(int n){
        if (n<2){
            return n;
        }
      return fibonacci(n-1)+fibonacci(n-2);

    }
}
