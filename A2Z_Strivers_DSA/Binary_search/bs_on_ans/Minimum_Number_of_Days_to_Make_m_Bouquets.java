package A2Z_Strivers_DSA.Binary_search.bs_on_ans;

public class Minimum_Number_of_Days_to_Make_m_Bouquets {
    public static void main(String[] args) {

    }
    public int minDays(int[] bloomDay, int m, int k) {
        int []kavilable=new int[bloomDay.length-(k-1)];
        int []minmax=getminmax(bloomDay,kavilable,k);
        int low=minmax[0],high=minmax[1];
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int total=gettotal(kavilable,k,m,mid);
            if(total<m){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }

        return ans;

    }

    private int gettotal(int[] kavilable, int k, int m,int mid) {
        int count=0;
        int i=0;
        while(i<kavilable.length){
            if(kavilable[i]<=mid){
                count++;
                i+=k;
                if(count==m)return count;
            }
            else{
                i++;
            }
        }
        return count;
    }

    private int[] getminmax(int[] bloomDay,int[]k,int a) {
        int []ans=new int[2];
        ans[0]=Integer.MAX_VALUE;
        ans[1]=Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length ; i++) {
            ans[0]=Math.min(ans[0],bloomDay[i]);
            ans[1]=Math.max(ans[1],bloomDay[i]);
        }
        for (int i = 0; i <k.length ; i++) {
            int max=bloomDay[i];
            for (int j = i+1; j <i+a ; j++) {
                if(max<bloomDay[j]){
                    max=bloomDay[j];
                }
            }
            k[i]=max;
        }
        return ans;
    }
}
