package Leetcodecontest.weekly_contest_397;

public class Permutation_Difference_between_Two_Strings {
    public static void main(String[] args) {
        String  s = "abcde", t = "edbac";
        System.out.println(findPermutationDifference(s,t));

    }
    public static int findPermutationDifference(String s, String t) {
        int sum=0;
        for (int i = 0; i <s.length(); i++) {
            char f=s.charAt(i);
            sum+=Math.abs(i-t.indexOf(f));

        }
        return sum;

    }
}
