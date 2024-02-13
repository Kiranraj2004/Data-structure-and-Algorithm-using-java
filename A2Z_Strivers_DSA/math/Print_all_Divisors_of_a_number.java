package A2Z_Strivers_DSA.math;
import java.util.*;
public class Print_all_Divisors_of_a_number {
    public static void main(String[] args) {
        System.out.println(printDivisors(5));
    }
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer>res=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                res.add(i);
            }
        }
        return res;
    }
}
