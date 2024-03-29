package A2Z_Strivers_DSA.bit_manupulation.interview_question;

import java.util.Arrays;

public class Single_Number_III {
    public static void main(String[] args) {
        int []arr={3,5};
        System.out.println(Arrays.toString(singleNumber(arr)));
    }
    public static int[] singleNumber(int[] arr) {
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
