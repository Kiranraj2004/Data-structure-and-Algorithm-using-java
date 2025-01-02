package A2Z_Strivers_DSA.Binary_search.bs_on_ans;

public class Koko_Eating_Bananas {
    public static void main(String[] args) {

    }
    public int minEatingSpeed(int[] piles, int h) {
        int find_max_pile=maxpile(piles);
        int start=1;
        int end=find_max_pile;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            int totalhours=gettotatlhours(piles,mid);
            if(totalhours>h){
                start=mid+1;
            }
            else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    private int gettotatlhours(int[] piles, int mid) {
        int totalhours=0;
        for (int i = 0; i < piles.length ; i++) {
            totalhours+=Math.ceil( (double) piles[i]/(double) mid);
        }
        return totalhours;
    }

    private int maxpile(int[] piles) {
        int max=piles[0];
        for (int i = 1; i <piles.length ; i++) {
            if(piles[i]>max){
                max=piles[i];
            }
        }
        return max;
    }
}
