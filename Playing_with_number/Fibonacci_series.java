package Playing_with_number;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number :  ");
        int n=input.nextInt();
        System.out.println(Arrays.toString(fibonacci(n)));
    }
   public static int[] fibonacci(int num){
        int []arr=new int[num];
        int firstnum=0;
        int secondnum=1;
        for (int i = 0; i <num ; i++) {
            arr[i]=firstnum;
            int nextnum=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nextnum;
        }
       System.out.printf("the number %d, %d \n",firstnum,secondnum);
        System.out.println();
        return arr;
    }
}
