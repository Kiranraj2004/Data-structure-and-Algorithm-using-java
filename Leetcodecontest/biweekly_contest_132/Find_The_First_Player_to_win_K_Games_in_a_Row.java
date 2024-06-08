package Leetcodecontest.biweekly_contest_132;

import java.util.HashMap;

public class Find_The_First_Player_to_win_K_Games_in_a_Row {
    public static void main(String[] args) {
        int []arr={4,2,6,3,9};
        System.out.println(findWinningPlayer(arr,3));

    }
    public static int findWinningPlayer(int[] skills, int k) {
        HashMap<Integer,Integer>temp=new HashMap<>();
        int i=0;
        int j=1;
        int max=0;
        while(j<skills.length){
            if (skills[i]<skills[j]){
                if (temp.containsKey(j)){
                    temp.put(j,temp.get(j)+1);
                }
                else{
                    temp.put(j,1);
                }
                if (temp.get(j)==k){
                    return j;
                }
                max=j;
                i=j;
                j++;
            }
            else{
                if (temp.containsKey(i)){
                    temp.put(i,temp.get(i)+1);

                }
                else{
                    temp.put(i,1);
                }
                if (temp.get(i)==k){
                    return i;
                }
                max=i;
                j++;
            }

        }
        return max;
    }
}
