package A2Z_Strivers_DSA.Array;
//https://leetcode.com/problems/next-permutation/
public class Next_Permutation {
    public static void main(String[] args) {

    }
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot!=-1){
            for(int i=nums.length-1;i>pivot;i--){
                if(nums[i]>nums[pivot]){
                    int temp=nums[i];
                    nums[i]=nums[pivot];
                    nums[pivot]=temp;
                    swap(nums,pivot+1,nums.length-1);
                    return;
                }

            }

        }
        swap(nums,0,nums.length-1);
    }
    public void swap(int[]nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

    }
}
