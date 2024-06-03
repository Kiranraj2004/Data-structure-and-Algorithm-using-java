package A2Z_Strivers_DSA.heaps.medium_question;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_smallest_element {
    public static void main(String[] args) {
        int []arr={7 ,10 ,4 ,3 ,20, 15};
        System.out.println(kthSmallest(arr,0,9,3));

    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        PriorityQueue<Integer> res=new PriorityQueue<>();
        for(int i:arr){
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
