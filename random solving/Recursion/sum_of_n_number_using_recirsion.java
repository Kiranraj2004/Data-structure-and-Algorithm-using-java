package Recursion;

import java.util.Scanner;

public class sum_of_n_number_using_recirsion {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number :");
        int n= input.nextInt();
        System.out.println(sumofN_number(n));
    }
    static int sumofN_number(int n){
        if (n<2){
            return n;
        }
        return n + sumofN_number(n - 1);
    }
}
