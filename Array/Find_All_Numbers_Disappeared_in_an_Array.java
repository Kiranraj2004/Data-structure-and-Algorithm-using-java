package array;


import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {


        int[] arr = {1,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public  static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>answer=new ArrayList<Integer>();
        int num=1;

        for (int i = 0; i <=nums.length-1 ; i++) {
            boolean k=false;
            for (int j = 0; j <= nums.length-1; j++) {
               if (nums[j]==num){
                   k=true;
               }

            }
            if (!k){
                answer.add(num);
            }
            num++;

        }
        return answer;

    }
}
