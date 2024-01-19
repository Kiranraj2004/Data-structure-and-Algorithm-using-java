package hackarrank;
import java.util.*;
public class plusneg {
    public static void main(String[] args) {
        List<Integer>arr=new ArrayList<Integer>();
        arr.add(0);
        arr.add(2);
        arr.add(-9);
        plusMinus(arr);
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pos=0;
        int neg=0;
        int zero=0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)>0){
                pos++;
            }
            else if(arr.get(i)==0){
                zero++;
            }
            else{
                neg++;
            }
        }
//        double w= (double) pos /arr.size();
        System.out.printf("%.6f%n",(double) pos/arr.size());
        System.out.printf("%.6f%n",(double) (neg/arr.size()));
        System.out.printf("%.6f%n", (double)(zero/arr.size()));

    }


}
