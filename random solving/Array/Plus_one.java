import com.sun.source.tree.BreakTree;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/
public class Plus_one {
    public static void main(String[] args) {

       int [] digits={5,4,9};
        System.out.print(Arrays.toString(plus_one(digits)));

    }
    public static int[]plus_one(int[]digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
