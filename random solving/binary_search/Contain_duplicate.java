import java.util.Arrays;

public class Contain_duplicate {
    public static void main(String[] args) {
        int[]nums={1,2,3,1};
        System.out.println(contain_duplicate(nums));
    }
    static boolean contain_duplicate(int []nums){
        Arrays.sort(nums);
        for (int i = 0; i <=nums.length-1 ; i++) {
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
