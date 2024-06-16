package Leetcodecontest.weekly_contest_402;

public class Count_Pairs_That_Form_a_Complete_Day_I {
    public static void main(String[] args) {
        int []hours={72,48,24,3};
        System.out.println(countCompleteDayPairs(hours));
    }
    public static int countCompleteDayPairs(int[] hours) {
        int count=0;
        for(int i=0;i<hours.length-1;i++){
            for(int j=i+1;j<hours.length;j++){
                int sum=hours[i]+hours[j];
                if(sum%24==0){
                    count++;
                }
            }
        }
        return count;

    }
}
