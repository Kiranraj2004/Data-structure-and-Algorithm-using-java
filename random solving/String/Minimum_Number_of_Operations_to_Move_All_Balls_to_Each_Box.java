package String;

import java.util.Arrays;

public class Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box {
    public static void main(String[] args) {
     String boxes="001011";
        System.out.println(Arrays.toString(minOperations(boxes)));
    }
    public  static int[] minOperations(String boxes) {
        int[]arr=new int[boxes.length()];
        for (int i = 0; i <boxes.length() ; i++) {
            int sum=0;
            for (int j = 0; j <boxes.length() ; j++) {
                if (boxes.charAt(j)=='0'&&j!=i){
                    continue;
                }
                sum+=Math.abs(i-j);
            }
            arr[i]=sum;
        }
        return arr;

    }
}
