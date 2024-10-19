package A2Z_Strivers_DSA.Array.Easy;
import java.util.*;
public class Missing_Number {
    public static void main(String[] args) {

    }

//     brute force method
    public static int missingNumber(int[] nums) {
        HashSet<Integer>ans=new HashSet<>();
        for(int i:nums)ans.add(i);
        for(int i=0;i<=nums.length;i++){
            if(!ans.contains(i)){
                return i;
            }
        }
        return -1;
    }
//    Tc O(2N) sc O(N)

//    optimal 1 summation method
    public static int missingNumber1(int[] nums) {
        int n=nums.length;
        int originalsum=(n*(n-1))/2;
        int arraysum=0;
        for(int i:nums){
            arraysum+=i;
        }
        return originalsum-arraysum;
    }
//    tc O(n) sc O(1)

    //    optimal 1 xor method
    public static int missingNumber2(int[] nums) {
//        Now, let’s XOR all the numbers between 1 to N.
        int xor1=0;
//        Let’s XOR all the numbers in the given array.
        int xor2=0;
        for (int i = 0; i <nums.length ; i++) {
            xor1=xor1^i;
            xor2=xor2^nums[i];
        }
        xor1^=nums.length;
        return xor1^xor2;

    }
//    tc O(n) sc O(1)


}
