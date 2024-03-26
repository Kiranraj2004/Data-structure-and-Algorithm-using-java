package A2Z_Strivers_DSA.bit_manupulation.interview_question;

public class L_toR_XOR {
    public static void main(String[] args) {
        System.out.println(findXOR(1,9));
    }
    public static int findXOR(int L, int R){
        // Write your code here.
//        brute force method O(R-L+1) TM o(1)SC
//        int s=0;
//        for (int i = L; i <=R ; i++) {
//            s=s^i;
//        }
//        return s;



// optimal method O(1) TC o(1)SC
        return XORform1toN(L-1)^XORform1toN(R);
    }
    public static int XORform1toN(int n){
        if (n%4==1)return 1;
        else if(n%4==2) return n+1;
        else if(n%4==3) return 0;
        else return n;
    }
}
