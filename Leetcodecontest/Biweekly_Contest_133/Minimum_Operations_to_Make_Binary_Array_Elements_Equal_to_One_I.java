package Leetcodecontest.Biweekly_Contest_133;

public class Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I {
    public static void main(String[] args) {

    }
    public int minOperations(int[] nums) {
        int count=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==0){
                count++;
                if(i+2<nums.length){
                    flip(nums,i);
                    flip(nums,i+1);
                    flip(nums,i+2);
                }
                else{
                    return -1;
                }
            }
            i++;
        }
        return count;

    }
    public void flip(int []nums,int i){
        if(nums[i]==0){
            nums[i]=1;
        }else{
            nums[i]=0;
        }
    }
}
