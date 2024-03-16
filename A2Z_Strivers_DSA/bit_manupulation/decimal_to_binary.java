package A2Z_Strivers_DSA.bit_manupulation;

public class decimal_to_binary {
    public static void main(String[] args) {
        int a=13;
        System.out.println(binary(a));
    }
    public static String binary(int num){
//        (num)base10 to binary)base2
        StringBuffer  s=new StringBuffer();
        while(num!=0){
            if (num%2==0){
                s.append('0');
            }
            else{
                s.append('1');
            }
            num/=2;
        }
        s.reverse();
        return s.toString();
    }

}
