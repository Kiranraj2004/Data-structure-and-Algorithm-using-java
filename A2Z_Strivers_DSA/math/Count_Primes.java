package A2Z_Strivers_DSA.math;

import java.util.*;

public class Count_Primes {
    public static void main(String[] args) {
        System.out.println(countPrimes(2));
    }

//which takes O(sqrt(n)+log(n))TC and O(depends on number)
    public static List< Integer > optimalcountPrimes(int n) {
        // Write your code here.
        List<Integer>res=new ArrayList<>();
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0){
                res.add(i);
                while(n%i==0){
                    n=n/i;
                }
            }
        }
        if(n!=1)res.add(n);
        return res;
    }
    public static List<Integer> countPrimes(int n) {
        // Write your code here.
        List<Integer>res=new ArrayList<>();
        for (int i = 2; i <=n ; i++) {
            if (n%i==0){
                if (primenumber(i)){
                    res.add(i);
                }
            }
        }
        return res;
    }
    public static boolean primenumber(int n){
        for (int i = 2; i <n; i++) {
            if (n%i==0)return false;
        }
        return true;
    }

    public static List< Integer > ncountPrimes(int n) {
        // Write your code here.
        List<Integer>res=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(nprimenumber(i)){
                    res.add(i);
                }
                if(n/i!=i&&nprimenumber(n/i)){
                        res.add(n/i);
                }
            }
        }
        Collections.sort(res);
        return res;

    }
    public static boolean nprimenumber(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }
            if(count>2){
                return false;
            }
        }
        return count == 2;
    }

//    most optimal way using Sieve of Eratosthenes which take O(Nlog(log(n)+O(sqrt(n))TC

    public static List<Integer> using_sieve_of_erathosthenes(int n){
        boolean[]arr=new boolean[n+1];
        Arrays.fill(arr,true);
        for (int i = 2; i*i <=n ; i++) {
            if(arr[i]){
                for (int j =i*i; j<=n ; j+=i) {
                    arr[j]=false;
                }
            }
        }
        List<Integer>res=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(arr[i]){
                    res.add(i);
                }
                if(n/i!=i&&arr[n/i]){
                    res.add(n/i);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}
