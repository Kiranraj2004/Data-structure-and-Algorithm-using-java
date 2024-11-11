package A2Z_Strivers_DSA.Array.Medium;
import java.util.*;

public class _4Sum {
    public static void main(String[] args) {
        int[] a={1000000000,1000000000,1000000000,1000000000};
        _4Sum obj=new _4Sum();
        System.out.println(obj.fourSum1(a,-294967296));
//        System.out.println(Integer.MAX_VALUE);
    }

//     brute force method
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<ArrayList<Integer>>s=new HashSet<>();
        int n=nums.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = j+1; k <n ; k++) {
                    for (int l = k+1; l <n ; l++) {
                        int sum=nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum==target){
                            ArrayList<Integer>temp=new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            Collections.sort((temp));
                            if(!s.contains(temp))s.add(temp);
                        }
                    }

                }
            }
        }
        return new ArrayList<>(s);
    }
    public List<List<Integer>> fourSum1(int[] nums, int target) {
        Set<ArrayList<Integer>>s=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=nums[i]+nums[j] ;
                    sum+=nums[k]+nums[l];

                    if(sum==target){
                        ArrayList<Integer>temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        if(!s.contains(temp))s.add(temp);
                        k++;
                        l--;
                        while(k<l&&nums[k]==nums[k-1])k++;
                        while(k<l&&nums[l]==nums[l+1])l--;
                    } else if (sum<target) {
                        k++;
                    }
                    else{
                        l--;
                    }


                }

            }

        }
        return new ArrayList<>(s);
    }
}
