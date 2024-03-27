package A2Z_Strivers_DSA.bit_manupulation.interview_question;

public class Sum_of_Two_Integers {
    public static void main(String[] args) {
        int a=-1;
        int b=-11;
        System.out.println(getSum(a,b));

    }
    public static int getSum(int a, int b) {
        while(b!=0){
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
}
