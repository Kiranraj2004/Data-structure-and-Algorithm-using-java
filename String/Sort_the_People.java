package String;
import java.util.Arrays;
//https://leetcode.com/problems/sort-the-people/
public class Sort_the_People {
    public static void main(String[] args) {
        String[]names={"Mary","John","Emma"};
       int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));

    }
    public  static String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i <heights.length ; i++) {
            int last= heights.length-1;
            int maximum= max(i,last,heights);

            int temp=heights[maximum];
            heights[maximum]=heights[i];
            heights[i]=temp;
            String temp1=names[maximum];
            names[maximum]=names[i];
            names[i]=temp1;

        }
        return names;

    }

    public static int  max(int start, int last ,int[]heigths) {
        int answer=start;
        for (int i = start; i <= last; i++) {
            if (heigths[answer]<heigths[i]){
                answer=i;
            }

        }
        return answer;
    }
}
