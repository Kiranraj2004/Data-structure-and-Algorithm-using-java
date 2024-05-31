package A2Z_Strivers_DSA.heaps;

import java.util.Arrays;

public class hepify {
    public static void main(String[] args) {
        int[]arr={54,57,56,53,51};
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length/2-1; i >=0 ; i--) {
            hepifyfunction(arr,i);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void hepifyfunction(int[] arr, int i) {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if (left<arr.length&&arr[left]>arr[largest]){
            largest=left;
        }
        if (right<arr.length&&arr[right]>arr[largest]){
            largest=right;
        }
        if (largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            hepifyfunction(arr,largest);
        }
    }

}
