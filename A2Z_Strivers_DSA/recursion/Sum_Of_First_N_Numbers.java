package A2Z_Strivers_DSA.recursion;

public class Sum_Of_First_N_Numbers {
    public static void main(String[] args) {
        System.out.println(sumFirstN(5));

    }
    public static long sumFirstN(long n) {
        // Write your code here.brute force method using loops which take O(N)Tc
//
//        long sum=0;
//        for (int i = 1; i <=n ; i++) {
//            sum+=i;
//        }


//        we can aslo write the method which gives the result in O(1)
//        return (n*(n+1))/2;
        return helper(0,n);

    }
//    using recursion which takes O(N)TC and O(N)
//    space because in recursion stack space will take space
    public static long helper(long sum,long n){
        if(n<1){
            return sum;
        }
        sum+=n;
        return helper(sum,n-1);
    }
}
