import java.util.Arrays;

//https://leetcode.com/problems/single-number/
public class Single_number {
    public static void main(String[] args) {
        int []nums={1,0,1};

        System.out.println(singlenumber(nums));

    }
    public static int singlenumber(int[]nums){
        for (int i = 0; i <=nums.length-1; i++) {
            int answer=0;
            for (int j = 0;j<=nums.length-1 ; j++) {
                if (i!=j) {
                    if (nums[i] == nums[j]) {
                        answer = 1;

                    }
                }
            }
            if (answer==0){
                return nums[i];
            }
        }
        return -1;
    }

}
