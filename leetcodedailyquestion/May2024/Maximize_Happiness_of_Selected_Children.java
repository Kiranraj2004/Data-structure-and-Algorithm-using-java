package leetcodedailyquestion.May2024;

import java.util.Arrays;
//9/05/2024
public class Maximize_Happiness_of_Selected_Children {
    public static void main(String[] args) {
        int[]arr={1,1,1,1,5};
        System.out.println(maximumHappinessSum(arr,1));

    }
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long happy=0;
        long decrease=0;
        for (int i = happiness.length-1; i >=0 ; i--) {
            if (happiness.length-i<=k&&happiness[i]-decrease>0){
                happy+=happiness[i]-decrease;
                decrease++;
            }
            else{
                return happy;
            }
        }
        return happy;

    }
}
