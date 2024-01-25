package Array;
//this is practice sum of prefix and suffix
import java.util.Arrays;

class NumArray {
    int []nums;
    public NumArray(int[] nums) {
        this.nums= new int[nums.length];
        this.nums[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            this.nums[i]=nums[i]+this.nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        if(left==0){
            return this.nums[right];
        }
        return this.nums[right]-this.nums[left-1];
    }

}
public class Range_Sum_Query_Immutable {
    public static void main(String[] args) {
        int []nums={-2, 0, 3, -5, 2, -1};
        NumArray obj=new NumArray(nums);
        System.out.println(Arrays.toString(obj.nums));
        System.out.println(obj.sumRange(0,2));
    }
}
