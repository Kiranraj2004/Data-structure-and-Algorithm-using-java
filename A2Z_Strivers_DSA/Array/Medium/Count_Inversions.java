package A2Z_Strivers_DSA.Array.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Count_Inversions {
    public static void main(String[] args) {
        int[]arr={7 ,72 ,90, 21, 60};
        System.out.println(inversionCount2(arr));

    }
//     brute force
    static int inversionCount(int arr[]) {
        // Your Code Here
        int count=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j])count++;
            }
        }
        return count;
    }
    static int inversionCount1(int arr[]) {
        int n=arr.length;
        int count=0;
        PriorityQueue<Integer>ans=new PriorityQueue<>(Collections.reverseOrder());
        ans.add(arr[0]);
        for (int i = 1; i <n ; i++) {
            ArrayList<Integer>temp=new ArrayList<>();
            while(!ans.isEmpty()&&ans.peek()>arr[i]){
                count++;
                temp.add(ans.poll());
            }
           if(!temp.isEmpty())ans.addAll(temp);
           ans.add(arr[i]);

        }
        return count;

    }

    static int inversionCount2(int arr[]) {
        int []ans=new int[1];
        mergesort(arr,0,arr.length,ans);
        return ans[0];
    }

    private static void mergesort(int[] arr, int s, int e, int[] count) {
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        mergesort(arr,s,mid,count);
        mergesort(arr,mid,e,count);
       count[0]+= merge(arr,s,mid,e);
    }

    private static int merge(int[] arr, int s, int m, int e) {
        int []temp=new int[e-s];
        int count=0;
        int i=s,j=m,k=0;
        while(i<m&&j<e){
            if(arr[i]>arr[j]){
                temp[k]=arr[j];
                j++;
                count+=m-i;
            }
            else{
                temp[k]=arr[i];
                i++;
            }
            k++;
        }
        while (i<m){
            temp[k]=arr[i];
            i++;
            k++;

        }
        while(j<e){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l <temp.length ; l++) {
            arr[s+l]=temp[l];
        }
        return count;
    }


}
