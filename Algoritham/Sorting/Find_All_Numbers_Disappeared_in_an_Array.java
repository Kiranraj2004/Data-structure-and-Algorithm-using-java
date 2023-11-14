package Sorting;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int []nums={1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]&&nums[i]!=i+1){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }

        }
        List<Integer>answer=new ArrayList<Integer>();
        for (int index = 0; index <nums.length ; index++) {
            if (nums[index]!=index+1){
                answer.add(index+1);
            }

        }
        return answer;

    }

}
