package Array;

import java.util.Arrays;

public class induvisual_sum {
    public static void main(String[] args) {
        int arr[]={5,4,8,1};
        System.out.println(Arrays.toString(sumofinduvisual(arr)));
    }
    static int[] sumofinduvisual(int []arr){
        int []result=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            int sum=0;
            for (int j = 0; j <arr.length; j++) {
                sum+= Math.abs(arr[i]-arr[j]);
            }
            result[i]=sum;
        }
        return result;
    }
}
