package Leetcodecontest.weekly_contest_398;

import java.util.Arrays;
import java.util.HashMap;

public class Special_Array_II {
    public static void main(String[] args) {
        int []arr={2,7,2};
        int [][]q={{0,0},{1,2}};
        System.out.println(Arrays.toString(isArraySpecial(arr,q)));

    }
    public  static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[]res=new boolean[queries.length];
        HashMap<Integer,Boolean>t=new HashMap<>();
        int prev=nums[0]%2;
        for(int i=1;i<nums.length;i++){
            int current=nums[i]%2;
            if(prev==current){
               t.put(i,false);
            }
            prev=current;
        }
        for (int i = 0; i < queries.length ; i++) {
            int s=queries[i][0];
            boolean temp=false;
            if (s==queries[i][1]){
                res[i]=true;
                continue;
            }
            for(int j:t.keySet()){
                if (j>s&&j<=queries[i][1]){
                    res[i]=false;
                    temp=true;
                    break;
                }
            }
            if (!temp){
                        res[i]=true;
                    }

        }

//        for (int i = 0; i < queries.length ; i++) {
//            int s=queries[i][0];
//            boolean temp=false;
//                    int prev=nums[s]%2;
//                    for(int k=s+1;k<=queries[i][1];k++){
//                        int current=nums[k]%2;
//                        if(prev==current){
//                            res[i]=false;
//                            temp=true;
//                            break;
//                        }
//                        prev=current;
//                    }
//                    if (!temp){
//                        res[i]=true;
//                    }
//        }
        return res;

    }
}
