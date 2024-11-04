package A2Z_Strivers_DSA.Array;
import java.util.*;
public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {

    }

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
