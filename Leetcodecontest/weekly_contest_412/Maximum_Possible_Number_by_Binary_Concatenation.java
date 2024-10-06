package Leetcodecontest.weekly_contest_412;

public class Maximum_Possible_Number_by_Binary_Concatenation {
    public static void main(String[] args) {
        Maximum_Possible_Number_by_Binary_Concatenation obj=new Maximum_Possible_Number_by_Binary_Concatenation();
        System.out.println(obj.maxGoodNumber((new int[]{3,1,2})));
    }
    public int maxGoodNumber(int[] nums) {
        return helper(nums,0);
    }
    public int helper(int[]nums,int index){
        if(index==nums.length-1){
            return maxnumber(nums);
        }
        int max=0;
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            max=Math.max( max,helper(nums,i+1));
            swap(nums,index,i);
        }
        return max;
    }
    public void swap(int []nums,int s,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
    public int maxnumber(int[]nums){
        StringBuilder binaryConcat = new StringBuilder();

        for (int num : nums) {
            binaryConcat.append(Integer.toBinaryString(num));
        }

        // Convert concatenated binary string to an integer value
        return Integer.parseInt(binaryConcat.toString(), 2);

    }
}
