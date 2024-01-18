package Hackathon;

import java.util.Scanner;

public class roshan {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String s=input.nextLine();
        StringBuffer d=new StringBuffer(s);
//        System.out.println(d);
        int i=-1;
        String q="aeiou";
        while (true){
            int n=0;
            for (int j = 0; j <q.length(); j++) {
                int g=d.indexOf(String.valueOf(q.charAt(j)));
                if (g!=-1){
                    d.deleteCharAt(g);
                    n++;
                }
                else {
                    System.out.println(i);
                    return ;
                }
            }
            if (n==5&&i!=-1){
                i++;
            }
            else{
                i=1;
            }
        }

    }
}
