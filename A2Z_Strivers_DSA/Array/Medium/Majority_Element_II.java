package A2Z_Strivers_DSA.Array.Medium;
import java.util.*;
public class Majority_Element_II {
    public static void main(String[] args) {

    }

//     brute force method using hashing
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int min_req=(int)(nums.length/3);
        List<Integer>ans=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)>min_req){
                ans.add(i);
            }
        }
        return ans;
    }
//    TC O(2*N) SC O(N)


//     optimal solution Boyer-Moore Voting Algorithm
    public List<Integer> majorityElement1(int[] nums) {
        int n=nums.length;
        int count1=0,count2=0;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(count1==0&&nums[i]!=ele2){
                count1=1;
                ele1=nums[i];
            }
            else if(count2==0&&nums[i]!=ele1){
                count2=1;
                ele2=nums[i];
            }
            else if(nums[i]==ele1)count1++;
            else if(nums[i]==ele2)count2++;
            else{
                count1--;
                count2--;
            }
        }
        int min_freq=(int)n/3;
        count1=0;count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1)count1++;
            if(nums[i]==ele2)count2++;
        }
        List<Integer>ans=new ArrayList<>();
        if(count1>min_freq)ans.add(ele1);
        if(count2>min_freq)ans.add(ele2);
        return ans;

    }
    //    TC O(2*N) SC O(1)
}
