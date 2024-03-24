package A2Z_Strivers_DSA.bit_manupulation.interview_question;

public class L_toR_XOR {
    public static void main(String[] args) {
        System.out.println(findXOR(1,3));
    }
    public static int findXOR(int L, int R){
        // Write your code here.
        int s=L;
        for (int i = L+1; i <=R ; i++) {
            s=s^i;
        }
        return s;
    }
}
