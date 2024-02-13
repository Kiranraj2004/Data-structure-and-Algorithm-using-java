package A2Z_Strivers_DSA.math;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        for(int i=2;i<x;i++)
        {

            if(x%i==0)

            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
