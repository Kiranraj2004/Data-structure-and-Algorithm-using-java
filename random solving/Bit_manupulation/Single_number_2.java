package Bit_manupulation;

public class Single_number_2 {
    public static void main(String[] args) {
        int[]nums={1,1,1,3};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int answer=0;
        for(int n:nums){
            answer+=n;
        }
        return answer%3;
    }
}
