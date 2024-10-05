package A2Z_Strivers_DSA.Array;
 import java.util.HashMap;
public class Longest_Sub_Array_with_Sum_K {
    public static void main(String[] args) {
        System.out.println(lenOfLongSubarr1(new int[]{10,5,0,0,2,7,1,9},8,15));
    }

//     this is used method for positive and negative number
    public static int lenOfLongSubarr(int a[], int n, int k) {
        // Complete the function
        // size of the array.

        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = k-sum ;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

//     this is used only for number which is greater than equal to 0
    public static int lenOfLongSubarr1(int nums[], int i1, int k) {
        // Complete the function
        int n=nums.length;
        int max=0;
        int sum=0;
        int i=0,j=0;
        while(j<n){
            while(i<=j&&nums[j]+sum>k){
                sum-=nums[i];
                i++;
            }
            // add the element
            sum+=nums[j];
            if(sum==k){
                max=Math.max(max,(j-i)+1);
            }
            j++;
        }
        return max;
    }
}
