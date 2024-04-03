package A2Z_Strivers_DSA.bit_manupulation.interview_question;

public class Missing_number {
    public static void main(String[] args) {
        int []arr={1,2,3,5};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
// this take O(N) TC and O(1)SC
//        int n = nums.length;
//        int expectedSum = n * (n + 1) / 2;
//        int actualSum = 0;
//        for (int num : nums) {
//            actualSum += num;
//        }
//        return expectedSum - actualSum;
    int x=0;
    for(int i:nums){
        x^=i;
    }
        System.out.println(x);
    return x^XORform1toN(nums.length+1);
    }
    public static int XORform1toN(int n){
        if (n%4==1)return 1;
        else if(n%4==2) return n+1;
        else if(n%4==3) return 0;
        else return n;
    }
}
