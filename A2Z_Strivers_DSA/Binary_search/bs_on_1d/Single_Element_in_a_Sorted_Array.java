package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {
        int []a={1,1,2,2,3,3,4,4,8};
        System.out.println(singleNonDuplicate(a));

    }
    public static  int singleNonDuplicate(int[] nums) {
        int start=0;
        int end =nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid%2==1){
                if(nums[mid-1]==nums[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }

            }
            else{
                if(mid-1>=0&&nums[mid-1]==nums[mid]){

                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return nums[end];
    }
}
