package A2Z_Strivers_DSA.bit_manupulation.interview_question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Single_Number_II {
    public static void main(String[] args) {
        int[]arr={2,2,2,3};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {

////        brute force method which take O(2n)TC and O(N)SC
//        HashMap<Integer,Integer>res=new HashMap<>();
//        for (int i = 0; i <nums.length ; i++) {
//            if(res.containsKey(nums[i])){
//                res.put(nums[i],res.get(nums[i])+1);
//            }else{
//                res.put(nums[i],1);
//            }
//        }
////        Iterator<Integer>s=res.keySet().iterator();
////        while(s.hasNext()){
////            System.out.println(res.get( s.next()));
////        }
//        for(int n:res.keySet()){
//            if (res.get(n)==1){
//                return n;
//            }
//        }
//        return -1;

//        this is the second method which take O(32*n)TC and O(1)Sc using bit wise operator
//        int ans=0;
//        for (int i = 0; i <32 ; i++) {
//            int count=0;
//            for (int j = 0; j <nums.length ; j++) {
//                if ((nums[j]&(1<<i))!=0){
//                    count++;
//                }
//            }
//            if(count%3!=0){
//                ans=ans|(1<<i);
//            }
//        }
//    return ans;
//         which takes O(n longn+n)TC and O(1) SC
        Arrays.sort(nums);
        for (int i = 1; i <nums.length ; i+=3) {
            if (nums[i-1]!=nums[i]){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}
