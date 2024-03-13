package A2Z_Strivers_DSA.Linklist;

import java.math.BigInteger;

public class numberfromlast {
    public static void main(String[] args) {
        String s="208";
        int i=0;
        int original=0;
        for (int j = 0; j <s.length() ; j++) {
            int num=s.charAt(j)-48;
            original=(int)(num*Math.pow(10,i++))+original;
        }
        System.out.println(original);
        BigInteger u= BigInteger.valueOf(99999999+1);
        System.out.println(u);
    }
}
