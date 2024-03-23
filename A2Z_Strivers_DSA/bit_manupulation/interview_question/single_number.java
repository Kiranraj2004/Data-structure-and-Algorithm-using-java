package A2Z_Strivers_DSA.bit_manupulation.interview_question;

public class single_number {
    public static void main(String[] args) {
        int[]arr={2,2,1};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int answer=0;
        for (int i = 0; i <nums.length ; i++) {
            answer=answer^nums[i];
        }
        return answer;
    }
}
