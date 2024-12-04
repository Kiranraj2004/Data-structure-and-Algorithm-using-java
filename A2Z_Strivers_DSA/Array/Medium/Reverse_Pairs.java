package A2Z_Strivers_DSA.Array.Medium;

public class Reverse_Pairs {
    public static void main(String[] args) {
        int []arr={2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        Reverse_Pairs obj=new Reverse_Pairs();
        System.out.println(obj.reversePairs2(arr));

    }

//    brute force method
    public int reversePairs(int[] nums) {
        int n=nums.length;
        int count=0;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(nums[i]>2*nums[j])count++;
            }
        }
        return count;
    }
    
    
//     optimal solution 

    public int reversePairs2(int[] nums) {
        int []ans=new int[1];
         mergesort(nums,0,nums.length,ans);
         return ans[0];
    }

    private void mergesort(int[] nums, int s, int e, int[] ans) {
        if(e-s==1)return;
        int mid=(s+e)/2;
        mergesort(nums,s,mid,ans);
         mergesort(nums,mid,e,ans);
         ans[0]+=countinvertion(nums,s,mid,e);
        merge(nums,s,mid,e);
    }

    private int countinvertion(int[] nums, int s, int mid, int e) {
        int count=0;
        int right=mid;
        for (int i = s; i <mid; i++) {
            while(right<e&&nums[i]>2L * nums[right])right++;
            count+=(right-mid);
        }
        return count;
    }

    private int merge(int[] arr, int s, int m, int e) {
        int []temp=new int[e-s];
        int i=s,j=m,k=0;
        int count=0;
        while(i<m&&j<e){
            if(arr[i]>=arr[j]){
                temp[k]=arr[j];
                j++;
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
