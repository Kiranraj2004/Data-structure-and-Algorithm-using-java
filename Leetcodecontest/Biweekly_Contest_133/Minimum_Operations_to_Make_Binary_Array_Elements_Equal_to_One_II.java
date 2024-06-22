package Leetcodecontest.Biweekly_Contest_133;

public class Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_II {
    public static void main(String[] args) {

    }
    public int minOperations(int[] nums) {
        int count=0;
        int i=0;
        int f=0;
        while(i<nums.length){
            if (f%2!=0){
                flip(nums,i);
            }
            if(nums[i]==0){
                count++;
               f++;
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
