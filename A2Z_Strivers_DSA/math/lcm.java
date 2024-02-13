package A2Z_Strivers_DSA.math;

public class lcm {
    public static void main(String[] args) {
        System.out.println(LCM(10,6));
    }
    public static int LCM(int a,int b){
        int min= Math.min(a, b);
        while (true){
            if (min%a==0&&min%b==0){
                return min;
            }
            min++;
        }
    }
}
