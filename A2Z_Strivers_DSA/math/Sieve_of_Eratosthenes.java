package A2Z_Strivers_DSA.math;

import java.util.Arrays;

public class Sieve_of_Eratosthenes {
  static int [] arr;
    public static void blackbox(int n) {
        arr=new int[n+1];
        Arrays.fill(arr,1);
        for (int i = 2; i*i <=n ; i++) {
            if(arr[i]==1){
                for (int j =i*i; j<=n ; j+=i) {
                    arr[j]=0;
                }
            }
        }
    }
    public static int countPrimes(int n) {
        blackbox(n);
        int count=0;
        for (int i = 2; i <n; i++) {
            if (arr[i]==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
