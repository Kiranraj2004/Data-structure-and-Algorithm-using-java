package Hackathon;

import java.util.Scanner;

public class levelofdoremon {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        StringBuffer res=new StringBuffer();
        boolean temp=false;
        int count=2;
        for (int i = 0; i <(Math.pow(2,n))/2; i++) {
            if(i==(Math.pow(2,n)/2)-1){
                res.append((char)(64+n));
                res.append(" ");
                break;
            }
            if (i%2==0){
                    res.append('A');
            }else{
                res.append((char)(64+count));
                if(!temp){
                    count++;
                }
                if(temp){
                    count--;
                }
               if(count>=n){
                   temp=true;
               }

            }
            res.append(" ");
        }
//        A B A C A B A D A B A C A B A
        res.append(res.substring(0, res.length()-2));
        System.out.println(res);
    }
}
