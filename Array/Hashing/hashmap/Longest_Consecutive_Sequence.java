package Array.Hashing.hashmap;
//i solved this question in 1 hour
import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[]nums={9,1,-3,2,4,8,3,-1,6,-2,-4,7};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer>cons=new HashSet<>();
        for (int num : nums) {
            cons.add(num);
        }
        int count=0;
        int i=0;
        while(i<nums.length){
            if (!cons.contains(nums[i]-1)){
                int index=0;
                while (cons.contains(nums[i]+index)){
                    index++;
                }
                if (count<index){
                    count=index;
                    if (count>(nums.length/2))return count;
                }
            }
            i++;
        }
       return count;
    }
}
