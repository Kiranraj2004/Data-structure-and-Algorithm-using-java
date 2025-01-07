package Algoritham.Sorting;
import java.util.Arrays;
public class practesing_the_algoritham {
    public static void main(String[] args) {
        int[]nums={5,4,3,2,1};
//        bublesortasecending(nums);
//        bublesortdesecending(nums);
//        insertion_ascending_sorting(nums);
//        insertion_descending_sorting(nums);

        selection_sorting_asecnding(nums);
        selection_sorting_desecnding(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void bublesortasecending(int[]nums){
        for (int i = 0; i <nums.length ; i++) {
            boolean temp=false;
            for (int j = 1; j <nums.length-i ; j++) {
                if (nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                    temp=true;
                }
            }
            if (!temp)break;
        }
    }
    public static void bublesortdesecending(int[]nums){
        for (int i = 0; i <nums.length ; i++) {
            boolean temp=false;
            for (int j = 1; j <nums.length-i ; j++) {
                if (nums[j]>nums[j-1]){
                    swap(nums,j,j-1);
                    temp=true;
                }
            }
            if (!temp)break;
        }
    }

    public static void insertion_ascending_sorting(int[]nums){
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if (nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    public static void insertion_descending_sorting(int[]nums){
        for (int i = 0; i <nums.length ; i++) {
            for (int j = nums.length-i-1; j < nums.length-1 ; j++) {
                if (nums[j]<nums[j+1]){
                    swap(nums,j,j+1);
                }else{
                    break;
                }
            }
        }
    }
    public static void selection_sorting_asecnding(int[]nums){
        for (int i = 0; i <nums.length ; i++) {
            int index=min(nums,i);
            if (index!=i)
                swap(nums,i,index);
        }
    }
    public static void selection_sorting_desecnding(int[]nums){
        for (int i = 0; i <nums.length ; i++) {
            int index=max(nums,i);
            if (index!=i)
                swap(nums,i,index);
        }
    }
    public static int max(int[]nums,int start){
        int max=start;
        for (int i = start; i <nums.length ; i++) {
            if (nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
    public static int min(int[]nums,int start){
        int min=start;
        for (int i = start; i <nums.length ; i++) {
            if (nums[min]>nums[i]){
                min=i;
            }
        }
        return min;
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
