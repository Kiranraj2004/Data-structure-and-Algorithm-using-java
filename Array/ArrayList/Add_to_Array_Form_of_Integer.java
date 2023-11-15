package ArrayList;
//https://leetcode.com/problems/add-to-array-form-of-integer


import java.util.ArrayList;
import java.util.List;

public class Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int[]nums={2,3};
        System.out.println(addToArrayForm(nums,123));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer>an=new ArrayList<>();
        for (int i = num.length-1; i>=0 ; i--) {
            int n=num[i];
            int sum=n+k;
            int rem=sum%10;
            an.add(0,rem);
            k=sum/10;

        }
        while (k>0){
            an.add(0,k%10);
            k/=10;
        }
        return an;
    }
}
