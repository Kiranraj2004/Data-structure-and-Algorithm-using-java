package A2Z_Strivers_DSA.bit_manupulation.interview_question;

public class Minimum_Bit_Flips_to_Convert_Number {
    public static void main(String[] args) {
        System.out.println(minBitFlips(3,4));
    }
    public static int minBitFlips(int start, int goal) {
        int count=0;
        int temp=start^goal;
        while(temp!=0){
            temp=(temp&(temp-1));
            count++;
        }
   return count;
    }
}
