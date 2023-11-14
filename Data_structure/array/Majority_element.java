//https://leetcode.com/problems/majority-element/
public class Majority_element {
    public static void main(String[] args) {
        int[]nums={3,2,3};
        System.out.println(majority_element(nums));

    }
    static int  majority_element(int []nums){

        for (int i = 0; i <=nums.length-1 ; i++) {
            int number=0;
            for (int j = 0; j <=nums.length-1 ; j++) {
                if (i!=j){
                    if (nums[i]==nums[j]){
                        number++;
                    }
                }
            }
          if (number>=(nums.length/2)) {
              return nums[i];
          }

        }
        return -1;



    }


}
