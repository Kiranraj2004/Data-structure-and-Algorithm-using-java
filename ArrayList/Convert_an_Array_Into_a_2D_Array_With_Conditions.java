package ArrayList;
import java.util.*;
public class Convert_an_Array_Into_a_2D_Array_With_Conditions {
    public static void main(String[] args) {
        int []nums={1,2,3,4,1,3,1};
    }
    public  static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer> num= Arrays.(nums);
        int s=0;
        while (true){
            List<int[]> a=new ArrayList<>();
            for (int i = 0; i <num.size() ; i++) {
                if (!a.contains(num.get(i))){
                    a.add(num.get(i));
                    s++;
                    num.remove(num.get(i));
                }
            }
             result.add(a.);
            if (s==nums.length)break;

        }

    return result;
    }
}
