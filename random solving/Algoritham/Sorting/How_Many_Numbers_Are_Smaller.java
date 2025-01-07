package Sorting;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller {
    public static void main(String[] args) {
     int[]nums={7,7,7,7};
        System.out.println(Arrays.toString(how_many_number_are_smaller(nums)));


    }
    public static int[] how_many_number_are_smaller(int []nums){
        int[]answer=new int[nums.length];
        for (int i = 0; i <=nums.length-1 ; i++) {
            int smaller=0;
            for (int j = 0; j <=nums.length-1 ; j++) {
                if (j!=i&&nums[i]!=nums[j]&&nums[j]<nums[i]){
                    smaller+=1;
                }

            }
            answer[i]=smaller;

        }
        return answer;
    }

}
// answer=[0,0,0,0]
