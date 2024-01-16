package binary_search;

public class Find_Peak_Element {
    public static void main(String[] args) {
        int[]arr={10};
        System.out.println(findPeakElement(arr));

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
}
