package array;
//https://leetcode.com/problems/find-the-highest-altitude
public class Find_the_Highest_Altitude {
    public static void main(String[] args) {
      int []gain={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int gainsum=0;
        int max=0;

        for (int i:gain) {
            gainsum+=i;
            if (max<gainsum)max=gainsum;
        }
            return max;
    }
}
