package A2Z_Strivers_DSA.recursion;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[]nums={21,13,10,56,78,22,10};
        quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quicksort(int[]arr,int low,int high){
        if (low<high){
          int partion=  part(arr,low,high);
          quicksort(arr,low,partion-1);
          quicksort(arr,partion+1,high);
        }
    }

    private static int  part(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i<j){
            while(i<=high&&arr[i]<=pivot){
                i++;
            }
            while (j>=low&&arr[j]>pivot){
                j--;
            }
            if (i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }

}
