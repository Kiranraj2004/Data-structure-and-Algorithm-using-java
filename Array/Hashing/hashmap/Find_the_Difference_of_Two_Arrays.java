package Array.Hashing.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_the_Difference_of_Two_Arrays {
    public static void main(String[] args) {
        int[]nums1={1,2,3};
        int[]nums2={2,4,5};
        System.out.println(findDifference(nums1,nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>n1=new HashSet<>();
        HashSet<Integer>n2=new HashSet<>();
        for (int i = 0; i <nums1.length; i++) {
            n1.add(nums1[i]);
        }
        for (int i = 0; i <nums2.length; i++) {
                n2.add(nums2[i]);
        }
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>s=new ArrayList<>();
        for(Integer it:n1){
            if (!n2.contains(it)){
                s.add(it);
            }
        }
        res.add(s);
        s=new ArrayList<>();
        for(Integer it:n2){
            if (!n1.contains(it)){
                s.add(it);
            }
        }
        res.add(s);
        return res;
    }
}
