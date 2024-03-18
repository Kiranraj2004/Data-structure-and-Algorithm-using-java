package A2Z_Strivers_DSA.bit_manupulation;

public class powerof_two {
    public static void main(String[] args) {
        int a=16;
//        check whether the given number is power of two
//        here 16=10000
//        16-1=15=01111 (&)
//                00000

//        if its not a power of two ex 13
//            13=1101
//        13-1=1=1100
//               1100
//
        if((a&a-1)==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
