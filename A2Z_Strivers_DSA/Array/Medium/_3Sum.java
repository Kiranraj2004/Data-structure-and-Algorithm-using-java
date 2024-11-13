package A2Z_Strivers_DSA.Array.Medium;

import java.util.*;

public class _3Sum {
    public static void main(String[] args) {

    }

//     brute force method
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = j+1; k <n ; k++) {
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        List<Integer>temp=new ArrayList<>() ;
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        if(!ans.contains(temp))ans.add(temp);
                    }
                }
            }
        }
        return ans;
    }
//    TC O(n**3) SC O(2*n)

    public List<List<Integer>> threeSum2(int[] nums) {

        int n=nums.length;
        Set<List<Integer>>s=new HashSet<>();
        for (int i = 0; i <n ; i++) {
            HashSet<Integer>map=new HashSet<>();
            for (int j = i+1; j <n ; j++) {
                int required=-(nums[i]+nums[j]);
                if(map.contains(required)){
                    List<Integer>temp=new ArrayList<>() ;
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(required);
                    Collections.sort(temp);
                    s.add(temp);
                }
                else{
                    map.add(nums[j]);
                }
            }
        }
        return   new ArrayList<>(s);
    }

//     optimal solution
    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        Set<List<Integer>>s=new HashSet<>();
        int i=0;
        while(i<n-2){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer>temp=new ArrayList<>() ;
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                   s.add(temp);
                    j++;
                    k--;
                    while (j < k &&nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (sum<0) {
                    j++;

                }
                else{
                    k--;
                }

            }
            i++;
        }
        return new ArrayList<>(s);
    }
    //    TC O(n**2) SC O(no. of quadruplets)
}
