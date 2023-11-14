package Sorting;

import java.util.Arrays;

public class Ascending_selection_sorting {
    public static void main(String[] args) {
        int[]arr={-1,0,3,6,5,-4};
        ascending_selection_sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void ascending_selection_sorting(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            int start=0;
            int last=arr.length-i-1;
           int maximum= max(arr,start,last);
           int temp=arr[maximum];
           arr[maximum]=arr[last];
           arr[last]=temp;


        }
    }
    public static int max(int[]arr,int start,int last){
        int max=0;

        for (int i = start; i <=last ; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
