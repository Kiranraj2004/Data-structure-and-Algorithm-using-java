package Array.preffix;

public class Find_Pivot_Index {
    public static void main(String[] args) {
        int []nums={-1,-1,0,1,1,0};
        System.out.println(pivotIndex(nums));
    }
    public  static int  pivotIndex(int[] nums) {
        int[]sufix=new int[nums.length];
        sufix[nums.length-1]=nums[nums.length-1];
        for (int i = nums.length-2; i >=0 ; i--) {
            sufix[i]=nums[i]+sufix[i+1];
        }
        for (int i = 1; i <nums.length ; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
        for (int i = 1; i < nums.length ; i++) {
            if (i==1&&sufix[i]==0){
                return 0;
            } else if (i==nums.length-1&&nums[i-1]==0) {
                return i;
            } else if (nums[i-1]==sufix[i+1]) {
                return i;
            }
        }
      return -1;
    }
}
