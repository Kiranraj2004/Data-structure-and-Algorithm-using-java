package math;

public class HCF_GCD {
    public static void main(String[] args) {
        System.out.println(highestcommanfactor(2,8));
    }
    static int highestcommanfactor(int a,int b){
        int min=Math.min(a,b);
        while (true){
            if (a%min==0&&b%min==0){
                return min;
            }
            min--;
        }
    }
}
