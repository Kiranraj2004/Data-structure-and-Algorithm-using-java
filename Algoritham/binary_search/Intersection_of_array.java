//https://leetcode.com/problems/intersection-of-two-arrays/
import java.util.*;
public class Intersection_of_array {
    public static void main(String[] args) {

        int []num1={4,9,5};
        int []num2={9,4,9,8,4};
        System.out.println( Arrays.toString(intersection(num1,num2)));
    }
    public static int[] intersection(int[]num1,int[]num2){
        ArrayList<Integer>answer=new ArrayList<>();

        for (int j : num1) {
            for (int k : num2) {
                if (j == k) {
                    if (!answer.contains(j)) {
                        answer.add(j);
                    }
                }

            }

        }

        int[]arr=new int[answer.size()];
        for (int k = 0; k <arr.length ; k++) {
            arr[k]= answer.get(k);
        }
        return arr;
    }


}
