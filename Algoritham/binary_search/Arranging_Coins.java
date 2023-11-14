//https://leetcode.com/problems/arranging-coins/description/
public class Arranging_Coins {
    public static void main(String[] args) {
        int n=6;
        System.out.println(arrangecoin(n));
    }
    public static int arrangecoin(int num){
        int i=0;
        while(num>=0){
            num-=i+1;
            if (num>=0){
                i++;
            }
        }
        return i;
    }
}
