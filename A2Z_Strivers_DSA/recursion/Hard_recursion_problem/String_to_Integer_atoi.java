package A2Z_Strivers_DSA.recursion.Hard_recursion_problem;

public class String_to_Integer_atoi {
    public static void main(String[] args) {
        String s="9223372036854775808";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        boolean d=false;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==' ')continue;
            if (Character.isAlphabetic(s.charAt(i))||s.charAt(i)=='.')break;
            if (s.charAt(i)=='-')d=true;
            if ((int)s.charAt(i)>=48&&(int)s.charAt(i)<=57||s.charAt(i)=='-'||s.charAt(i)=='+'){
                if(s.charAt(i)=='-'||s.charAt(i)=='+')i++;

                long sum=0;
                for (int j =i; j <s.length() ; j++) {
                    if (s.charAt(j)==' '||s.charAt(j)=='.')break;
                    if (Character.isAlphabetic(s.charAt(j)))break;
                    if (s.charAt(j)=='-'||s.charAt(j)=='+')break;
                    sum*=10;
                    sum+=(int)s.charAt(j)-48;
                    if (sum>Integer.MAX_VALUE){
                        if (d)return Integer.MIN_VALUE;
                        return Integer.MAX_VALUE;
                    }
                }

                if (d)sum= sum*-1;
                if (sum>Integer.MAX_VALUE)return Integer.MAX_VALUE;
                if (sum<Integer.MIN_VALUE)return Integer.MIN_VALUE;
                return (int)sum;
            }
        }

        return 0;

    }
}
