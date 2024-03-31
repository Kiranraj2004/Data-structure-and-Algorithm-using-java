package Leetcodecontest.march312024;

public class Harshad_Number {
    public static void main(String[] args) {
        System.out.println(sumOfTheDigitsOfHarshadNumber(23));
    }
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=x;
        int sum=0;
        while (x!=0){
            int rem=x%10;
            sum+=rem;
            x/=10;
        }
        if (a%sum==0)return sum;
    return -1;
    }
}

