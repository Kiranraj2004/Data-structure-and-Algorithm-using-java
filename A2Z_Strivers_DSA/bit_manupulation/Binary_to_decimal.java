package A2Z_Strivers_DSA.bit_manupulation;

public class Binary_to_decimal {
    public static void main(String[] args) {
        String a="1101";
        System.out.println(decimal(a));
    }
    public static int decimal(String res){
        int num=0;
        for (int i = res.length()-1; i>=0 ; i--) {
            if(res.charAt(i)=='0')continue;
            int r= (int)((res.charAt(i)-48)*(Math.pow(2,(res.length()-i-1))));
            num+=r;
        }
        return num;
    }
}
