package A2Z_Strivers_DSA.recursion;
import java.util.*;
public class merge_sort_using_extra_space {
    public static void main(String[] args) {
        int []arr={10,19,7,2,9,8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(merge(arr)));

    }
    static public int[] merge(int[]arr){
        if (arr.length==1){
            return arr;
        }
        int []left=merge(Arrays.copyOfRange(arr,0,arr.length/2));
        int []right=merge(Arrays.copyOfRange(arr,arr.length/2,arr.length));
        return sort(left,right);
    }

    private static int[] sort(int[] left, int[] right) {
        int[]ans=new int[left.length+right.length];
        int l=0;
        int r=0;
        int k=0;
        while(l<left.length&&r<right.length){
            if (left[l]<right[r]){
                ans[k]=left[l];
                l++;
            }
            else{
                ans[k]=right[r];
                r++;
            }
            k++;
        }
        while(l<left.length){
            ans[k]=left[l];
            k++;
            l++;

        }
        while(r<right.length){
            ans[k]=right[r];
            k++;
            r++;
        }
        return ans;
    }
}
