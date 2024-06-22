package Leetcodecontest.Biweekly_Contest_133;

public class Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three {
    public static void main(String[] args) {

    }
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i:nums){
            if(i%3!=0){
                count++;
            }
        }
        return count;
    }
}
