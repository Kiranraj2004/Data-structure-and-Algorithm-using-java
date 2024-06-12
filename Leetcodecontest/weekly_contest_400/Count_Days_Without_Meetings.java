package Leetcodecontest.weekly_contest_400;

import java.util.ArrayList;
import java.util.Arrays;

public class Count_Days_Without_Meetings {
    public static void main(String[] args) {
        int [][]m={
               {1,4},{5,7},{9,10}
        };
        System.out.println(countDays(10,m));


        String main="hellowold";
        String substring="world";
        for (int i = 0; i <main.length(); i++) {
            if (main.charAt(i)==substring.charAt(0)){
                int count=0;
                while(count+i<main.length() &&count<substring.length()&& main.charAt(count+i)==substring.charAt(count)){
                    count++;
                }
                if (count==substring.length()){
                    System.out.println(i);
                }

            }
            System.out.println("substring not found");
        }

    }
    public static   int countDays(int days, int[][] meetings) {
        int count=0;
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>r=new ArrayList<>();
        r.add(meetings[0][0]);
        r.add(meetings[0][1]);
        res.add(r);
        for (int i = 1; i <meetings.length ; i++) {
            r=res.get(res.size()-1);
            if (meetings[i][0]<=r.get(1)){
                if (r.get(1)<meetings[i][1])
                    r.set(1,meetings[i][1]);
            }
            else{
                ArrayList<Integer>a=new ArrayList<>();
                a.add(meetings[i][0]);
                a.add(meetings[i][1]);
                res.add(a);
            }
        }
        r=res.get(0);
        count=r.get(0)-1;
        r=res.get(res.size()-1);
        count+=days-r.get(1);
        for (int i = 1; i < res.size() ; i++) {
            r=res.get(i);
            int start=r.get(0);
            ArrayList<Integer>prev=res.get(i-1);
            count+=(start-prev.get(1))-1;
        }
        return count;
    }
}
