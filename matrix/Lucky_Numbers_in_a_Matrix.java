package Matrix;
//https://leetcode.com/problems/lucky-numbers-in-a-matriximport java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {
        int[][]matrix={{7,8},
                {1,2}};
        System.out.println(luckyNumbers(matrix));
    }
    public  static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer>answer=new ArrayList<>();
        for (int i = 0; i < matrix.length ; i++) {
            int min=Integer.MAX_VALUE;
            int l=0;
            for (int j = 0; j <matrix[i].length; j++) {
                if (matrix[i][j]<min){
                    min=matrix[i][j];
                    l=j;
                }
            }
            int n=0;
            for (int k = 0; k <matrix.length ; k++) {

                if (matrix[k][l]<matrix[i][l]){
                        n++;
                    }

            }
            if (n==matrix.length-1){
                answer.add(matrix[i][l]);
                return answer;
            }
        }
         return answer;
    }
}
