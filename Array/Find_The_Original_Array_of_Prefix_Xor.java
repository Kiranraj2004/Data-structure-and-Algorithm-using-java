package Array;
//https://leetcode.com/problems/find-the-original-array-of-prefix-xor
import java.util.Arrays;

public class Find_The_Original_Array_of_Prefix_Xor {
    public static void main(String[] args) {
        int[] pref={5,2,0,3,1};
        System.out.println(Arrays.toString(findArray(pref)));
    }
    public  static int[] findArray(int[] pref) {
        int []answer=new int[pref.length];
        answer[0]=pref[0];
        for (int i = pref.length-1; i >= 1; i--) {
//
            answer[i]=pref[i]^pref[i-1];
//
//
        }
          return answer;
    }
}
