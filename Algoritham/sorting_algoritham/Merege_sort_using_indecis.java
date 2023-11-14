import java.util.Arrays;

// merge sort for ascending order using recursion
public class Merege_sort_using_indecis {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesort(int[]arr,int s,int e){
       if ((e-s)==1){
           return;
       }
       int mid=(s+e)/2;
       mergesort(arr,s,mid);
       mergesort(arr,mid,e);
        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr,int s,int mid,int e) {
        int[]mix=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while (i< mid&&j< e){
            if (arr[i]>arr[j]){
                mix[k]=arr[j];
                j++;
            }
            else {
                mix[k]=arr[i];
                i++;
            }
            k++;
        }
        while (i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l <mix.length; l++) {
            arr[l+s]=mix[l];
        }
    }
}
