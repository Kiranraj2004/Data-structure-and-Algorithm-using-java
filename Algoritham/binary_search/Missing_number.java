//https://leetcode.com/problems/missing-number/
import java.util.Arrays;
public class Missing_number {
    public static void main(String[] args) {
        int []nums={0,1,3};
        System.out.println(missing_number(nums));
    }
    static int missing_number(int[]nums){
        Arrays.sort(nums);
        int n= nums.length;
        for (int i = 0; i <=n; i++) {
            if (i==n){
                return i;
            }
            if (nums[i]!=i){
                return i;
            }
        }
        return -1;
    }

}
/* solution
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers,
 so all numbers are in the
range [0,3]. 2 is the missing number in the range
 since it does not appear in nums.
 */