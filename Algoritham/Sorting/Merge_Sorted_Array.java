package Sorting;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args){
        int[] nums1={0};
        int[]nums2={1};
        merge(nums1,0,nums2,1);
        System.out.println(Arrays.toString(nums1));

    }
    public  static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int start = m; start <nums1.length ; start++) {
            nums1[start]=nums2[n-1];
            n--;
        }
        Arrays.sort(nums1);
    }
}
