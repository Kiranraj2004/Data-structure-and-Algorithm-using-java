package Hackathon;

import java.util.Scanner;

public class boys {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        for (int i = 0; i <x ; i++) {
            int N=input.nextInt();
            int M=input.nextInt();
            if (M==0){
                System.out.println("NO");
            }
           else  if ((N+M)%4==0){
                if ((N+M)/4<=M){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
