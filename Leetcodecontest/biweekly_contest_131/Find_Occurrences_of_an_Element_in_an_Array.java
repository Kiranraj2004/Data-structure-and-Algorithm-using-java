package Leetcodecontest.biweekly_contest_131;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_Occurrences_of_an_Element_in_an_Array {
    public static void main(String[] args) {
        int []nums={1,3,1,7};
        int[] q={1,3,2,4};
        System.out.println(Arrays.toString(occurrencesOfElement(nums,q,1)));
    }
    public  static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int []ans=new int[queries.length];
        ArrayList<Integer>temp=new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==x){
                temp.add(i);
            }
        }
        for (int j = 0; j < queries.length; j++) {
            int a=queries[j];
            if (a<=temp.size()){
                ans[j]=temp.get(a-1);
            }
            else{
                ans[j]=-1;
            }
        }
        return ans;
    }
}
