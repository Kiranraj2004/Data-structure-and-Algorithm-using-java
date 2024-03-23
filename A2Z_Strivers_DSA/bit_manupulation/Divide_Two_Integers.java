package A2Z_Strivers_DSA.bit_manupulation;

public class Divide_Two_Integers {
    public static void main(String[] args) {
//        System.out.println(Math.round(8.95));
        System.out.println(divideTwoInteger(-2147483648,9));
    }
    public static int divideTwoInteger(int dividend, int divisor) {
        // Write your code here.
//        brute force method
//        if ((dividend == Integer.MIN_VALUE && divisor == -1))
//            return Integer.MAX_VALUE;
////        if (dividend==Integer.MIN_VALUE&&divisor==1)return Integer.MIN_VALUE;
//        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
//        int count=0;
//       int a= Math.abs(dividend);
//       int b= Math.abs(divisor);
//        while(a>=b){
//            a-=b;
//            count++;
//        }
//        count*=sign;
//        return count;

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Sign of the result
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        // Convert both dividend and divisor to positive
        int dividendAbs = Math.abs(dividend);
        int divisorAbs = Math.abs(divisor);

        // Initialize the quotient
        int quotient = 0;

        // Subtract divisor from dividend until dividend becomes less than divisor
//        while (dividendAbs - divisorAbs >= 0) {
//            int tempDivisor = divisorAbs;
//            int count = 1;
//            while (dividendAbs - (tempDivisor << 1) >= 0) {
//                tempDivisor <<= 1;
//                count <<= 1;
//            }
//            dividendAbs -= tempDivisor;
//            quotient += count;
//        }
        while(dividendAbs-divisorAbs>=0){
            int count=0;
            while(dividendAbs-(divisorAbs<<count+1)>=0){
                count++;
            }
            quotient+=(1<<count);
            dividendAbs-=(divisorAbs<<count);
        }

        // Apply sign to the quotient
        return sign * quotient;

    }
}
