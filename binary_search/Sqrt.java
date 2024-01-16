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

}

