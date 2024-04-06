package binary_search;

//https://leetcode.com/problems/arranging-coins/description/
public class Arranging_Coins {
    public static void main(String[] args) {
        int n=6;
        System.out.println(arrangecoin(n));
    }
    public static int arrangecoin(int n){
//        int i=0;
//        while(num>=0){
//            num-=i+1;
//            if (num>=0){
//                i++;
//            }
//        }
//        return i;

        long start=1;
        long end=n;
        long mid=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            long coins=(long)(mid*(mid+1))/2;
            if(coins==n){
                return (int) mid;
            }
            else if(coins>n){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return(int) end;
    }
}
