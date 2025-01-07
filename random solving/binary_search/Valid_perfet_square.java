//https://leetcode.com/problems/valid-perfect-square/
public class Valid_perfet_square {
    public static void main(String[] args) {
        int nums=4;
        System.out.println(isperfectsquare(nums));
    }
    public static boolean isperfectsquare(int nums){
        if (nums==1)  return true;
        int start=1;
        int mid=-1;
        int end=nums;
        while(start<=end){
            mid=start+(end-start)/2;

            if ((long)mid*mid==(long)nums){
                return true;
            }
            if ((long)mid*mid>(long)nums){
                end=mid-1;
            }
            else start=mid+1;
        }
        return false;
    }
}
