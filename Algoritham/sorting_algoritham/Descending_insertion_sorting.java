package Sorting;

import java.util.Arrays;

public class Descending_insertion_sorting {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        insertion_sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion_sorting(int[]arr){
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = i-1; j< arr.length-1 ; j++) {
                if (arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else break;

            }

        }

    }
}
