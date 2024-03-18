package A2Z_Strivers_DSA.bit_manupulation;

public class remove_the_last_bit {
    public static void main(String[] args) {
        int a=13;
//        here 13 =1101 we have to remove the 1 from the bits it is at 0th index after converting 1100
//        4 =100 the 1 is at 2th index after converting 000;
        System.out.println(a&(--a));
//        1101 (13)
//    &   1100 (12)
//        1100  (12)
    }
}
