package Playing_with_number;
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-intege
public class Subtract_the_product_and_sum {
    public static void main(String[] args) {
        int num=234;
        System.out.println(subtractProductAndSum(num));
    }
    public static int subtractProductAndSum(int n) {
     int product=1,sum=0;
     while (n!=0){
         product*=n%10;
         sum+=n%10;
         n/=10;
     }
        return product-sum;
    }
}
