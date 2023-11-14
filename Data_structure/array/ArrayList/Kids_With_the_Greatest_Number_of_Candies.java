package ArrayList;
import java.util.*;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int []candies={2,3,5,1,3};
        int exteraCandies=3;
        System.out.println(kidsWithCandies(candies,exteraCandies));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=max(candies);
        List<Boolean>answer=new ArrayList<Boolean>();

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                answer.add(true);
            }
            else {
                answer.add(false);
            }
        }
        return answer;

    }
    static int max(int []candies){
        int Maximum=Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > Maximum) {
                Maximum = candy;
            }
        }
        return Maximum;
    }
}
