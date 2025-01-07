//https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class Double_exist {
    public static void main(String[] args) {
        int[]nums={-2,0,10,-19,4,6,-8};
        System.out.println(check_exist(nums));

    }
    public static boolean check_exist(int[]nums){
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if(nums[i]==2 * nums[j]&&i!=j){
                    return true;
                }
            }

        }
        return false;
    }
}
