package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Pascaltriangle_1 {
    public static void main(String[] args) {
        int row=5;
        System.out.println(triangle(row));
    }
    public static int factorial(int n){
        int  fact=1;
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }
        return fact;
    }
    public static List<List<Integer>>triangle(int numRows){
     List<List<Integer>>alist=new ArrayList<>();
        for (int i = 0; i <numRows; i++) {
            ArrayList<Integer>a=new ArrayList<>();
            for (int z = 0; z <i+1; z++) {
                int l=(int)(factorial(i)/(factorial(z)*factorial(i-z)));

                a.add(l);

            }
          alist.add(a);

        }
     return alist;
    }
}
