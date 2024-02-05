package binary_search;

import java.util.Arrays;

public class Successful_Pairs_of_Spells_and_Potions {
    public static void main(String[] args) {
        int []spells={5,1,3};
        int[]potions={1,2,3,4,5};
        double re=((double) 7 /5);
        System.out.println(Math.ceil(re));
        System.out.println(Arrays.toString(successfulPairs(spells,potions,7)));
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
     int[]res=new int[spells.length];
     Arrays.sort(potions);
        for (int i = 0; i <spells.length ; i++) {
            double floor =Math.ceil(((double) success/spells[i]));
            int index=binarysearch(potions,floor);
           if (index!=potions.length){
               res[i]=(potions.length-index);
           }
           else{
               res[i]=0;
           }

        }
        return res;
    }
    public static int binarysearch(int[]nums,double target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
                end=mid-1;
            }
           else if (nums[mid]>target){
                end=mid-1;
            }
            else start=mid+1;
        }
        return start;
    }
}
