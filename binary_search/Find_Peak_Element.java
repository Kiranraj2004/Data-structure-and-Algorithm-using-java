package binary_search;

public class Find_Peak_Element {
    public static void main(String[] args) {
        int[]arr={1,2,1,3,5,6,4};
        System.out.println(findPeakindex(arr));

    }
    public static int findPeakElement(int[] nums) {
        int start=0;
        int end= nums.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if (nums[mid]<nums[mid+1]){
                start++;
            }
            else end--;
        }
     return start;
    }
    public static int findPeakindex(int[] nums) {
        int start=0;
        int end= nums.length-1;
        int mid;
        while(start<end){
            mid=start+(end-start)/2;
            if (nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
