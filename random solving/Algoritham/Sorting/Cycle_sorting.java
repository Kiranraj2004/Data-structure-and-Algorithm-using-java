package Sorting;

import java.util.Arrays;

public class Cycle_sorting {
    public static void main(String[] args) {
        int[]nums={4,2,1,3};
        cycle_sorting(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void cycle_sorting (int[]nums){
        int i=0;
//        when number start from 0  to N then
//          while (i<nums.length){
//            int correct=nums[i];
//            if (nums[i]!=i){
//                int temp=nums[i];
//                nums[i]=nums[correct];
//                nums[correct]=temp;
//            }else{
//                i++;
//            }
//        the below program is for when number start from 1 to N
        while (i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=i+1){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }

        }
    }

}
