package sliding_window;
//this problem takes O(n)
public class slidewindowmethod {
    public static void main(String[] args) {
        int[]nums={1,9,-1,-2,7,3,-1,2};
        int k=4;
        int maxsum=0;
        int windowsum=0;
        for (int i = 0; i <k ; i++) {
            windowsum+=nums[i];
        }
        maxsum=windowsum;
        for (int end = k; end < nums.length ; end++) {
            windowsum+=nums[end]-nums[end-k];
            maxsum=Math.max(windowsum,maxsum);
        }
        System.out.println(maxsum);
    }
}
