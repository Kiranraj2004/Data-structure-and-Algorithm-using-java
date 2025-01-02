package A2Z_Strivers_DSA.Binary_search.bs_on_ans;

public class Square_root {
    public static void main(String[] args) {

    }
    int floorSqrt(int n) {
        // Your code here
        int ans=0;
        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            long square= (long) mid *mid;
            if(square==n)return mid;
            else if(square<n){
                ans=mid;
                start=mid+1;
            }
            else end=mid-1;
        }
        return ans;
    }

}
