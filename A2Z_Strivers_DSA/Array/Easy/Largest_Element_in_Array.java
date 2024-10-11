package A2Z_Strivers_DSA.Array.Easy;

import java.util.Arrays;

public class Largest_Element_in_Array {
    public static void main(String[] args) {

    }

//    brute force
    public static int largest2(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
//    sp-O(1) tc-O(nlogn)

//    optimal solution
//     using iterative method
    public static int largest(int[] arr) {
         int max=arr[0];
         for(int i=1;i<arr.length;i++){
             max=Math.max(max,arr[i]);
         }
         return max;

    }
//     sc -O(1) tc-O(N)

//    using  recursive method
    public static int largest1(int[] arr) {
        return helper(arr,0,Integer.MIN_VALUE);
    }
    public static int helper(int[]arr,int index,int max){
        if(index==arr.length){
            return 0;
        }
        max=Math.max(arr[index],helper(arr,index+1,max));
        return max;
    }
    //     sc -O(n) stack space tc-O(N)
}
