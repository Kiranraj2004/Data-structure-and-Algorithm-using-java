package A2Z_Strivers_DSA.Binary_search.bs_on_2D;

public class Search_a_2D_Matrix_II {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(col>=0&&row<matrix.length){
            if(matrix[row][col]==target)return true;
            else if (matrix[row][col]>target)col--;
            else row++;
        }
        return false;
    }
}
