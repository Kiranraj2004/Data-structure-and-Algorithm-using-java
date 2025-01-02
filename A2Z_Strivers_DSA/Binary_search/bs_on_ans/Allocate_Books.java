package A2Z_Strivers_DSA.Binary_search.bs_on_ans;
import java.util.*;
public class Allocate_Books {
    public static void main(String[] args) {

    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        int max=arr.get(0);
        int sum=arr.get(0);
        for(int i=1;i<arr.size();i++){
            max=Math.max(max,arr.get(i));
            sum+=arr.get(i);
        }
        int start=max,end=sum;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int partition=get_partition(arr,mid);
            if(partition>m){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    public static  int get_partition(ArrayList<Integer>arr,int mid){
        int partition=1;
        int sum=0;
        for (int i = 0; i <arr.size() ; i++) {
            if(sum+arr.get(i)>mid){
                partition++;
                sum=arr.get(i);
            }
            else{
                sum+=arr.get(i);
            }
        }
        return partition;
    }
}
