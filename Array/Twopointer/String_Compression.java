package Array.Twopointer;

public class String_Compression {
    public static void main(String[] args) {
        char[]nums={'a','b','b','b','b','b','b','b','b','b','b','b','b',};
        System.out.println(compress(nums));
    }
    public  static int compress(char[] nums) {
        int i=0;
        int j=0;
        int count=0;
        while(i<nums.length){
            while(j< nums.length&&nums[j+1]==nums[i]){
                j++;
            }
            if (j>0&&j)
        }

    }
}
