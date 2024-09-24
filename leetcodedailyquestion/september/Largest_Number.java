package leetcodedailyquestion.september;

import java.util.*;

public class Largest_Number {
    public static void main(String[] args) {

    }
    public String largestNumber(int[] nums) {
        // Convert the integers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort using a custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare based on concatenated strings
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Sort in descending order
            }
        });
        Arrays.sort(strNums,(a,b)->(b+a).compareTo(a+b));

        // If the largest number is "0", return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Concatenate the sorted numbers to form the largest number
        StringBuilder ans = new StringBuilder();
        for (String num : strNums) {
            ans.append(num);
        }

        return ans.toString();
    }
}
