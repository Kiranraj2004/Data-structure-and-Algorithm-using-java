package A2Z_Strivers_DSA.heaps.medium_question;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int []arr={3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr,4));
    }
    public static  int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>res=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            res.add(i);
        }
        int c=0;

        while(!res.isEmpty()&&k!=0)
        {
            c=res.poll();
            k--;
        }
        return c;
    }
}
