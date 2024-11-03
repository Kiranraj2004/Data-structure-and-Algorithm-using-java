package A2Z_Strivers_DSA.Array;
import java.util.*;
//https://leetcode.com/problems/spiral-matrix/
public class Spiral_Matrix {
    public static void main(String[] args) {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>res=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,bottom=m-1,left=0,right=n-1;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom&&left<=right;i++){
                res.add(matrix[i][right]);
            }
            right--;
            for(int i=right;i>=left&&top<=bottom;i--){
                res.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top&&right>=left;i--){
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
