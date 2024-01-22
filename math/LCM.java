package math;

public class LCM {
    public static void main(String[] args) {
        System.out.println(leastcomman(3,6));
    }
    public static int leastcomman(int a,int b){
        int min= Math.min(a, b);
       while (true){
           if (min%a==0&&min%b==0){
               return min;
           }
           min++;
       }
    }
}
