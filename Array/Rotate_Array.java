package array;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[]nums={1};
        rotate(nums,2);
        System.out.println(Arrays.toString(nums));
    }
    public  static void rotate(int[] nums, int k) {

//        if(k>nums.length){
//            k%=nums.length;
//        }
//        int[] temp =new int[nums.length];
//        int j=0;
//        for (int i = nums.length-k; i <nums.length ; i++) {
//            temp[j]=nums[i];
//            j++;
//        }
//        for (int i = 0; i <nums.length-k; i++) {
//            temp[j]=nums[i];
//            j++;
//        }
//        for (int i = 0; i < temp.length ; i++) {
//            nums[i]=temp[i];
//        }
        int n= nums.length;
       k%=n;
       reverse(nums,0,n-k-1);
       reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

    }

    private static void reverse(int[] nums, int s, int e) {
        while (s<=e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            e--;
            s++;
        }
    }
}
