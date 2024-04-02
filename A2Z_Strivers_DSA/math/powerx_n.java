package A2Z_Strivers_DSA.math;

public class powerx_n {
    public static void main(String[] args) {
        System.out.println(Math.pow(-2,3));
        System.out.println(myPow(-2,3));
    }
    public  static double myPow(double x, int n) {
//        brute force method which takes O(n)TC  it exceeds the time
//     if(n==0 ||x==1)return 1.00;
//       if(x==0)return 0;
//       boolean xnegetive= x < 0;
//       boolean nnegetive=n<0;
//       double result =1;
//       long n1=n;
//        n1*=(n1<0)?-1:1;
//       for (int i = 1; i <=n1 ; i++) {
//              result*=x;
//       }
//       if (nnegetive) {
//           result = 1 / result;
//       }
//       return result;

//        optimal  solution which takes O(log(n))TC
        double ans=1;
        boolean nngetive=n<0;
        long n1=n;
        n1*=(n1<0)?-1:1;
        while(n>0){
            if(n%2==1){
                ans=ans*x;
                n=n-1;
            }else{
                n=n/2;
                x=x*x;
            }
        }
        if(nngetive){
            return (1/ans);
        }
        return ans;
    }
}
