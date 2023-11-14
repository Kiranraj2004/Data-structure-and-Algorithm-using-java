package array;
//https://leetcode.com/problems/set-matrix-zeroes
import java.util.*;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix={{0,1,0},
                {1,1,1},
                {1,1,1}};
        setZeroes(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }
    public  static void setZeroes(int[][] matrix) {
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
}
