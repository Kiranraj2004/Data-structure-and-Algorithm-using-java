//https://leetcode.com/problems/palindrome-number/
import java.util.Scanner;
public class Palindrome_integer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number :");
        int nums=input.nextInt();
        System.out.println(ispalindrome(nums));

    }
    public static boolean ispalindrome(int nums){
        if (nums<0){
            return false;
        }
        int value=nums;
        int answer=0;
       while(value!=0){
           answer=answer*10+value%10;
           value/=10;
       }
        return nums==answer;
    }
}
