package Hackathon;

import java.util.Scanner;

public class crypity {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();

        for (int i = 0; i <x ; i++) {
            String n=input.next();
            StringBuffer s=new StringBuffer();
            for (int h = 0; h <n.length() ; h++) {
                if (n.charAt(h)=='+'){
                    for (int j = h+1; j <n.length() ; j++) {
                        if (n.charAt(j)=='@'){
                            System.out.println(s);
                        }
                        else {
                            s.append(n.charAt(j));
                        }
                    }
                }
            }


        }
    }
}
