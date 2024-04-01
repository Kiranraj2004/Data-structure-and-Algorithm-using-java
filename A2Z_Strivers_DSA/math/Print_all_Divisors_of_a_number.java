package A2Z_Strivers_DSA.math;
import java.util.*;
public class Print_all_Divisors_of_a_number {
    public static void main(String[] args) {

        System.out.println(printDivisors(36));
    }
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer>res=new ArrayList<>();
        for (int i = 1; i*i <=n; i++) {
            if (n%i==0){
                res.add(i);
//                because 36/6==6 so that it will add again this will be edge case
//                if(n/i!=i){
//                    res.add(n/i);
//                }
                if(!res.contains(n/i)) {
                    res.add(n / i);
                }
            }
        }
        Collections.sort(res);
        return res;
    }

}
