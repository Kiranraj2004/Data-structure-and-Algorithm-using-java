package Recursion;
//https://leetcode.com/problems/power-of-three
public class Power_of_three {
    public static void main(String[] args) {
        int n=9;
        System.out.println(isPowerOfThree(n));
    }
    public  static boolean isPowerOfThree(int n) {
        if (n==1)return true;
        if (n%3!=0||n==0)return false;
        return isPowerOfThree(n/3);
    }
}
