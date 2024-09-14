package leetcodedailyquestion.september;

public class XOR_Queries_of_a_Subarray {
    public static void main(String[] args) {
    }
    public int[] xorQueries(int[] arr, int[][] queries) {
        int []res=new int[queries.length];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]^arr[i-1];
        }
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int j=queries[i][1];
            if(l==0){
                res[i]=arr[j];
            }
            else{
                res[i]=arr[l-1]^arr[j];
            }
        }
        return res;

    }
}
