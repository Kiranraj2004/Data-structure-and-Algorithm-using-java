package Matrix;
//https://leetcode.com/problems/transpose-matrix
import java.util.Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][]matrix={{1,2,3},
                {4,5,6},
                {7,8,9} };
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    public  static int[][] transpose(int[][] matrix) {
      int[][]answer=new int[matrix[0].length][matrix.length];
        for (int i = 0; i < answer.length ; i++) {
            for (int j = 0; j <answer[0].length ; j++) {
                answer[i][j]=matrix[j][i];

            }
        }
        return answer;
    }
}
