package Array.Twopointer;
import java.util.*;
public class Sum_3 {
    public static void main(String[] args) {
     int[]nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
   List<List<Integer>>res=new ArrayList<>();
   Arrays.sort(nums);
   int i=0;
   while(i<nums.length-2){
       int j=nums.length-1;
       int k=i+1;
       while (k<j){
           int sum=nums[i]+nums[j]+nums[k];
           if (sum==0){
               if (!(res.contains(new ArrayList<>(List.of(nums[i],nums[j],nums[k]))))){
               res.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
               }
               j--;
               k++;
           }
           else if(sum<0){
               k++;
           }
           else{
               j--;
           }
       }
       i++;
   }
   return res;
    }
}
