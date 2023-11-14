package array;

public class Pascaltriangle {
    public static void main(String[] args) {
        int row=5;
        triangle(row);
    }
    public static int factorial(int n){
        int  fact=1;
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void triangle(int row){
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <(row-i+1) ; j++) {
                System.out.print(" ");

            }
            for (int z = 0; z <i+1; z++) {
                int l=(int)(factorial(i)/(factorial(z)*factorial(i-z)));
               if (l!=0)System.out.print(l+" ");

            }
           System.out.println();

        }
    }
}
/*  SOLUTION
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1

 */