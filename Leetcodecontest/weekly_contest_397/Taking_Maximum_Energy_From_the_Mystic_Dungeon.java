package Leetcodecontest.weekly_contest_397;

public class Taking_Maximum_Energy_From_the_Mystic_Dungeon {
    public static void main(String[] args) {
        int[]energy = {5,2,-10,-5,1};
        int k = 3;
        System.out.println(maximumEnergy(energy,k));
    }
    public static int maximumEnergy(int[] energy, int k) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <energy.length ; i++) {
            int sum=energy[i];
            for (int j = i+k; j <energy.length ; j+=k) {
                sum+= energy[j];
                if (sum < 0) {
                    sum = 0;
                }
            }
            max=Math.max(sum,max);

        }
        return max;
    }
}
