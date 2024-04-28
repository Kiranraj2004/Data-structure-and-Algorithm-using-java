package Leetcodecontest.Weekly_Contest_395;

//28/04/2024
public class Find_the_Integer_added_to_Array_I {
    public static void main(String[] args) {
        int []num1={10};
        int[]num2={5};
        System.out.println(addedInteger(num1,num2));
    }
    public static  int addedInteger(int[] nums1, int[] nums2) {
        int sum1=0;
        for(int i:nums1){
            sum1+=i;
        }
        int sum2=0;
        for(int i:nums2){
            sum2+=i;
        }
        return (sum2-sum1)/nums1.length;

    }
}
