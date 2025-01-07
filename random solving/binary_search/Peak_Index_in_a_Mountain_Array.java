package binary_search;

public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        int[]arr={0,1,2,3,10};
        System.out.println(peakIndexInMountainArray(arr));

    }
    public  static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
          if (arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
              return mid;
          }
          if (arr[mid]>arr[mid-1]){
              start++;
          }
          else end--;
        }
     return -1;
    }
}
