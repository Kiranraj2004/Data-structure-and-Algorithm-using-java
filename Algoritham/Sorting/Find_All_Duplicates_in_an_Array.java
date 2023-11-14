package Sorting;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.List;
import java.util.ArrayList;
public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int[]nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public  static List<Integer> findDuplicates(int[] nums) {
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
                answer.add(nums[index]);
            }

        }
        return answer;
    }
}
