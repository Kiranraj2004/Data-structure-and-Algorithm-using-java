package Sorting;

public class Sqrt {
    public static void main(String[] args) {
        int x=2147395599;
        System.out.println(mySqrt(x));
    }
    public  static int mySqrt(int x) {
        if (x==0){
            return 0;
        }
        int start=1;
        int end=x;
        while (start<=end){
            int mid=start+(end-start)/2;
            long square= (long) mid * mid;
            if (square>x){
                end=mid-1;
            }
           else if (square<x){
                start=mid+1;
            } else if (mid*mid==x) {
                return mid;
            }

        }
        return start-1;
    }
}
