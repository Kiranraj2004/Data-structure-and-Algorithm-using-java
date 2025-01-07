package Recursion;

public class Factorial_of_n_number {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factoril(n));
    }
    static int factoril(int n){
        if (n<1){
            return 1;
        }
        return n*factoril(n-1);
    }
}
