package geeksforgeeks.stacks;
import  java.util.*;
public class Leaders_in_an_array {
    public static void main(String[] args) {
        int[]arr={16,17,4,3,5,2};
        System.out.println(leaders(arr,2));

    }
//    O(n)time complexity O(N) space complexity
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer>r=new ArrayList<>();
//        Stack<Integer>r=new Stack<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            if (r.isEmpty()){
               r.add(0,arr[i]);

            }
           else if (arr[i]>=r.get(0)){
                r.add(0,arr[i]);
            }
        }
//        while(!r.empty()){
//            res.add(r.pop());
//        }
        return r;
    }
}
