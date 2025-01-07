package Recursion;
//https://leetcode.com/problems/power-of-four
public class Power_of_four {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOffour(n));

    }
    public  static boolean isPowerOffour(int n) {
        if (n==1)return true;
        if (n%4!=0||n==0)return false;
        return isPowerOffour(n/4);
    }
}
