package A2Z_Strivers_DSA.recursion;

import java.util.Arrays;

public class merge_sort_without_using_extra_space {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(Arrays.toString(arr));
        merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static public void merge(int[]arr,int s,int e){
        if (e-s==0){
            return ;
        }
        int mid=(e+s)/2;
        merge(arr,s,mid);
       merge(arr,mid+1,e);
        sort(arr,s,mid+1,e+1);
    }

    private static void sort(int[] arr, int s,int m,int e) {
        int[]ans=new int[e-s];
        int l=s;
        int r=m;
        int k=0;
        while(l<m&&r<e){
          if (arr[l]<arr[r]){
              ans[k]=arr[l];
              l++;
          }
          else{
              ans[k]=arr[r];
              r++;
          }
            k++;
        }
        while(l<m){
            ans[k]=arr[l];
            k++;
            l++;

        }
        while(r<e){
            ans[k]=arr[r];
            k++;
            r++;
        }
        for (int i = 0; i <ans.length ; i++) {
            arr[i+s]=ans[i];
        }
    }
}
