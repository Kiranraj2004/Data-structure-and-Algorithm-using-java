package A2Z_Strivers_DSA.bit_manupulation;

public class Divide_Two_Integers {
    public static void main(String[] args) {
//        System.out.println(Math.round(8.95));
        System.out.println(divideTwoInteger(-10,3));
    }
    public static int divideTwoInteger(int dividend, int divisor) {
        // Write your code here.
//        brute force method
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1))
            return Integer.MAX_VALUE;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        int count=0;
       dividend= Math.abs(dividend);
       divisor= Math.abs(divisor);
        while(dividend>=divisor){
            dividend-=divisor;
            count++;
        }
        count*=sign;
        return count;
    }
}
