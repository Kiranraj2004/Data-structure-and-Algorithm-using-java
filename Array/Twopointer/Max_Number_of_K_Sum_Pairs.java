package Array.Twopointer;

import java.util.Arrays;

public class Max_Number_of_K_Sum_Pairs {
    public static void main(String[] args) {
        int[]nums={3,1,3,4,3};
        System.out.println(maxOperations(nums,6));

    }
    public  static int maxOperations(int[] nums, int k) {

        int i=0;
        int count=0;
        int filterindex=0;
        for (int l = 0; l <nums.length ; l++) {
            if (nums[i]<k){
                nums[filterindex++]=nums[i];
            }
        }
        Arrays.sort(nums,0,filterindex);
        int j=filterindex-1;
        while (i<j){
            if ((nums[j]+nums[i])==k){
                count++;
                i++;
                j--;
            }
            else if (nums[i]+nums[j]<k){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}
