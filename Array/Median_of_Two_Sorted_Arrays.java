package Array;
//https://leetcode.com/problems/median-of-two-sorted-arrays
import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] num1 ={1,2};
        int[] num2 ={3,4};
        System.out.println(findMedianSortedArrays(num1,num2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
           int n= nums1.length+nums2.length;
           int [] arr=new int[n];
           int h=0;
        for (int i = 0; i < nums1.length ; i++) {
            arr[h]=nums1[i];
            h++;
        }
        for (int i = 0; i <nums2.length ; i++) {
            arr[h]=nums2[i];
            h++;
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        double answer;
        int mid=n/2;
        if (n%2==0){
          answer= (double) (arr[mid] + arr[mid - 1]) /2;
            return answer;
        }
        return  arr[mid];
    }
}
