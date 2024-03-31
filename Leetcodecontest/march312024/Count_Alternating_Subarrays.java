package Leetcodecontest.march312024;

//solved two question before the end of contest  this was third question
// i solved after 8 minutes of end of contest
public class Count_Alternating_Subarrays {
    public static void main(String[] args) {
        int []arr={1,0,1,0};
        System.out.println(countAlternatingSubarrays(arr));

    }
    public static long countAlternatingSubarrays(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        long count=1;
        int n=nums.length;
        int start=0;
        int end=1;
        while(end<n){
            if(nums[end]==nums[end-1]&&start<end) start = end;
            count+=1+(end-start);
            end++;
        }
        return count;

    }
}
