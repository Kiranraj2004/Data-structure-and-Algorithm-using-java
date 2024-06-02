package Leetcodecontest.weekly_contest_400;

public class Minimum_Number_of_Chairs_in_a_Waiting_Room {
    public static void main(String[] args) {
        String s="ELELEEL";
        System.out.println(minimumChairs(s));
    }
    public static int minimumChairs(String s) {
        int count=0;
        int max=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='E'){
                count++;
                max=Math.max(max,count);
            }
            else{
                count--;
            }

        }
        return max;
    }
}
