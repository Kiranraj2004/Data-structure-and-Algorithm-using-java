package sorting_algoritham;

import java.util.Arrays;

public class Ascending_bubble_sort {
    public static void main(String[] args) {
        int[]nums={3,-3,0,-6,1,-2};
        bublesort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void bublesort(int[]nums){
        for (int i = 0; i <nums.length ; i++) {
            boolean swap=false;
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j] < nums[j-1]) {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swap=true;
                }

            }
            if (!swap)break;

        }
    }
}
// answer [-6, -3, -2, 0, 1, 3]
