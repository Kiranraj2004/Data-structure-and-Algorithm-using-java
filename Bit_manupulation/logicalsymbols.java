package Bit_manupulation;

public class logicalsymbols {
    public static void main(String[] args) {
        int a=0;
        System.out.println(~-1);
        System.out.println(1&2);// 1
        System.out.println(2|3);//3
        System.out.println(2^3);
        System.out.println(3<<1);//left shift  is what ever the given number multiply by 2
        System.out.println(2>>1);//right shift is what ever the given number divide by 2
        int n = 7;
        String binaryString = Integer.toBinaryString(n);
        Integer s=2;
        System.out.println(( binaryString));
        System.out.println(s.compareTo(1));
        int f=2>>1;
        System.out.println(f);
    }

}
