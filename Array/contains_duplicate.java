package Array;
import java.util.HashSet;


public class contains_duplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,1};
        System.out.println(duplicate(nums));
    }
    static boolean duplicate(int[]nums){
        HashSet<Integer>s=new HashSet<>();
        for (int num : nums) {
            if (s.contains(num)) {
                return true;
            }
            s.add(num);
        }
        return false;
    }
}
