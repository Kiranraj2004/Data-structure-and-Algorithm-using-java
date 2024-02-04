package binary_search;

//https://leetcode.com/problems/sqrtx/
public class Sqrt {
    public static void main(String[] args) {
        int nums=128;

        System.out.println(sqrt(nums));
    }
    static int sqrt(int nums){
        if (nums==1||nums==0)  return nums;
        int start=1;
        int mid=-1;
        int end=nums;
        while(start<=end){
            mid=start+(end-start)/2;

            if ((long)mid*mid==(long)nums){
                return mid;
            }
            if ((long)mid*mid>(long)nums){
                end=mid-1;
            }
            else start=mid+1;
        }
        return end;
    }
    public int mySqrt(int x) {
        if(x==1)return x;
        int start=0;
        int end=x;
        int mid=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            long s= (long) mid *mid;
            if(s==(long)x){
                return mid;
            }
            else if(s>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return end;
    }

}

