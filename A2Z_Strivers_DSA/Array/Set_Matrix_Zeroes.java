package A2Z_Strivers_DSA.Array;
//https://leetcode.com/problems/set-matrix-zeroes/description/
import  java.util.*;
public class Set_Matrix_Zeroes {
    public static void main(String[] args) {

    }

//    brute force method
    public void setZeroes(int[][] matrix) {
        List<Integer> index=new ArrayList<>();
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if (matrix[i][j]==0){
                    index.add(i);
                    index.add(j);
                }
            }
        }
        for (int i = 0; i <index.size() ; i+=2) {
            int row=index.get(i);
            int col=index.get(i+1);
            for (int j = 0; j <matrix[0].length ; j++) {
                matrix[row][j]=0;
            }
            for (int j = 0; j <matrix.length ; j++) {
                matrix[j][col]=0;
            }
        }
    }

//     optimal solution
    public void setZeroes1(int[][] matrix) {
        boolean col0=false;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    if(j==0)col0=true;
                    else matrix[0][j]=0;
                    matrix[i][0]=0;
                }

            }
        }
        // column  set zero
        for(int i=1;i<n;i++){
            if(matrix[0][i]==0){
                for(int j=1;j<m;j++){
                    matrix[j][i]=0;
                }
            }
        }
        //  row set zero
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        }

        if(col0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }

}
