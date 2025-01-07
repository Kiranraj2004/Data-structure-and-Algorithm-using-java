package Bit_manupulation;

public class odd_or_even {
    public static void main(String[] args) {
        int num=35;
        oddoreven(num);
    }

    private static void oddoreven(int num) {
        if ((num&1)==1){
            System.out.println("num is odd number ");
        }
        else System.out.println("num is even number");
    }
}
