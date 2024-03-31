package Leetcodecontest.march312024;

public class Water_Bottles_II {
    public static void main(String[] args) {
        System.out.println(maxBottlesDrunk(10,3));
    }
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int count=0;
        int empty=0;
        while(numBottles!=0){
            empty+=numBottles;
            count+=numBottles;
            numBottles=0;
            while(empty!=0&&empty>=numExchange){
                empty-=numExchange;
                numExchange++;
                numBottles++;
            }
        }
    return count;
    }
}
