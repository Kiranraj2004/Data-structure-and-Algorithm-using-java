import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
       int[]nums={20,13,56,78,92,10};
       quicksort(nums,0,nums.length-1);
       System.out.println(Arrays.toString(nums));
    }
    public static void quicksort(int[]nums,int low,int high){
        if (low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];

        while (start<=end){
            while (nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if (start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        quicksort(nums,low,end);
        quicksort(nums,start,high);
    }
}
