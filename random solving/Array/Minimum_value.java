import java.util.Arrays;

public class Minimum_value {
    public static void main(String[] args) {
        int[]nums1={2,4};
        int[]nums2={1,2};
        System.out.println(get_common(nums1,nums2));

    }
    static int get_common(int []nums1,int[]nums2){
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length)
        {
            if(nums1[i]==nums2[j])return nums2[j];
            else if(nums1[i]<nums2[j])i++;
            else j++;
        }
        return -1;
    }
}
