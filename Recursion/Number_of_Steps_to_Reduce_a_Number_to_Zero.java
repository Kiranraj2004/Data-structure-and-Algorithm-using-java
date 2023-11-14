package Recursion;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        int num=123;
        System.out.println(numberOfSteps(num));

    }
//    answer using iteration
    public  static int numberOfSteps1(int num) {
        int answer=0;
        while (num>0){
            if (num%2!=0){
                num-=1;
                answer++;
            }
           if (num!=0){
               answer++;
               num/=2;
           }
        }
        return answer;
    }
//    answer using recursion
    public static int numberOfSteps(int num) {
            return recursion(num,0);
    }
    private static int recursion(int num ,int answer){
        if (num<=0)return answer;
        if (num%2!=0){
           return recursion(num - 1,answer+1);
        }
        return recursion(num/2,answer+1);

    }
}
