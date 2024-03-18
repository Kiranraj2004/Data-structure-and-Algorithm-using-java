package A2Z_Strivers_DSA.bit_manupulation;

public class set_ith_bit {
    public static void main(String[] args) {
        int a=13 ;
        int i=1;
//        here 13 =1101 so the ith bit should set as 1 here i th bit
//        is 0 now we are going to set it as 1
        System.out.println(a|(1<<i));


    }
}
