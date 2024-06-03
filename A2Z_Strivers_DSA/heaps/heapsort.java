package A2Z_Strivers_DSA.heaps;

import java.util.Arrays;

public class heapsort {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,2,1};
        System.out.println(Arrays.toString(arr));

        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
//    TC:O(NlogN)
//    sc :O(1)
    public static void sort(int[]arr){
        for (int i = arr.length/2-1; i >=0 ; i--) {
            hepify(arr,i, arr.length-1);
        }
        int n=arr.length-1;
        while(n>1){
            int temp=arr[n];
            arr[n]=arr[0];
            arr[0]=temp;
            hepify(arr,0,n-1);
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
            hepify(arr,largest,n);
        }
    }
}
