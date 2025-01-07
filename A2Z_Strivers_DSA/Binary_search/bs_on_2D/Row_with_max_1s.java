package A2Z_Strivers_DSA.Binary_search.bs_on_2D;

public class Row_with_max_1s {
    public static void main(String[] args) {

    }



//     optimal solution
    public int rowWithMax1s(int arr[][]) {
        // code here
        int index=-1;
        int max=0;
        for(int i=0;i<arr.length;i++){
            int get=getmax(arr[i]);
            if(get>max){
                max=get;
                index=i;
            }
        }
        return index;
    }
    public int getmax(int[]arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=n;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==0){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return n-ans;
    }
}
