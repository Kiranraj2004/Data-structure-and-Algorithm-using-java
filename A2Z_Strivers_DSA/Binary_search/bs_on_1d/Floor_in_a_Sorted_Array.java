package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

public class Floor_in_a_Sorted_Array {
    public static void main(String[] args) {
        int []arr={1, 2, 8, 10, 11, 12, 19};
        System.out.println(findFloor(arr,20));

    }
     public static int findFloor(int[] arr, int k) {
        // write code here
         int s=0;
         int e=arr.length-1;

         while(s<=e){
             int mid=e-(e-s)/2;
             if(arr[mid]==k){
                 return mid;
             }
             else if(arr[mid]>k)e=mid-1;
             else s=mid+1;
         }
         return e;
    }

//    tc O(logn) sc O(1)

    public static int lowerBound(int []arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
}
