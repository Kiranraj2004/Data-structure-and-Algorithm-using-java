package Leetcodecontest.weekly_contest_401;

import java.util.Arrays;

public class Find_the_N_th_Value_After_K_Seconds {
    public static void main(String[] args) {
        System.out.println(valueAfterKSeconds(5,3));

    }
    public static  int valueAfterKSeconds(int n, int k) {
        int[] arr=new int[n];
        Arrays.fill(arr,1);
        int mod=(int)Math.pow(10,9)+7;

        for (int i = 1; i <=k ; i++) {
            for (int j = 1; j <n ; j++) {
                arr[j]=(arr[j]+arr[j-1])%mod;
            }
        }
        return arr[n-1];
    }
}
