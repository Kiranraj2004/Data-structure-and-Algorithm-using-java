package array;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits
public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[]nums={12,345,2,6,789};
        System.out.println(findNumbers(nums));
    }
    public  static int findNumbers(int[] nums) {
     int count=0;
        for (int i = 0; i < nums.length ; i++) {
            int numberofdigits=0;
            while(nums[i]!=0){
                numberofdigits++;
                nums[i]/=10;
            }
            if (numberofdigits%2==0)count++;

        }

        return count;
    }
}
