package A2Z_Strivers_DSA.bit_manupulation;

public class odd_even {
    public static void main(String[] args) {
        System.out.println(oddEven(1));
    }
    public static String oddEven(int N){
        if((N&1)==1){
            return "odd";
        }
        else{
            return "even";
        }
    }
}
