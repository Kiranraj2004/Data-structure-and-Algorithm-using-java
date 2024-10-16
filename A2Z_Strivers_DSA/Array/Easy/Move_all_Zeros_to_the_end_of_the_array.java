package A2Z_Strivers_DSA.Array.Easy;

public class Move_all_Zeros_to_the_end_of_the_array {
    public static void main(String[] args) {

    }
//    optimal solution
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(index!=i){
                    nums[index]=nums[i];
                    nums[i]=0;
                }
                index++;
            }
        }
    }
//     tc O(n) sc O(1)
}
