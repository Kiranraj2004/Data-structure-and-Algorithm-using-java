package A2Z_Strivers_DSA.Binary_search.bs_on_1d;

public class Ceil_the_floor {
    public static void main(String[] args) {

    }
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor=-1;

        int ciel=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x&&arr[i]>floor)floor=arr[i];
            if(arr[i]>=x&&arr[i]<ciel)ciel=arr[i];
        }
        int []ans=new int[2];
        ans[0]=-1;
        ans[1]=(ciel==Integer.MAX_VALUE)?-1:ciel;
        return ans;
    }
}
