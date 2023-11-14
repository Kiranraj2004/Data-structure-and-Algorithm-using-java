package Sorting;

import java.util.Arrays;

public class Descending_bubble_sorting {
    public static void main(String[] args) {
        int []arr={4,5,3,2,1};
        descending_bubble_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void descending_bubble_sort(int []arr){
        for (int i = 0; i < arr.length ; i++) {
            boolean swap=false;
            for (int j = arr.length-1; j >i ; j--) {
                if (arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }

            }
            if (!swap)break;

        }
    }
}
