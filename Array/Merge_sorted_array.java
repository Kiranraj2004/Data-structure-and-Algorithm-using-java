import java.util.Arrays;
//https://leetcode.com/problems/merge-sorted-array/
public class Merge_sorted_array {
    public static void main(String[] args) {
        int[]num1={1,2,3,0,0,0};
        int m=3,n=3;
        int[]num2={2,5,6};
        System.out.println(Arrays.toString(merge(num1,m,num2,n)));
    }
    public static int[] merge(int[]num1,int m,int[]num2,int n){
      int f=m+n;
        int[]m1=new int[f];
        for (int i = 0; i < m1.length ; i++) {
            for (int j = 0; j <m ; j++,i++) {
                m1[i]=num1[j];
            }
            for (int j = 0; j <n ; j++,i++) {
               m1[i]=num2[j] ;
            }
        }

   return sorted(m1); }
    public static int[]sorted(int[]nums) {
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i] > nums[j]) {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }

            }

        } return nums;
    }
}
