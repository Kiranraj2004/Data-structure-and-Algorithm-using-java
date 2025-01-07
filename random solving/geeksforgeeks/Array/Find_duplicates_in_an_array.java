package geeksforgeeks.Array;
import java.util.*;
//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays,Mathematical,Strings,Sorting,Matrix,Linked%20List,Stack,Searching,Binary%20Search,two-pointer-algorithm,Queue,Map,sliding-window,prefix-sum,set,Merge%20Sort&company=Amazon,Microsoft,Flipkart,Adobe,Google,Paytm,Walmart,Atlassian&difficulty=Easy&sortBy=submissions
public class Find_duplicates_in_an_array {

    public static void main(String[] args) {
        int[]arr={2,3,2,3,1};
        System.out.println(duplicates(arr,arr.length));

    }

//    O(2n)time complexity O(N) space complexity
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int[] temp=new int[n];
        ArrayList<Integer>res=new ArrayList<>();
        for(int i:arr){
            temp[i]++;
        }
        for (int i = 0; i <temp.length ; i++) {
            if (temp[i]>1){
                res.add(i);
            }
        }
        if (res.isEmpty()){
            res.add(-1);
        }
        return res;

    }
}
