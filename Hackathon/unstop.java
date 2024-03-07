package Hackathon;

import java.util.Scanner;

public class unstop {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n= input.nextInt();
        int k= input.nextInt();
        int count=0;
        for (int i = 1; i <=n ; i++) {
            int min=Math.min(i,k);
//            while(true){
//                if (i%min==0&&k%min==0){
//                   if(min>1){count++;}
//                    break;
//                }
//                min--;
//            }
            while(i%min!=0||k%min!=0){
                min--;
            }
            if(min>1){
                count++;
            }

            if (count==k){
                System.out.println("YES");
                break;
            }

        }
        if (count!=k) {
            System.out.println("NO");
        }
    }
}
