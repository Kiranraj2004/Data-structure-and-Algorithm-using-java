package Matrix;
//https://leetcode.com/problems/reshape-the-matrix
import java.util.Arrays;

public class Reshape_the_Matrix {
    public static void main(String[] args) {
        int[][]mat={{1,2},
                {3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat,1,4)));

    }
    public  static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length* mat.length!=r*c){
            return mat;
        }
        int[][]answer=new int[r][c];
        int row=0,col=0;

                for (int k = 0; k <mat.length ; k++) {
                    for (int l = 0; l <mat[k].length ; l++) {
                        answer[row][col]=mat[k][l];
                        col++;
                        if (col==c){
                            col=0;
                            row++;
                        }
                    }

                }
               return answer;
        }
}
