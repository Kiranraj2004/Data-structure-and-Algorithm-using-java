package Array.preffix;

public class Find_Pivot_Index {
    public static void main(String[] args) {
        int []nums={-1,-1,1,1,0,0};
        System.out.println(pivotIndex(nums));
    }
    public  static int  pivotIndex(int[] nums) {
//        int[]sufix=new int[nums.length];
//        sufix[nums.length-1]=nums[nums.length-1];
//        for (int i = nums.length-2; i >=0 ; i--) {
//            sufix[i]=nums[i]+sufix[i+1];
//        }
//        for (int i = 1; i <nums.length ; i++) {
//            nums[i]=nums[i]+nums[i-1];
//        }
//        if (sufix[1]==0){
//            return 0;
//        }
//        for (int i = 1; i < nums.length-1 ; i++) {
//
//            if (nums[i-1]==sufix[i+1]) {
//                return i;
//            }
//        }
//
//         if(nums[nums.length-2]==0) {
//            return nums.length-1;
//        }
//        return -1;
                int rightSum = 0;
                for (int num : nums) rightSum += num;

                int leftSum = 0;
                for (int i = 0; i < nums.length; i++) {
                    rightSum -= nums[i];
                    if (leftSum == rightSum)
                        return i;
                    leftSum += nums[i];
                }
                return -1;
    }
}
