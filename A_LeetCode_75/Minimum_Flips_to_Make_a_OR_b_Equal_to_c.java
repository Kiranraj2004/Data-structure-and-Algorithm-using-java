package A_LeetCode_75;

public class Minimum_Flips_to_Make_a_OR_b_Equal_to_c {
    public static void main(String[] args) {
        System.out.println(minFlips(6,2,5));
    }
    public static int minFlips(int a, int b, int c) {
        int count=0;
        int a1,b1,c1;
        while(a!=0||b!=0||c!=0){
            a1=a&1;
            b1=b&1;
            c1=c&1;
            if (c1==0){
                count+=b1+a1;
            }
            else{
                if (a1+b1==0)count++;
            }
            a=a>>1;
            b=b>>1;
            c=c>>1;
        }
        return count;

    }
}
