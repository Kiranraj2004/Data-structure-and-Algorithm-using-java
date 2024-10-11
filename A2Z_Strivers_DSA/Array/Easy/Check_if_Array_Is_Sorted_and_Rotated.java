package A2Z_Strivers_DSA.Array.Easy;

public class Check_if_Array_Is_Sorted_and_Rotated {
    public static void main(String[] args) {

    }
//    optimal solution
    public boolean check(int[] nums) {
        int min=nums[0];
        int i=1;
        while(i<nums.length&&nums[i]>=nums[i-1]){
            i++;
        }
        if(i<nums.length&&nums[i]>min)return false;
        i++;
        while(i<nums.length){
            if(nums[i]>=nums[i-1]&&nums[i]<=min){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
//    sc-O(1), tc-O(n)
    public boolean check1(int[] nums) {
        int count=0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]<nums[i-1]){
                count++;
            }
        }
        if(nums[0]<nums[nums.length-1])count++;
        return count>1;
    }
}
