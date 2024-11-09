package A2Z_Strivers_DSA.Array.Medium;
import java.util.*;
public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {

    }

//     Q1 ) returning the longest sub array who's sum= k
//    https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
// brute force method
    public static int getLongestSubarray(int []a, long k) {
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            long s = 0; // Sum variable
            for (int j = i; j < n; j++) { // ending index
                // add the current element to
                // the subarray a[i...j-1]:
                s += a[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }
//    TC O(n**2) , sc O(1)
//    optimal solution (using hashing)
    public static int getLongestSubarray1(int []a, long k) {
        int len=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
            if(sum==k){
                len=i+1;
            }
            int diff= (int) ((int)sum-k);
            if (map.containsKey(diff)){
                len=Math.max(len,i-map.get(diff));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        return len;

    }
    //    TC O(n) , sc O(n)
//    optimal using two pointer
    public static int getLongestSubarray2(int []a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }


// Q2 )   Problem Statement: Given an array of integers and an integer k,
//    return the total number of subarrays whose sum equals k.

//    brute force method
    public int subarraySum1(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k)count++;
            }
        }
        return count;

    }
//     tc O(n**2) sc O(1)

//     optimal solution ( which uses prefix sum concept)
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i:nums){
            sum+=i;
            int diff=sum-k;
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;

    }
    //     tc O(n) sc O(2)

}
