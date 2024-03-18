package A2Z_Strivers_DSA.bit_manupulation;

public class ith_bit_set {
    public static void main(String[] args) {
        int n=13;
        int i=2;
//        there 13 =1101 and we have to check whether the i(th) is is 1 or not
        if((n&(1<<i))!=0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if(((n>>i)&1)!=0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
