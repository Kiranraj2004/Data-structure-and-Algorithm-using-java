package Array.sliding_window;

import java.util.HashSet;

public class Contains_Duplicate_II {
    public static void main(String[] args) {
        int[]nums={1};
        System.out.println(containsNearbyDuplicate(nums,3));

    }
    public  static boolean containsNearbyDuplicate(int[] nums, int k) {
        int start=0;
        HashSet<Integer>elements=new HashSet<>();
        for (int i = 0; i <=k&&i<nums.length; i++) {
            if (elements.contains(nums[i])){
                return true;
            }else{
                elements.add(nums[i]);
            }
        }
        for (int end=k+1; end <nums.length ; end++) {
            elements.remove(nums[start]);
            start++;
            if (elements.contains(nums[end])){
                return true;
            }else{
                elements.add(nums[end]);
            }
        }
     return false;
    }
}
