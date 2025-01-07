//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
import javax.swing.*;

public class Maximum_count {
    public static void main(String[] args) {
        int[]nums={-2,-1,-3,-4,1,2,6,};
        System.out.println(count(nums));
    }
    static int count(int[]nums){
        int neagtive=0,positive=0;
        for (int num : nums) {
            if (num < 0) {
                neagtive++;
            }if (num>0)positive++;
//

        }
        if (neagtive>positive)return neagtive;
        else return positive;
    }
}
