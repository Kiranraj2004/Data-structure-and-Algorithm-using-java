package A2Z_Strivers_DSA.heaps;

import java.util.Arrays;

public class heapsort {
    public static void main(String[] args) {
        int[]arr={-5,-2};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
//    TC:O(NlogN)
//    sc :O(1)
    public static void sort(int[]arr){
        int n=arr.length-1;
        while(n>0){
            hepify(arr,0,n);
            int temp=arr[n];
        arr[n]=arr[0];
        arr[0]=temp;
        n--;
        }

    }
    public static void hepify(int[]arr,int i,int n){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if (left<=n&&arr[largest]<arr[left]){
            largest=left;
        }
        if (right<=n&&arr[largest]<arr[right]){
            largest=right;
        }
        if (largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
        }
    }
}
