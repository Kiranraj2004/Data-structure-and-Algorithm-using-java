package Algoritham.Sorting;

import java.util.Arrays;

public class practice_of_cyclic_sort {
    public static void main(String[] args) {
        int[]nums={4,2,1,3};
        numberstartfrom1(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void numberstartfrom0(int[]nums){
        int i=0;
        while (i<nums.length){
            int count=nums[i];
            if (count!=i){
                swap(nums,count,i);
            }
            else{
                i++;
            }
        }
    }
    public static void numberstartfrom1(int[]nums){
        int i=0;
        while (i<nums.length){
            int count=nums[i]-1;
            if (count!=i){
                swap(nums,count,i);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int []nums,int a,int b){
//        this is the swapping method using math operation
        nums[a]=nums[a]-nums[b];
        nums[b]=nums[b]+nums[a];
        nums[a]=nums[b]-nums[a];
/*
        this is the basic swapping technique
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        this the swapping method using bit manipulation
        nums[a]=nums[a]^nums[b];
        nums[b]=nums[b]^nums[a];
        nums[a]=nums[b]^nums[a];
*/
    }
}
