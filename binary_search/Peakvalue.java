package binary_search;

public class Peakvalue {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(index(nums));
    }

    public static int index(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid=0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid==nums.length-1)return mid;
            if (nums[mid] >nums[mid-1]&&nums[mid]>nums[mid+1]) {
                return mid;
            }
            if (nums[mid]>nums[mid-1] ) {
              start=mid+1;
            }if (nums[mid]<nums[mid-1])end=mid-1;
        }
        return -1;
    }
}
