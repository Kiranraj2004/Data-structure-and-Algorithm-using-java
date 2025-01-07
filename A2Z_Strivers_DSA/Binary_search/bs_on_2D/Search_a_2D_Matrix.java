package A2Z_Strivers_DSA.Binary_search.bs_on_2D;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {

    }



//    optimal solution
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int start=0;
        int end=(m*n)-1;
        while(start<=end){
            int mid=(start+end)/2;
            int col=mid%n;
            int row=mid/n;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}
