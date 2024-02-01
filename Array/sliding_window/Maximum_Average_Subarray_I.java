package Array.sliding_window;

public class Maximum_Average_Subarray_I {
    public static void main(String[] args) {
        int[]nums={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
    public static double findMaxAverage(int[] nums, int k)  {
        double average;
        double windowaverage=0;
        for (int i = 0; i <k ; i++) {
            windowaverage+=nums[i];
        }
        average=(windowaverage/k);
        for (int end = k; end < nums.length ; end++) {
            windowaverage+=nums[end]-nums[end-k];
            average= Math.max(average, (windowaverage / k));
        }
       return average;
    }
}
