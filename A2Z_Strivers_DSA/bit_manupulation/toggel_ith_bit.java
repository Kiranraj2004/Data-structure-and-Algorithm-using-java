package A2Z_Strivers_DSA.bit_manupulation;

public class toggel_ith_bit {
    public static void main(String[] args) {
        int a=13;
        int i=2;
//        here 13 =1101 and the 1th bit is 0 we should convert it into 1;
//        if it is 1 convert to 0;
        System.out.println(a^(1<<i));
    }
}
