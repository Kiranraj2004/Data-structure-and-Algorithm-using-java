package leetcodedailyquestion.march2024;

public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        int[]arr={10,5,2,6};
        System.out.println(numSubarrayProductLessThanK(arr,100));

    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
        int s=0,e=0,count=0;
    int product=1;
    while(e<nums.length){
        product*=nums[e];
        while(product>=k){
            product/=nums[s++];
        }
        count+=1+(e-s);
        e++;
    }
    return count;
    }
}
