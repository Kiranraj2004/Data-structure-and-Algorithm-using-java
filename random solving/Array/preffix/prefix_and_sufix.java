package Array.preffix;


import java.util.Arrays;

public class prefix_and_sufix {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        prefix(nums);
//        if you want find the range sum there are formula A[i,j]=A[j]-A[i-1];
        sufix(nums);
    }
    public  static void prefix(int[]nums){
        int[] res=new int[nums.length];
        res[0]=nums[0];
        for (int i = 1; i < nums.length ; i++) {
            res[i]=res[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(res));

//        if i need the sum between the index from 2 to 4;
        int a=res[4]-res[2-1];
        System.out.println(a);
    }

    public  static void sufix(int[]nums){
        int[] res=new int[nums.length];
        res[nums.length-1]=nums[nums.length-1];
        for (int i = nums.length-2; i >=0 ; i--) {
            res[i]=res[i+1]+nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
