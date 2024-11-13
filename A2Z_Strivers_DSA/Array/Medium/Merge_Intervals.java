package A2Z_Strivers_DSA.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][]m={
                {1,2},
                {0,4},

        };
       m= merge(m);
        for (int i = 0; i <m.length ; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>>temp=new ArrayList<>();
        ArrayList<Integer>r=new ArrayList<>();
        r.add(intervals[0][0]);
        r.add(intervals[0][1]);
        temp.add(r);
        for (int i = 1; i <intervals.length ; i++) {
           r=temp.get(temp.size()-1);
            if (intervals[i][0]<=r.get(1)){
                if (r.get(1)<intervals[i][1])
                         r.set(1,intervals[i][1]);
            }
            else{
                ArrayList<Integer>a=new ArrayList<>();
                a.add(intervals[i][0]);
                a.add(intervals[i][1]);
                temp.add(a);
            }
        }
       int [][]res=new int[temp.size()][2];
        for (int i = 0; i <temp.size() ; i++) {
            r=temp.get(i);
            res[i][0]=r.get(0);
            res[i][1]=r.get(1);
        }
        return res;
    }

    public int[][] merge1(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>>temp=new ArrayList<>();
        ArrayList<Integer>r=new ArrayList<>();
        r.add(arr[0][0]);
        r.add(arr[0][1]);
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=r.get(1)){
                if(arr[i][1]>r.get(1)){
                    r.set(1,arr[i][1]);
                }
            }
            else{
                temp.add(r);
                r=new ArrayList<>();
                r.add(arr[i][0]);
                r.add(arr[i][1]);

            }
        }
        temp.add(r);
        int[][]res=new int[temp.size()][2];
        for (int i = 0; i <temp.size() ; i++) {
            r=temp.get(i);
            res[i][0]=r.get(0);
            res[i][1]=r.get(1);
        }
        return res;
    }
}
