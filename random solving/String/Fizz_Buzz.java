package String;
import java.util.*;
public class Fizz_Buzz {
    public static void main(String[] args) {
        int n=15;
        System.out.println(fizzBuzz(n));
    }
    public static List<String> fizzBuzz(int n) {
        List<String>answer=new ArrayList<String>();
        for (int i =1; i <=n ; i++) {
            if (i%5==0&&i%3==0){
                answer.add("FizzBuzz");
            } else if (i%3==0) {
                answer.add("Fizz");

            } else if (i%5==0) {
                answer.add("Buzz");
            }else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;

    }
}
