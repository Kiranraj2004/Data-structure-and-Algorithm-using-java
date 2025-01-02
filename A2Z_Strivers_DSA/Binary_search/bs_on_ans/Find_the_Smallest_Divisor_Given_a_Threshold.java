package A2Z_Strivers_DSA.Binary_search.bs_on_ans;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static void main(String[] args) {

    }
    public int smallestDivisor(int[] nums, int threshold) {
        int end=max(nums);
        int start=1;
        int ans=1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int presentthreshold=findthreshold(nums,mid);
            if(presentthreshold>threshold){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    public int max(int[]nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i])max=nums[i];
        }
        return max;
    }

    public int findthreshold(int []nums,int mid){
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp+=Math.ceil((double)nums[i]/(double)mid);
        }
        return temp;
    }
}
