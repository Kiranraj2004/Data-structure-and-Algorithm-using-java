package leetcodedailyquestion.july2024;
import java.util.*;
public class Sort_the_People {
    public static void main(String[] args) {

    }

    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String >res=new HashMap<>();
        for (int i = 0; i <names.length ; i++) {
            res.put(heights[i],names[i]);
        }

        Arrays.sort(heights);
       reverse(heights);
        for (int i = 0; i <heights.length ; i++) {
            names[i]=res.get(heights[i]);
        }
       return names;
    }

    private void reverse(int[] heights) {
        int s=0;
        int e=heights.length-1;
        while(s<e){
            int temp=heights[s];
            heights[s]=heights[e];
            heights[e]=temp;
            s++;
            e--;
        }


    }

}
