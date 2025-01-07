package Recursion;

import java.util.Arrays;

public class Sum_triangle_in_array {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        sumintriangle(arr);
    }
    static void sumintriangle(int[]arr){
        if (arr.length==0){
            return;
        }
        int[] temp=new int[arr.length-1];
        for (int i = 0; i < arr.length-1 ; i++) {
            int sum=arr[i]+arr[i+1];
            temp[i]=sum;
        }
        sumintriangle(temp);

        System.out.println(Arrays.toString(arr));
    }
}
