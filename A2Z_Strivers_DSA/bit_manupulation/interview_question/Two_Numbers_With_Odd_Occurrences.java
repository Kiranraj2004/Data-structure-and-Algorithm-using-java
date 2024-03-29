package A2Z_Strivers_DSA.bit_manupulation.interview_question;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Numbers_With_Odd_Occurrences {
    public static void main(String[] args) {
        int []arr={2,2,4,4,3,5};
        System.out.println(Arrays.toString(twoOddNum(arr)));
    }
    public static int[] twoOddNum(int []arr){
        // Write your code here.
//        brute force method O(n)TC and O(n)SC
//        int []res=new int[2];
//        HashMap<Integer,Integer>s=new HashMap<>();
//        for (int i = 0; i <arr.length ; i++) {
//            if (s.containsKey(arr[i])){
//                s.put(arr[i],s.get(arr[i])+1);
//            }
//            else{
//                s.put(arr[i],1);
//            }
//        }
//        int i=0;
//        for(int k:s.keySet()){
//            if(s.get(k)%2==1){
//               res[i++]=k;
//            }
//        }
//        if(res[0]<res[1]){
//            res[0]=res[0]^res[1];
//            res[1]=res[0]^res[1];
//            res[0]=res[0]^res[1];
//        }
//        return res;

      int xor=0;
        for (int j : arr) {
            xor ^= j;
        }
        int right =xor&-xor;
        int group1=0;
        int group2=0;
        for(int i:arr){
            if((i&right)!=0){
                group1^=i;
            }else{
                group2^=i;
            }
        }

        return new int[]{group1,group2};
    }
}
