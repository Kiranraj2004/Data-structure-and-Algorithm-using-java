package A2Z_Strivers_DSA.math;

public class gcd_hcf {
    public static void main(String[] args) {
        System.out.println(gcd(45,10));
    }
    public static int gcd(int a,int b)
    {
        // Write your code here
        int min=Math.min(a,b);
        while(a%min!=0||b%min!=0){
            min--;
        }
        return min;
    }
}
