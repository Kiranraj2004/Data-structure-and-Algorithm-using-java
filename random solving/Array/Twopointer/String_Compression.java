package Array.Twopointer;

import java.util.Arrays;

public class String_Compression {
    public static void main(String[] args) {
//        "a","a","b","b","c","c","c"
        char[]nums={'b','b','b','b','b','b','b','b',
                'b','b'};
        System.out.println(compress(nums));
        System.out.println(Arrays.toString(nums));
       char []s= Integer.toString(nums.length).toCharArray();
        System.out.println(Arrays.toString(s));
    }
    public  static int compress(char[] nums) {
        int i=0;
        int n=0;
        while(i<nums.length) {
            int j = 1;
            while (i+j < nums.length) {
                if (nums[i+j] == nums[i]) {
                    j++;
                } else {
                    break;
                }
            }
            nums[n++]=nums[i];
            if(j>1){
                for(char d:Integer.toString(j).toCharArray()){
                    nums[n]=d;
                    n++;
                }}
            i += j;
        }
        return n;
    }
}
