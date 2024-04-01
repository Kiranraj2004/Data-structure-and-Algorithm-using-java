package A2Z_Strivers_DSA.math;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();

//        what is prime number ?
//        the number which is divisable by 1 and i
//        t self and also it has only 2 divisor

//        this will give true for n=1 so 1 is not true
//        for(int i=2;i*i<=x;i++)
//        {
//            if(x%i==0)
//            {
//                System.out.println("false");
//                return;
//            }
//        }
//        System.out.println("true");
        int count=0;
        for (int i = 1; i*i <=x ; i++) {
            if (x%i==0){
                count++;
                if (x/i!=i){
                    count++;
                }
            }
            if (count>2){
                System.out.println("false");
                return;
            }
        }
        if (count==2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
