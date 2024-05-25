package Leetcodecontest.biweekly_contest_131;
import java.util.*;
public class Find_the_XOR_of_Numbers_Which_Appear_Twice {
    public static void main(String[] args) {

    }
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer>res=new HashSet<>();
        int ans=0;
        for(int i:nums){
            if (res.contains(i)){
                ans=ans^i;
            }
            else{
                res.add(i);
            }
        }
        return ans;
    }
}
