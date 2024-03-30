package A_LeetCode_75;

public class Minimum_Flips_to_Make_a_OR_b_Equal_to_c {
    public static void main(String[] args) {
        System.out.println(minFlips(7,7,7));
    }
    public static int minFlips(int a, int b, int c) {
        if((a|b)==c)return 0;
        int count=0;
        int andAB=a&b;
        int andc=c&andAB;
        if (andc==0) {
            while (andAB != 0) {
                count += 2;
                andAB = andAB & (andAB - 1);
            }
        }
        int XorAB=a^b;
        int xorc=c^XorAB;

        while(xorc!=0){
            count++;
            xorc=xorc&(xorc-1);
        }
        return count;

    }
}
