package leetcodedailyquestion.May2024;

import java.util.Arrays;

public class Boats_to_Save_People {
    public static void main(String[] args) {
        int[]arr={3,5,3,4};
        System.out.println(numRescueBoats(arr,5));
    }

//    time complexity O(Nlogn+n) space complexityO(1)
    public  static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int s=0;
        int e=people.length-1;
        int count=0;

        while(s<=e){
            if (s==e){
                count++;
                break;
            }
            if (people[s]+people[e]<=limit){
                s++;
            }
            count++;
            e--;
        }
        return count;
    }
}
