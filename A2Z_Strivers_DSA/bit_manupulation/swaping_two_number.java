package A2Z_Strivers_DSA.bit_manupulation;

public class swaping_two_number {
    public static void main(String[] args) {
        int a=1;
        int b=3;
//        before swaping
        System.out.println("before  a ="+a);
        System.out.println(" before b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after  a ="+a);
        System.out.println(" after b="+b);
//        first =a=a^b
//        second b=a^b here a=(a^b)so that a^b=(a^b)^b b^b=0 therefore b=a;
//        thridly a=a^b here a=(a^b) and b=a so that a^b =(a^b)^a a^a=0 a=b;
    }
}
