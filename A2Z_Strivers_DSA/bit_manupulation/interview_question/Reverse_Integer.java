package A2Z_Strivers_DSA.bit_manupulation.interview_question;

public class Reverse_Integer {
    public static void main(String[] args) {
        int a=-123;
        System.out.println(reverse(Integer.MAX_VALUE-2));
        System.out.println(Integer.MAX_VALUE/10);
    }
    public static int reverse(int x) {
        System.out.println(x);
//        tis ia using long
//        long sum=0;
//        while (x != 0) {
//
//            int rem=x%10;
//            sum=sum*10+rem;
//            x/=10;
//        }
//        if (sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE){
//            return 0;
//        }
//        return (int)sum;

//        for this problem we don't want to use long in the program
        int sum=0;
        while(x!=0){
            int rem=x%10;
            if (sum>Integer.MAX_VALUE/10||sum==Integer.MAX_VALUE/10&&rem>7){
                return 0;
            }
            if (sum<Integer.MIN_VALUE/10||sum==Integer.MIN_VALUE/10&&rem<-8){
                return 0;
            }
            sum=sum*10+rem;
            x/=10;
        }
        return sum;
    }
}
