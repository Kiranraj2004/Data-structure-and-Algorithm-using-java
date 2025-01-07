package Sorting;

import java.util.Arrays;

public class Descending_selection_sorting {
    public static void main(String[] args) {
    int[]arr={5,4,3,1,2,0};
    descending_selection_sorting(arr);
    System.out.println(Arrays.toString(arr));

}
    public static void descending_selection_sorting(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            int last=arr.length-1;
            int maximum= max(arr, i,last);

            int temp=arr[maximum];
            arr[maximum]=arr[i];
            arr[i]=temp;


        }
    }
    public static int max(int[]arr,int start,int last){
        int max=start;

        for (int i = start; i <=last ; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
