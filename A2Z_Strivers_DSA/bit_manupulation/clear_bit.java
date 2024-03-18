package A2Z_Strivers_DSA.bit_manupulation;

public class clear_bit {
    public static void main(String[] args) {
        int a =13;
        int i=2;
//        here 13 =1101 and ith bit should set it as 0
//        so that here the ith bit is 1 nwo clear that insert that as 0;
        System.out.println(a&~(1<<i));
    }
}
