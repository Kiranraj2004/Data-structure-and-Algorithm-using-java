package Recursion;
//https://leetcode.com/problems/power-of-two
public class Power_of_Two {
    public static void main(String[] args) {
        int num=10;
        System.out.println(isPowerOfTwo(num));
    }
    public static boolean isPowerOfTwo(int n) {
       if (n==1)return true;
       if (n%2!=0||n==0)return false;
       isPowerOfTwo(n/2);
       return false;
    }

}
