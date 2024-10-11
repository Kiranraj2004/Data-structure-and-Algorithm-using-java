package A2Z_Strivers_DSA.Array.Easy;

import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/second-largest3735/1
public class Second_Largest {
    public static void main(String[] args) {

    }
//     brute force
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int firstlargest=arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i]!=firstlargest){
                return arr[i];
            }
        }
        return -1;
    }
//     sc-O(1), tc-O(nlogn) sorting+O(n)searching overall O(NlogN)

//    optimal solution
    public int getSecondLargest1(int[] arr) {
        // Code Here
        int firstlargest=arr[0];
        int secondlargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>firstlargest){
                secondlargest=firstlargest;
                firstlargest=arr[i];
            }
            else if(secondlargest<arr[i]&&firstlargest!=arr[i]){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
//    sp-O(1) tc -O(n)

//    second smallest
    public int getSecondsmallest2(int[] arr) {
        // Code Here
        int firstsmallest=arr[0];
        int secondsmallest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<firstsmallest){
                secondsmallest=firstsmallest;
                firstsmallest=arr[i];
            }
            else if(secondsmallest>arr[i]&&firstsmallest!=arr[i]){
                secondsmallest=arr[i];
            }
        }
        return secondsmallest;
    }
    //    sp-O(1) tc -O(n)
}
