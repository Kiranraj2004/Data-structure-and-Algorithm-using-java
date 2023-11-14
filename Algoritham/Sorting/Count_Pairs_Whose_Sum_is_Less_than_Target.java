package Sorting;
//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count_Pairs_Whose_Sum_is_Less_than_Target {
     static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
        System.out.println("enter the number of elements that you have to enter");
        int n=input.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("enter the number");
            int num=input.nextInt();
            nums.add(num);

        }
        System.out.println(countPairs(nums,2));


    }
    public static int countPairs(List<Integer> nums, int target) {
        int i=0;
        for (int j = 0; j <nums.size() ; j++) {
            for (int k = j+1; k <nums.size() ; k++) {
                if (nums.get(j)+nums.get(k)<target){
                    i++;
                }

            }

        }
        return i;

    }
}
