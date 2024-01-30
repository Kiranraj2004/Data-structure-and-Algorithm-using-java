package Array.Twopointer;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        int[]nums={1,1};
        System.out.println(maxArea(nums));
    }
    public static int maxArea(int[] nums) {
    int i=0;
    int j=nums.length-1;
    int max=0;
    while(i<j){
        int min=Math.min(nums[i],nums[j]);
        if (max<(min*(j-i))){
            max=(min*(j-i));
        }
        if (nums[i]<nums[j]){
            i++;
        }
        else{
            j--;
        }
    }
    return max;
    }
}
