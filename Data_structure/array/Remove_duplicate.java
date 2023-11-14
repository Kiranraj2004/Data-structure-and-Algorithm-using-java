//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Remove_duplicate {
    public static void main(String[] args) {
        int[]nums={1,1,2,5};
        System.out.println(j(nums));
    }
    public static int j(int []nums){
        int j=1;
        for (int i = 1; i <nums.length ; ++i) {
            if (nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }

        }
        return j;

    }
}
