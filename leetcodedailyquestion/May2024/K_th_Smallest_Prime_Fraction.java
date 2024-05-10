package leetcodedailyquestion.May2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//10/05/2024

public class K_th_Smallest_Prime_Fraction {
    public static void main(String[] args) {
        int[]arr={1,2,3,5};
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr,3)));
    }
//    time complexity O(2N**2+NlogN) space complexity O(N)
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[]res=new int[2];
        ArrayList<Float>s=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j =i+1; j <arr.length ; j++) {
                s.add((float)arr[i]/arr[j]);
            }
        }
        Collections.sort(s);
//        System.out.println(s);
        double target=s.get(k-1);
        for (int i = 0; i <arr.length ; i++) {
            for (int j =i+1; j <arr.length ; j++) {
               if ((float) arr[i]/arr[j]==target){
                   res[0]=arr[i];
                   res[1]=arr[j];
                   return res;
               }
            }
        }
        return res;

    }

}
