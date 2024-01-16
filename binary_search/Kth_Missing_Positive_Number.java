package binary_search;
//https://leetcode.com/problems/kth-missing-positive-number
import java.util.ArrayList;
import java.util.List;

public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int []arr={2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));
    }
    public  static int findKthPositive(int[] arr, int k) {
        List<Integer> answer=new ArrayList<>();
        int j=0;
        int i=1;
          while (answer.size()!=k+1) {
              if (arr[j] != i) {
                  answer.add(i);

              } else if(j< arr.length-1){
                  j++;
                }
               i++;
          }
       return answer.get(k-1);
    }
}
