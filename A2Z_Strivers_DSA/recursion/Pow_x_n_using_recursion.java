package A2Z_Strivers_DSA.recursion;

public class Pow_x_n_using_recursion {
    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
    }

//    public  static double myPow(double x, int n) {
//        if (x==1||n==0)return 1;
//        if(x==0)return 0;
//
//        long n1=n;
//        n1*=(n1<0)?-1:1;
//        double ans=helper(x,n1,1);
//        if (n<0){
//            return 1/ans;
//        }
//        return ans;
//
//    }
//    public static double helper(double x,long n,double ans){
//        if (n==0){
//            return ans;
//        }
//        if(n%2==1){
//            ans*=x;
//            n-=1;
//            return helper(x,n,ans);
//        }
//        else {
//            return helper(x*=x,n/2,ans);
//        }
//    }

    public static double myPow(double x, long n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            n=Math.abs(n);
            x=1/x;
        }
        if(n%2==0){
            return myPow(x*x, n/2);
        }
        else{
            return x*myPow(x, n-1);
        }
    }
}
