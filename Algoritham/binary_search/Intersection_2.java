//https://leetcode.com/problems/intersection-of-two-arrays-ii/
import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_2 {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {7,0};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> answer = new ArrayList<>();
       Arrays.sort(nums1);
       Arrays.sort(nums2);
        if(nums1.length==0)
            return nums1;
        if(nums2.length==0)
            return nums2;
                   int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j] )
                i++;
            else if(nums2[j]<nums1[i])
                j++;
            else if(nums1[i]==nums2[j]){
                answer.add(nums1[i]);
                i++;
                j++;
            }

            }
        int[] arr = new int[answer.size()];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = answer.get(k);
        }
        return arr;

        }



}