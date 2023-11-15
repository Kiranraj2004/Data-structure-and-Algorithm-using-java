//https://leetcode.com/problems/remove-element/
public class Remove_element {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2 ,3,1, 2 ,4 ,3,4 };
        System.out.println(removeElement(nums,1));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
