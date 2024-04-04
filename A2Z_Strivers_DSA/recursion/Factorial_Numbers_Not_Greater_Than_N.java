package A2Z_Strivers_DSA.recursion;

import java.util.*;

public class Factorial_Numbers_Not_Greater_Than_N {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(7));
//        System.out.println(printNtimes(4));


    }
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
//        using loops which takes O(log(N))TC and O(log(N))SC
//        List<Long>res=new ArrayList<>();
//        long fact=1;
//        int i=1;
//       while(fact<=n){
//           fact*=i;
//           if (fact<=n) {
//               res.add(fact);
//           }
//           i++;
//       }
//        return res;
        List<Long>r=new ArrayList<>();
        return helper(r,1,1,n);
    }
     static List<Long> helper(List<Long>res,long fact,int i,long n){
        if (fact>n){
            return res;
        }
        res.add(fact);
        i++;
        fact*=i;
        return helper(res,fact,i,n);
     }




//without using global variable
//    public static List<String> printNtimes(int n){
//        // Write your code here.
//        List<String>r=new ArrayList<>();
//        return helper(r,n);
//    }
//    static List<String> helper(List<String>w,int n){
//        if (n<1){
//            return w;
//        }
//        w.add("kiran");
//        return helper(w,n-1);
//    }

}
