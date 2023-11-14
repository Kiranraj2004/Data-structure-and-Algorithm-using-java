package Sorting;

public class Missing_number_2 {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i]<nums.length&&nums[i] != i) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int index = 0; index <=nums.length-1 ; index++) {
            if (nums[index]!=index)return index;

        }
        return nums.length;

    }
}
