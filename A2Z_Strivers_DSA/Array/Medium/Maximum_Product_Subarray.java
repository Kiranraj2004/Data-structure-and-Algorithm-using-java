package A2Z_Strivers_DSA.Array.Medium;

public class Maximum_Product_Subarray {
    public static void main(String[] args) {
        Maximum_Product_Subarray obj=new Maximum_Product_Subarray();
        int []arr={-3,0,1,-2};
        System.out.println(obj.maxProduct(arr));

    }

//     brute force method
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            int sum=nums[i];
            max=Math.max(nums[i],max);
            for (int j = i+1; j <nums.length ; j++) {
                sum*=nums[j];
                max=Math.max(sum,max);
            }
        }
        return max;
    }
//    tc O(n**2) sc O(1);

//     optimal solution 1
    public int maxProduct1(int[] nums) {
        int max=Integer.MIN_VALUE;
        int pre=1;
        int suf=1;
        for (int i = 0; i <nums.length ; i++) {
            if(pre==0)pre=1;
            if(suf==0)suf=1;
            pre*=nums[i];
            suf*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(pre,suf));
        }
        return max;
    }
    //    tc O(n) sc O(1);
}
